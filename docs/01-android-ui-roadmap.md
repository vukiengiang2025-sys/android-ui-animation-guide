# 01. Lộ trình học Android UI từ zero

## Mục tiêu

Bạn muốn làm app Android đẹp và có animation hiệu ứng. Nên học theo từng lớp kiến thức:

1. Layout và cấu trúc giao diện
2. Components và Material Design
3. Animation cơ bản
4. Animation nâng cao
5. Motion / UX
6. Compose và kiến trúc hiện đại

## Bước 1: Layout

Học các layout chính:

- `LinearLayout`
- `RelativeLayout`
- `ConstraintLayout`
- `RecyclerView`
- `ViewPager2`
- `CardView`

### Ví dụ uỷ quyền

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/title"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="Hello Android"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"/>

</androidx.constraintlayout.widget.ConstraintLayout>
```

## Bước 2: Material Design

Nên nắm các khái niệm:

- colors
- typography
- spacing
- shape
- elevation
- dark theme
- ripple effect
- state layers

## Bước 3: Animation cơ bản

- alpha
- scale
- translation
- rotate
- fade in/out

## Bước 4: Property Animation

Sử dụng:

- `ObjectAnimator`
- `ValueAnimator`
- `AnimatorSet`

Ví dụ:

```kotlin
val animator = ObjectAnimator.ofFloat(button, "translationY", 0f, -20f, 0f)
animator.duration = 500
animator.start()
```

## Bước 5: Motion + UX

- `MotionLayout`
- `Fragment` transition
- screen transitions
- bottom sheet
- onboarding
- swipe gesture

## Bước 6: Lottie và đồ họa động

- animation icon
- loading animation
- danh sách animation đẹp
- onboarding flow

## Bước 7: Compose

Nếu muốn hiện đại hơn, học tiếp:

- `@Composable`
- `animateContentSize()`
- `AnimatedVisibility`
- `rememberInfiniteTransition`
- `spring` / `tween`

## Gợi ý thực hành

Mỗi tuần bạn nên làm 1 màn hình UI và bổ sung 1 kiểu animation:

- Tuần 1: Login screen
- Tuần 2: Home screen
- Tuần 3: List item animation
- Tuần 4: Bottom sheet & dialog
- Tuần 5: MotionLayout & onboarding
- Tuần 6: Lottie + loading

## Kết luận

Bạn nên học từ dễ đến nâng cao: layout → component → style → animation → motion → UX → Compose.
