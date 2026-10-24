# Android UI & Animation Guide

A modern repository for learning Android design, UI composition, and animation.

## Why this repo exists

This repo is designed to help you:

- learn Android layout systems
- understand modern UI design patterns
- practice motion and interaction design
- build polished app screens with animation
- move from theory to real UI implementation

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
└── LICENSE
```

## Topics covered

### Layout
- ConstraintLayout
- CardView, MaterialCardView
- RecyclerView and list layouts
- Screen structure and spacing

### Animation
- View animation
- Property animation
- Transition animation
- MotionLayout
- Lottie and vector animation

### Material Design
- colors
- typography
- shape
- elevation
- dark mode
- component hierarchy

### Compose
- `AnimatedVisibility`
- `animateContentSize`
- `spring` and `tween`
- state-based animation

### UX
- micro-interactions
- smooth transitions
- loading states
- accessibility and timing

## Recommended learning order

1. Layout fundamentals
2. Material Design basics
3. Animation types
4. Motion and transitions
5. Lottie and advanced effects
6. Compose patterns
7. Build polished screens in a sample app

## Included sample screens

This repo now includes a sample app flow with:

- Login screen
- Onboarding screen
- Home dashboard
- Detail screen
- Bottom sheet interaction
- Simple motion animation layer

## Start with the docs

- [Layout](docs/01-layout/README.md)
- [Animation](docs/02-animation/README.md)
- [Material](docs/03-material/README.md)
- [Compose](docs/04-compose/README.md)
- [UX](docs/05-ux/README.md)

## Quick example

```kotlin
ObjectAnimator.ofFloat(button, "scaleX", 1f, 0.96f, 1f).apply {
    duration = 180
    start()
}
```

## Suggested path for your app

If you are building a real Android app, start with this order:

- Login screen
- Home dashboard
- Product or item detail
- Loading and success states
- Bottom sheets and dialogs
- Transition animation between screens

## License

MIT
