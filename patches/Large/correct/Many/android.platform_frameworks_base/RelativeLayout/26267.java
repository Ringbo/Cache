diff --git a/core/java/android/widget/RelativeLayout.java b/core/java/android/widget/RelativeLayout.java
index 92c9b93..e03e83d 100644
--- a/core/java/android/widget/RelativeLayout.java
+++ b/core/java/android/widget/RelativeLayout.java
@@ -536,7 +536,7 @@
             // the right of each child view
             width += mPaddingRight;
 
-            if (mLayoutParams.width >= 0) {
+            if (mLayoutParams != null && mLayoutParams.width >= 0) {
                 width = Math.max(width, mLayoutParams.width);
             }
 
@@ -566,7 +566,7 @@
             // the bottom of each child view
             height += mPaddingBottom;
 
-            if (mLayoutParams.height >= 0) {
+            if (mLayoutParams != null && mLayoutParams.height >= 0) {
                 height = Math.max(height, mLayoutParams.height);
             }
 
