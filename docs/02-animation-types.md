# 02. Các loại animation trong Android

## 1) View Animation

Dùng với View đơn giản. Tạo hiệu ứng cơ bản như:

- alpha
- scale
- rotate
- translate

Ví dụ:

```kotlin
val fade = AlphaAnimation(0f, 1f)
fade.duration = 500
textView.startAnimation(fade)
```

Ưu điểm:
- dễ dùng
- phù hợp hiệu ứng đơn giản

Nhược điểm:
- chỉ thay đổi giao diện, không thay đổi state thật của view

## 2) Property Animation

Phổ biến nhất trong Android hiện đại:

- `ObjectAnimator`
- `ValueAnimator`
- `AnimatorSet`

Ví dụ:

```kotlin
ObjectAnimator.ofFloat(button, "scaleX", 1f, 0.9f, 1f).apply {
    duration = 200
    start()
}
```

## 3) Transition Animation

Dùng cho màn hình, fragment, activity và shared element:

- activity transition
- fragment transition
- shared element

Ví dụ:

```kotlin
startActivity(intent)
overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
```

## 4) MotionLayout

Công cụ mạnh để làm animation phức tạp:

- collapse/expand
- scroll animation
- màn hình onboarding
- toolbar animation
- bottom sheet

## 5) AnimatedVectorDrawable

Dùng cho icon animation:

- menu → close
- favorite button
- loading icon

## 6) Lottie

Animation JSON đẹp, dễ dùng, đa dạng:

- loading
- check success
- onboarding illustration
- marketing motion

## 7) Compose animation

Compose có nhiều API hỗ trợ animation:

- `animateFloatAsState`
- `animateContentSize`
- `AnimatedVisibility`
- `Transition`

Ví dụ:

```kotlin
var visible by remember { mutableStateOf(true) }

AnimatedVisibility(visible = visible) {
    Text("Hello animation")
}
```

## Kết luận

Nếu app của bạn cần hiệu ứng nhanh, chọn:

- `ObjectAnimator` / `ValueAnimator`

Nếu cần animation giao diện phức tạp:

- MotionLayout

Nếu cần animation hình ảnh/illustration:

- Lottie

Nếu cần UI hiện đại và code gọn:

- Jetpack Compose
