# 03. Hướng dẫn tích hợp animation vào app Android

## Bước 1: Xác định loại animation cần dùng

### Khi nào dùng hiệu ứng nào?

- Click button: scale + ripple + elevation
- Loading: shimmer / progress / Lottie
- Mở màn hình: slide + fade
- List item: staggered fade + translate
- Icon: AnimatedVectorDrawable / Lottie
- UI phức tạp: MotionLayout

## Bước 2: Chọn kỹ thuật phù hợp

### XML + Kotlin

- `ObjectAnimator`
- `Animation` class
- `MotionLayout`
- `LottieAnimationView`

### Compose

- `AnimatedVisibility`
- `animateContentSize`
- `Transition`
- `rememberInfiniteTransition`

## Bước 3: Tích hợp animation cơ bản

### Fade in
```kotlin
ObjectAnimator.ofFloat(textView, "alpha", 0f, 1f).apply {
    duration = 500
    start()
}
```

### Slide up
```kotlin
ObjectAnimator.ofFloat(cardView, "translationY", 100f, 0f).apply {
    duration = 400
    start()
}
```

### Scale button
```kotlin
ObjectAnimator.ofFloat(button, "scaleX", 1f, 0.95f, 1f).apply {
    duration = 200
    start()
}
```

## Bước 4: Chuyển màn hình

### Activity transition XML

`res/anim/slide_in_right.xml`
```xml
<translate xmlns:android="http://schemas.android.com/apk/res/android"
    android:fromXDelta="100%p"
    android:toXDelta="0"
    android:duration="300"/>
```

`res/anim/slide_out_left.xml`
```xml
<translate xmlns:android="http://schemas.android.com/apk/res/android"
    android:fromXDelta="0"
    android:toXDelta="-100%p"
    android:duration="300"/>
```

```kotlin
startActivity(intent)
overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
```

## Bước 5: Dùng MotionLayout

- Tạo file `motion_scene.xml`
- Gắn vào layout root
- Tạo các trạng thái Start / End
- Thiết lập constraints và motion

## Bước 6: Dùng Lottie

Thêm dependency:

```gradle
implementation("com.airbnb.android:lottie:6.4.0")
```

Layout XML:
```xml
<com.airbnb.lottie.LottieAnimationView
    android:id="@+id/lottieView"
    android:layout_width="200dp"
    android:layout_height="200dp"
    app:lottie_rawRes="@raw/loading_animation" />
```

Kotlin:
```kotlin
lottieView.playAnimation()
```

## Bước 7: Thực hành đúng cách

- Không lạm dụng animation trên mọi view
- Giữ thời lượng hợp lý: 200–500ms cho click
- 400–700ms cho transition lớn
- Dễ hiểu, không quá “rối"
- Đừng che mất nội dung chính
- Tối ưu cho performance và dark mode

## Bước 8: Roadmap ưu tiên

1. Button click animation
2. Screen transition animation
3. List item appearance animation
4. Loading & success animation
5. Bottom sheet / dialog motion
6. Onboarding + Lottie
7. Compose animation upgrade

## Kết luận

Cách tốt nhất để tích hợp animation vào app Android là: bắt đầu từ hiệu ứng đơn giản, dùng đúng loại animation cho đúng chức năng, và đảm bảo UI không bị rối mắt.
