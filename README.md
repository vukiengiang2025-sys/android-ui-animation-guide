# Android UI & Animation Guide

Repo này được tạo để gom tất cả các kiến thức, mẫu code và hướng dẫn liên quan đến:

- Android UI / Layout
- Material Design
- View Animation
- Property Animation
- MotionLayout
- AnimatedVectorDrawable
- Lottie
- Jetpack Compose animation
- UX/UI patterns thực tế trong app Android

Mục tiêu: giúp bạn dễ theo dõi, học và áp dụng vào dự án thật.

## Cấu trúc repo

- `README.md` – tổng quan repo
- `docs/01-android-ui-roadmap.md` – lộ trình học Android UI
- `docs/02-animation-types.md` – tổng hợp các loại animation trong Android
- `docs/03-practical-implementation-guide.md` – cách tích hợp animation vào app thực tế
- `examples/01-basic-animations/` – ví dụ animation cơ bản bằng XML + Kotlin
- `examples/02-motionlayout/` – ví dụ MotionLayout
- `examples/03-lottie/` – ví dụ Lottie animation
- `examples/04-compose/` – ví dụ Compose animation

## Học theo thứ tự

1. Layout cơ bản: ConstraintLayout, RecyclerView, CardView
2. Material Design: theme, colors, shape, typography
3. Animation cơ bản: alpha, scale, rotate, translate
4. Property Animation: ObjectAnimator, ValueAnimator
5. MotionLayout: chuyển cảnh và layout animation
6. Lottie: animation phức tạp, loading, onboarding
7. Compose: animation hiện đại trong UI

## Các loại animation cần nắm

- View Animation
- Property Animation
- Transition animation
- MotionLayout
- AnimatedVectorDrawable
- Lottie
- Compose animation

## Mẫu ví dụ nhanh

### 1) Fade in
```kotlin
ObjectAnimator.ofFloat(textView, "alpha", 0f, 1f).apply {
    duration = 500
    start()
}
```

### 2) Scale button click
```kotlin
ObjectAnimator.ofFloat(button, "scaleX", 1f, 0.95f, 1f).apply {
    duration = 200
    start()
}
```

### 3) Di chuyển card
```kotlin
ObjectAnimator.ofFloat(cardView, "translationY", 0f, -20f, 0f).apply {
    duration = 500
    start()
}
```

## Liên kết nhanh

- [Lộ trình học Android UI](docs/01-android-ui-roadmap.md)
- [Các loại animation trong Android](docs/02-animation-types.md)
- [Hướng dẫn tích hợp animation vào app](docs/03-practical-implementation-guide.md)

## Gợi ý phát triển tiếp

Nếu bạn muốn tiến sâu hơn, hãy làm các dự án mini sau:

- App note
- App task manager
- App shopping cart
- App blog/news
- App booking / travel UI

Mỗi dự án nên tập trung vào:

- layout đẹp
- list item animation
- loading state
- navigation transition
- onboarding motion
- dark theme và accessibility

## Tài liệu tham khảo

- Material Design 3
- Jetpack Compose documentation
- Android MotionLayout docs
- Lottie docs

---

Bắt đầu bằng docs trong thư mục `docs/` và các ví dụ trong `examples/`.
