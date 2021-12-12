diff --git a/core/java/android/widget/Spinner.java b/core/java/android/widget/Spinner.java
index 24f0231..60422ae 100644
--- a/core/java/android/widget/Spinner.java
+++ b/core/java/android/widget/Spinner.java
@@ -153,7 +153,7 @@
 
             DropdownPopup popup = new DropdownPopup(context, attrs, defStyle, hintResource);
 
-            popup.setWidth(a.getDimensionPixelSize(
+            popup.setWidth(a.getLayoutDimension(
                     com.android.internal.R.styleable.Spinner_dropDownWidth,
                     ViewGroup.LayoutParams.WRAP_CONTENT));
             popup.setBackgroundDrawable(a.getDrawable(
