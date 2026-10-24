# 01. Layout

## Overview

Good layout is the foundation of every good app. Better layout leads to cleaner hierarchy, clearer navigation, and smoother motion.

## Core layout tools

- `ConstraintLayout`
- `LinearLayout`
- `FrameLayout`
- `RecyclerView`
- `MaterialCardView`
- `BottomNavigationView`

## Best practice

Use `ConstraintLayout` as the main container for modern screens. Combine it with cards, lists, and section spacing to produce a clean dashboard or product UI.

## Key design principles

- keep hierarchy visible
- group items logically
- use consistent spacing scale
- emphasize primary actions
- balance information density

## Example

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/title"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```
