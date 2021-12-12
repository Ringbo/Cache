diff --git a/core/java/android/text/Layout.java b/core/java/android/text/Layout.java
index 1210f43..84ef943 100644
--- a/core/java/android/text/Layout.java
+++ b/core/java/android/text/Layout.java
@@ -1553,7 +1553,8 @@
         }
 
         float get(final int offset) {
-            if (mHorizontals == null) {
+            if (mHorizontals == null || offset < mLineStartOffset
+                    || offset >= mLineStartOffset + mHorizontals.length) {
                 return getHorizontal(offset, mPrimary);
             } else {
                 return mHorizontals[offset - mLineStartOffset];
