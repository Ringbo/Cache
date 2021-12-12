diff --git a/core/java/android/text/Layout.java b/core/java/android/text/Layout.java
index 09af85d..c6f73cb 100644
--- a/core/java/android/text/Layout.java
+++ b/core/java/android/text/Layout.java
@@ -1583,7 +1583,8 @@
         }
 
         float get(final int offset) {
-            if (mHorizontals == null) {
+            if (mHorizontals == null || offset < mLineStartOffset
+                    || offset >= mLineStartOffset + mHorizontals.length) {
                 return getHorizontal(offset, mPrimary);
             } else {
                 return mHorizontals[offset - mLineStartOffset];
