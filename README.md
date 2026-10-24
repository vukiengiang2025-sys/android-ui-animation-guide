# Android UI & Animation Guide

A curated learning repository for Android interface design and animation.

This repo helps you study how to build modern, interactive, and polished Android screens using:

- Android layouts and UI components
- Material Design principles
- View Animation and Property Animation
- MotionLayout and screen transitions
- Lottie and vector animations
- Jetpack Compose animation APIs
- Real-world UI patterns and interaction design

## What is inside

- `docs/` — theory, roadmap, UI fundamentals, design patterns
- `examples/` — sample code snippets for basic and advanced UI animation
- `sample-app/` — a mini Android app demo with a polished screen and animation flow

## Recommended learning path

1. Android UI fundamentals
2. Material Design and component hierarchy
3. Animation basics
4. Property animation and screen transitions
5. MotionLayout and advanced interactions
6. Lottie / vector animation
7. Compose animation and polished UX

## Repository structure

```text
android-ui-animation-guide/
├── README.md
├── docs/
│   ├── 01-android-ui-roadmap.md
│   ├── 02-animation-types.md
│   ├── 03-practical-implementation-guide.md
│   ├── 04-ui-components.md
│   └── 05-ux-patterns.md
├── examples/
│   ├── 01-basic-animations/
│   ├── 02-motionlayout/
│   ├── 03-lottie/
│   ├── 04-compose/
│   └── 05-advanced-ui/
├── sample-app/
│   ├── build.gradle.kts
│   ├── settings.gradle.kts
│   └── app/
│       ├── build.gradle.kts
│       └── src/main/
│           ├── java/com/example/androiduidemo/
│           └── res/
└── LICENSE
```

## Quick start

### 1) Learn the basics
Open the docs in this order:

- [01-android-ui-roadmap.md](docs/01-android-ui-roadmap.md)
- [02-animation-types.md](docs/02-animation-types.md)
- [03-practical-implementation-guide.md](docs/03-practical-implementation-guide.md)

### 2) Review code examples
Study the examples in `examples/` to understand how different animations are applied in real screens.

### 3) Run the sample app
Open `sample-app/` as a starter Android project and run it in Android Studio.

## Core topics covered

- ConstraintLayout and screen composition
- Button interactions and ripple feedback
- Card, image, list, and navigation patterns
- Fade, scale, translate, and rotate animations
- `ObjectAnimator`, `ValueAnimator`, and `AnimatorSet`
- MotionLayout for interactive transitions
- Lottie animation integration
- Compose animation APIs
- Dark mode, elevation, shape, and spacing
- Real UX and micro-interaction ideas

## Example animation types

### Basic animation
```kotlin
ObjectAnimator.ofFloat(button, "scaleX", 1f, 0.95f, 1f).apply {
    duration = 200
    start()
}
```

### Fade in
```kotlin
ObjectAnimator.ofFloat(titleText, "alpha", 0f, 1f).apply {
    duration = 500
    start()
}
```

### MotionLayout transition
Use a `MotionScene` to animate element positions and sizes across two states.

### Compose animation
```kotlin
AnimatedVisibility(
    visible = visible,
    enter = fadeIn() + slideInVertically()
) {
    Text("Hello Android UI")
}
```

## Suggested practice projects

- To-do app
- Shopping app UI
- News app
- Travel booking screen
- Fitness dashboard
- Onboarding flow with Lottie

## License

This project is licensed under the MIT License.
