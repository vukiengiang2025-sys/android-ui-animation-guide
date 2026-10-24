# 04. Compose

## Overview

Jetpack Compose makes UI creation faster and more declarative.

## Common animation APIs

- `AnimatedVisibility`
- `animateContentSize`
- `animateFloatAsState`
- `rememberInfiniteTransition`
- `spring` and `tween`

## Example

```kotlin
AnimatedVisibility(visible = expanded) {
    Text("Expanded content")
}
```

## Recommended workflow

Learn XML + Material first, then use Compose for smoother prototypes and modern app UIs.
