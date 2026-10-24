# 02. Animation

## Overview

Animation in Android is used to provide feedback, create flow, and make the app feel responsive and premium.

## Main animation types

### View animation
Simple visual movement on a view.

```kotlin
val fade = AlphaAnimation(0f, 1f)
fade.duration = 500
textView.startAnimation(fade)
```

### Property animation
Best for modern apps.

```kotlin
ObjectAnimator.ofFloat(button, "scaleY", 1f, 0.9f, 1f).apply {
    duration = 200
    start()
}
```

### Transition animation
For activity/fragment navigation and shared elements.

### MotionLayout
For richer screen and layout animations.

### Lottie
For complex illustrated animations.

## When to use which

- Click feedback: property animation
- Loading states: Lottie / shimmer / progress
- Screen entry: slide/fade transition
- Complex flow: MotionLayout
- Illustration: Lottie

## Good animation rules

- Keep it subtle
- Make motion meaningful
- Avoid overusing effects
- Respect user motion preferences
