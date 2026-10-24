# 04. UI Components and Layout System

## Core UI building blocks

When building Android UI, the most important elements are:

- `TextView`
- `ImageView`
- `Button`
- `EditText`
- `RecyclerView`
- `CardView`
- `Toolbar`
- `BottomNavigationView`
- `TabLayout`
- `ConstraintLayout`

## Common layout patterns

### ConstraintLayout
Use this as the primary layout for modern Android apps.

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/title"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="Welcome"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

### Card-based layout
Use for product cards, lists, and dashboard sections.

```xml
<com.google.android.material.card.MaterialCardView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:cardCornerRadius="18dp"
    app:cardElevation="6dp" />
```

### RecyclerView list
Use for dynamic lists and feed screens.

```kotlin
val adapter = MyAdapter(items)
recyclerView.adapter = adapter
```

## Material Design foundation

Important ideas:

- strong visual hierarchy
- consistent spacing
- color hierarchy
- rounded shapes
- shadows and elevation
- touch affordances
- accessible contrast

## Good UI composition tips

- Keep only one primary action per screen
- Use consistent padding and margins
- Make cards readable and balanced
- Avoid overloading the user with too many effects
- Use color and contrast to guide attention

## Final advice

A good Android UI is not just beautiful—it must also be:

- clear
- consistent
- accessible
- fast
- easy to navigate
