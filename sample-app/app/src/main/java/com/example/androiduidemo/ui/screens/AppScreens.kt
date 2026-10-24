package com.example.androiduidemo.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddShoppingCart
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DemoApp() {
    var onboardingShown by remember { mutableStateOf(true) }

    if (onboardingShown) {
        OnboardingScreen(onContinue = { onboardingShown = false })
    } else {
        AppShell()
    }
}

@Composable
fun OnboardingScreen(onContinue: () -> Unit) {
    var step by remember { mutableStateOf(0) }
    val items = listOf(
        "Smooth motion" to "Premium UI starts with intent and rhythm.",
        "Clear hierarchy" to "Your screens feel calm, readable, and focused.",
        "Fast feedback" to "Every click, swipe, and action feels responsive."
    )

    val currentTitle = items[step].first
    val currentDesc = items[step].second

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        AnimatedVisibility(
            visible = true,
            enter = fadeIn(animationSpec = tween(500)) + slideInVertically { it / 3 },
            exit = fadeOut()
        ) {
            Text(
                text = "Design with motion",
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.onBackground
            )
        }

        Spacer(modifier = Modifier.height(28.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp),
            shape = RoundedCornerShape(26.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.12f)
            )
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = currentTitle,
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = currentDesc,
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.7f)
        )

        Spacer(modifier = Modifier.height(28.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (step > 0) {
                Text(
                    text = "Back",
                    modifier = Modifier.clickable { step-- },
                    color = MaterialTheme.colorScheme.primary
                )
            } else {
                Spacer(modifier = Modifier.width(48.dp))
            }

            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                repeat(items.size) { index ->
                    Box(
                        modifier = Modifier
                            .size(if (index == step) 10.dp else 8.dp)
                            .clip(CircleShape)
                            .background(
                                if (index == step)
                                    MaterialTheme.colorScheme.primary
                                else
                                    MaterialTheme.colorScheme.primary.copy(alpha = 0.35f)
                            )
                    )
                }
            }

            Text(
                text = if (step < items.lastIndex) "Next" else "Start",
                modifier = Modifier.clickable {
                    if (step < items.lastIndex) step++ else onContinue()
                },
                color = MaterialTheme.colorScheme.primary,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun AppShell() {
    var selectedTab by remember { mutableStateOf(0) }

    Scaffold(
        bottomBar = {
            NavigationBar {
                val items = listOf(
                    BottomNavItem("Home", Icons.Default.Home),
                    BottomNavItem("Search", Icons.Default.Search),
                    BottomNavItem("Cart", Icons.Default.ShoppingCart),
                    BottomNavItem("Profile", Icons.Default.Person)
                )

                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = selectedTab == index,
                        onClick = { selectedTab = index },
                        icon = { Icon(item.icon, contentDescription = item.title) },
                        label = { Text(item.title) }
                    )
                }
            }
        }
    ) { padding ->
        Surface(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            when (selectedTab) {
                0 -> HomeScreen()
                1 -> SearchScreen()
                2 -> CartScreen()
                else -> ProfileScreen()
            }
        }
    }
}

@Composable
fun HomeScreen() {
    var expanded by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Good evening",
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.onBackground
        )

        AnimatedVisibility(
            visible = expanded,
            enter = fadeIn() + slideInVertically(animationSpec = spring(Spring.DampingRatioLowBouncy)),
            exit = fadeOut() + slideOutVertically()
        ) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(28.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primary)
            ) {
                Column(
                    modifier = Modifier.padding(20.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Text("Balance", color = Color.White.copy(alpha = 0.8f))
                    Text("$12,480", color = Color.White, style = MaterialTheme.typography.headlineLarge)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("+12.6% this month", color = Color.White.copy(alpha = 0.8f))
                }
            }
        }

        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            StatCard(title = "Growth", value = "+22.4%")
            StatCard(title = "Tasks", value = "14 left")
        }

        Text(
            text = "Featured",
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.onBackground
        )

        val featured = listOf(
            "Asteria smart watch" to "$399",
            "Air pulse earbuds" to "$129",
            "Flow backpack" to "$89"
        )

        featured.forEachIndexed { index, pair ->
            ProductCard(
                title = pair.first,
                price = pair.second,
                modifier = Modifier.animateEnterExit(
                    enter = fadeIn(animationSpec = tween(300, delayMillis = index * 120)) +
                        slideInVertically { it / 3 },
                    exit = fadeOut()
                )
            )
        }

        Button(
            onClick = { expanded = !expanded },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
        ) {
            Text(if (expanded) "Collapse overview" else "Expand overview")
        }
    }
}

@Composable
fun SearchScreen() {
    var query by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Search",
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.onBackground
        )

        OutlinedTextField(
            value = query,
            onValueChange = { query = it },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("Search products, collections...") },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = MaterialTheme.colorScheme.surface,
                unfocusedContainerColor = MaterialTheme.colorScheme.surface
            )
        )

        val results = listOf(
            "Smartwatch Pro" to "Wearables",
            "Nova Lamp" to "Home",
            "Pocket Speaker" to "Audio",
            "Cinder Bottle" to "Lifestyle"
        )

        results.forEachIndexed { index, item ->
            SearchResultRow(
                title = item.first,
                category = item.second,
                index = index
            )
        }
    }
}

@Composable
fun CartScreen() {
    val items = listOf(
        "Asteria watch" to "$399",
        "Wave earbuds" to "$129",
        "Neo bottle" to "$24"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Cart",
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.onBackground
        )

        items.forEachIndexed { index, item ->
            CartItemRow(item.first, item.second, index)
        }

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(24.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Column(Modifier.padding(18.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text("Subtotal")
                    Text("$552")
                }
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text("Shipping")
                    Text("$12")
                }
                Spacer(modifier = Modifier.height(12.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text("Total", fontWeight = FontWeight.Bold)
                    Text("$564", fontWeight = FontWeight.Bold)
                }
            }
        }

        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
        ) {
            Text("Checkout")
        }
    }
}

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.14f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.size(48.dp)
                )
            }

            Spacer(modifier = Modifier.width(14.dp))

            Column {
                Text("Alicia Jordan", style = MaterialTheme.typography.titleLarge)
                Text("Product designer", color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.7f))
            }
        }

        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            StatCard(title = "Projects", value = "28")
            StatCard(title = "Level", value = "Gold")
        }

        val profileItems = listOf(
            "Wishlist" to "12 saved items",
            "Orders" to "7 active",
            "Settings" to "Manage account"
        )

        profileItems.forEachIndexed { index, item ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { },
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(item.first, fontWeight = FontWeight.SemiBold)
                        Text(item.second, color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f))
                    }
                    Text("›")
                }
            }
        }
    }
}

@Composable
fun ProductCard(title: String, price: String, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(title, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.SemiBold)
                Text("Premium pick", color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f))
            }
            Text(price, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.primary)
        }
    }
}

@Composable
fun StatCard(title: String, value: String) {
    Card(
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier.width(160.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(title, color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f))
            Spacer(modifier = Modifier.height(8.dp))
            Text(value, style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun SearchResultRow(title: String, category: String, index: Int) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .animateEnterExit(
                enter = fadeIn(animationSpec = tween(300, delayMillis = index * 100)) +
                    slideInVertically { it / 3 },
                exit = fadeOut()
            ),
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(title, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.SemiBold)
                Text(category, color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f))
            }
            Icon(Icons.Default.Search, contentDescription = null)
        }
    }
}

@Composable
fun CartItemRow(title: String, price: String, index: Int) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .animateEnterExit(
                enter = fadeIn(animationSpec = tween(250, delayMillis = index * 90)) +
                    slideInVertically { it / 4 },
                exit = fadeOut()
            ),
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(title, fontWeight = FontWeight.SemiBold)
                Text("Quantity: 1", color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f))
            }
            Text(price, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.primary)
        }
    }
}

data class BottomNavItem(
    val title: String,
    val icon: ImageVector
)
