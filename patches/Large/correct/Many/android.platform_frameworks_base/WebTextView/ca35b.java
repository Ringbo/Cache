diff --git a/core/java/android/webkit/WebTextView.java b/core/java/android/webkit/WebTextView.java
index 33f84a5..521d94c 100644
--- a/core/java/android/webkit/WebTextView.java
+++ b/core/java/android/webkit/WebTextView.java
@@ -832,7 +832,7 @@
             TextView tv =
                     (TextView) super.getView(position, convertView, parent);
             if (tv != null && mTextView != null) {
-                tv.setTextSize(mTextView.getTextSize());
+                tv.setTextSize(TypedValue.COMPLEX_UNIT_PX, mTextView.getTextSize());
             }
             return tv;
         }
