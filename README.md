# Android UI & Animation Guide

A modern Android learning repository focused on UI composition, Material Design, and motion-driven app experiences.

## Overview

This repo is designed for developers who want to build clean, premium-feeling Android app interfaces with a strong understanding of:

- layout systems
- Material Design and theming
- animations and micro-interactions
- screen flows and product UX
- Compose-based modern UI design

## Included content

- `docs/` with topic-based material for layout, animation, Material, Compose, and UX
- `examples/` with XML + Kotlin examples for animation and MotionLayout
- `sample-app/` with a Compose-first demo app covering login, onboarding, home, search, cart, and profile screens

## Repository structure

```text
android-ui-animation-guide/
├── README.md
├── docs/
│   ├── 01-layout/
│   ├── 02-animation/
│   ├── 03-material/
│   ├── 04-compose/
│   └── 05-ux/
├── examples/
│   ├── 01-basic-animations/
│   ├── 02-motionlayout/
│   ├── 03-lottie/
│   └── 04-compose/
├── sample-app/
│   ├── app/
│   ├── build.gradle.kts
│   └── settings.gradle.kts
├── project-notes/
│   └── TODO.md
├── LICENSE
└── .gitignore
```

## Demo app flow

The sample app now includes a modern product flow with:

- Login screen
- Onboarding screen
- Home dashboard
- Search screen
- Cart screen
- Profile screen
- Material 3 theme
- Compose-based animation and motion UI

## Topics covered

### Layout
- ConstraintLayout
- cards and section layout
- spacing and hierarchy
- reusable dashboard blocks

### Animation
- button scale and feedback
- staggered list reveal
- composed motion transitions
- bottom sheet and popup motion
- onboarding and loading feedback

### Material Design
- color system
- typography
- surface style
- shapes
- elevation
- responsive UI spacing

### Compose
- `AnimatedVisibility`
- `animateContentSize`
- `animateFloatAsState`
- `rememberInfiniteTransition`
- Material 3 styling

### UX
- micro-interactions
- navigation feedback
- accessibility-friendly motion
- onboarding and summary flows

## Quick example

```kotlin
AnimatedVisibility(
    visible = expanded,
    enter = fadeIn() + slideInVertically()
) {
    Text("Expanded content")
}
```

## Suggested learning order

1. Layout fundamentals
2. Material Design language
3. Animation basics and timing
4. MotionLayout and transitions
5. Lottie and advanced motion
6. Jetpack Compose UI patterns
7. Build a full premium app flow

## License

MIT
