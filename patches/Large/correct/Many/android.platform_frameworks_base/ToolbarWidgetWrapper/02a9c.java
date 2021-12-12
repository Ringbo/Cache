diff --git a/core/java/com/android/internal/widget/ToolbarWidgetWrapper.java b/core/java/com/android/internal/widget/ToolbarWidgetWrapper.java
index b298d85..5c2e805 100644
--- a/core/java/com/android/internal/widget/ToolbarWidgetWrapper.java
+++ b/core/java/com/android/internal/widget/ToolbarWidgetWrapper.java
@@ -480,7 +480,7 @@
 
     private void ensureSpinner() {
         if (mSpinner == null) {
-            mSpinner = new Spinner(getContext());
+            mSpinner = new Spinner(getContext(), null, R.attr.actionDropDownStyle);
             Toolbar.LayoutParams lp = new Toolbar.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                     ViewGroup.LayoutParams.WRAP_CONTENT, Gravity.START | Gravity.CENTER_VERTICAL);
             mSpinner.setLayoutParams(lp);
