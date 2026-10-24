package com.example.androiduidemo.data

import com.example.androiduidemo.model.*

object MockData {
    val onboardingSteps = listOf(
        OnboardingStep(
            title = "Track your goals",
            description = "Stay focused with real-time insights and smarter routines.",
            accent = "#5A6CF5"
        ),
        OnboardingStep(
            title = "Build healthy habits",
            description = "Follow routines that feel simple, motivating, and sustainable.",
            accent = "#7C9CFF"
        ),
        OnboardingStep(
            title = "Stay in flow",
            description = "See your daily progress and keep momentum without friction.",
            accent = "#8F7EF7"
        )
    )

    val featureProducts = listOf(
        Product(
            id = "watch-001",
            name = "Asteria Smart Watch",
            category = "Wearables",
            price = 399.0,
            rating = 4.8f,
            image = "watch",
            accent = "#5A6CF5",
            description = "Premium smartwatch with 7-day battery life and health tracking."
        ),
        Product(
            id = "earbuds-002",
            name = "Pulse Earbuds",
            category = "Audio",
            price = 129.0,
            rating = 4.7f,
            image = "earbuds",
            accent = "#8AA6FF",
            description = "Immersive sound tuned for focus and everyday listening."
        ),
        Product(
            id = "bottle-003",
            name = "Terra Bottle",
            category = "Lifestyle",
            price = 49.0,
            rating = 4.6f,
            image = "bottle",
            accent = "#7C9CFF",
            description = "Insulated bottle with a sleek design for daily hydration."
        )
    )

    val searchResults = listOf(
        SearchItem("Smartwatch Pro", "Wearables"),
        SearchItem("Nova Lamp", "Home"),
        SearchItem("Pocket Speaker", "Audio"),
        SearchItem("Cinder Bottle", "Lifestyle"),
        SearchItem("Orbit Backpack", "Travel"),
        SearchItem("Pulse Mat", "Fitness")
    )

    val cartItems = listOf(
        CartItem(
            id = "watch-001",
            name = "Asteria Smart Watch",
            quantity = 1,
            price = 399.0,
            accent = "#5A6CF5"
        ),
        CartItem(
            id = "earbuds-002",
            name = "Pulse Earbuds",
            quantity = 1,
            price = 129.0,
            accent = "#8AA6FF"
        ),
        CartItem(
            id = "bottle-003",
            name = "Terra Bottle",
            quantity = 2,
            price = 49.0,
            accent = "#7C9CFF"
        )
    )

    val profileSections = listOf(
        ProfileSection("Wishlist", "12 saved items"),
        ProfileSection("Orders", "7 active orders"),
        ProfileSection("Settings", "Manage account")
    )

    val stats = listOf(
        StatCard("Growth", "+22.4%"),
        StatCard("Tasks", "14 left"),
        StatCard("Projects", "28"),
        StatCard("Level", "Gold")
    )
}
