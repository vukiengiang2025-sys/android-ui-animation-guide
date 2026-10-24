# 02. Animation

## Overview

Animation helps the product feel alive and responsive. Used well, it creates confidence and polish. Used poorly, it distracts users.

## Main animation types

- `AlphaAnimation`
- `TranslateAnimation`
- `RotateAnimation`
- `ScaleAnimation`
- `ObjectAnimator`
- `ValueAnimator`
- `AnimatorSet`
- `Transition`
- `MotionLayout`
- `Lottie`

## Good rule

Use animation to direct attention and confirm actions, not to decorate every item in the UI.

## Example

```kotlin
ObjectAnimator.ofFloat(button, "translationY", 0f, -10f, 0f).apply {
    duration = 250
    start()
}
```
