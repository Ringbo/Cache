diff --git a/core/java/android/text/Layout.java b/core/java/android/text/Layout.java
index c94e489..3bc9390 100644
--- a/core/java/android/text/Layout.java
+++ b/core/java/android/text/Layout.java
@@ -1390,7 +1390,8 @@
         }
 
         float get(final int offset) {
-            if (mHorizontals == null) {
+            if (mHorizontals == null || offset < mLineStartOffset
+                    || offset >= mLineStartOffset + mHorizontals.length) {
                 return getHorizontal(offset, mPrimary);
             } else {
                 return mHorizontals[offset - mLineStartOffset];
