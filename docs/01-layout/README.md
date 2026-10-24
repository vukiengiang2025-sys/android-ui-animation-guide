# 01. Layout

## Overview

Layout is the foundation of Android UI. Good layout design determines readability, alignment, hierarchy, and overall app quality.

## Main layout tools

- `LinearLayout`
- `RelativeLayout`
- `ConstraintLayout`
- `RecyclerView`
- `FrameLayout`
- `CardView`
- `MaterialCardView`

## Preferred approach

For modern Android, `ConstraintLayout` is the best default choice.

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/title"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="Hello"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

## Layout principles

- Use consistent spacing
- Keep hierarchy simple
- Use padding and margins intentionally
- Group related content into cards or sections
- Make primary actions obvious

## Screen composition ideas

- hero header
- summary cards
- action buttons
- list section
- detail description area

## Best practice

Use Material Design spacing and alignment rules. A clean layout is the baseline for good animation.
