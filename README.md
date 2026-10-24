# Android UI & Animation Guide

A curated Android learning repository focused on modern UI, Material Design, and motion-driven experiences.

## Overview

This repository is designed for developers who want to build attractive, interactive Android screens with a strong UI foundation. It covers:

- layouts and screen composition
- Material Design system
- animation principles and patterns
- MotionLayout and advanced transitions
- Lottie and vector animation
- Jetpack Compose UI and state-driven animations
- practical UX and micro-interactions

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
├── LICENSE
└── project-notes/
    └── TODO.md
```

## Topics included

### Layout
- ConstraintLayout-based screen design
- cards, lists, and dashboard composition
- spacing and visual hierarchy

### Animation
- alpha, scale, rotation, translation
- object animation
- transitions
- MotionLayout
- Lottie
- Compose animation system

### Material Design
- color system
- typography
- elevation
- shapes and components
- dark mode and premium visuals

### Compose
- `AnimatedVisibility`
- `animateContentSize`
- `animateFloatAsState`
- `rememberInfiniteTransition`
- state-driven motion design

### UX
- micro-interactions
- onboarding motion
- loading states
- bottom sheets and feedback
- accessibility and smooth transitions

## Recommended learning order

1. Layout fundamentals
2. Material Design basics
3. Animation principles
4. MotionLayout / transitions
5. Lottie and loading states
6. Compose animation
7. Build a polished product flow

## Demo app flow

The sample app in this repo includes:

- Login screen
- Onboarding screen
- Home dashboard
- Product detail screen
- Search screen
- Profile screen
- Cart screen
- Bottom sheet examples
- Animated UI and motion feedback

## Example animation snippet

```kotlin
ObjectAnimator.ofFloat(button, "scaleX", 1f, 0.96f, 1f).apply {
    duration = 180
    start()
}
```

## Best practices

- Use motion only when it adds clarity
- Keep transitions smooth and subtle
- Maintain consistent spacing and shadows
- Favor Material 3 styling for a modern look
- Use animation to guide, not distract

## License

MIT
