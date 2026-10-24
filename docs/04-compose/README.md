# 04. Compose

## Overview

Jetpack Compose is the modern way to build Android UI. It is concise, state-driven, and works well with animation.

## Core Compose animation tools

- `AnimatedVisibility`
- `animateContentSize`
- `animateFloatAsState`
- `spring` and `tween`
- `Transition`

## Example

```kotlin
@Composable
fun AnimatedCard() {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .animateContentSize()
            .padding(16.dp)
    ) {
        Text("Hello")
    }
}
```

## Why Compose is useful

- less boilerplate than XML
- easier to build dynamic UI
- powerful state animation APIs
- great for modern app prototypes

## Using Compose in practice

Use Compose for:

- onboarding screens
- data-driven lists
- modern dashboards
- interactive cards

## Recommendation

Learn XML + Material fundamentals first, then use Compose to speed up modern building and prototyping.
