diff --git a/lib/java/com/google/android/material/tabs/TabLayout.java b/lib/java/com/google/android/material/tabs/TabLayout.java
index 35eb052..d9db107 100644
--- a/lib/java/com/google/android/material/tabs/TabLayout.java
+++ b/lib/java/com/google/android/material/tabs/TabLayout.java
@@ -415,7 +415,12 @@
 
     TypedArray a =
         ThemeEnforcement.obtainStyledAttributes(
-            context, attrs, R.styleable.TabLayout, defStyleAttr, R.style.Widget_Design_TabLayout);
+            context,
+            attrs,
+            R.styleable.TabLayout,
+            defStyleAttr,
+            R.style.Widget_Design_TabLayout,
+            R.styleable.TabLayout_tabTextAppearance);
 
     slidingTabIndicator.setSelectedIndicatorHeight(
         a.getDimensionPixelSize(R.styleable.TabLayout_tabIndicatorHeight, -1));
