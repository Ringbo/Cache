diff --git a/core/java/android/text/Layout.java b/core/java/android/text/Layout.java
index 31147cf..312da86 100644
--- a/core/java/android/text/Layout.java
+++ b/core/java/android/text/Layout.java
@@ -1348,7 +1348,8 @@
         }
 
         float get(final int offset) {
-            if (mHorizontals == null) {
+            if (mHorizontals == null || offset < mLineStartOffset
+                    || offset >= mLineStartOffset + mHorizontals.length) {
                 return getPrimaryHorizontal(offset);
             } else {
                 return mHorizontals[offset - mLineStartOffset];
