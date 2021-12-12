diff --git a/core/java/android/text/StaticLayout.java b/core/java/android/text/StaticLayout.java
index 94ce57a..239f2d0 100644
--- a/core/java/android/text/StaticLayout.java
+++ b/core/java/android/text/StaticLayout.java
@@ -683,7 +683,7 @@
                 // interface.
                 int leftLen = mLeftIndents == null ? 0 : mLeftIndents.length;
                 int rightLen = mRightIndents == null ? 0 : mRightIndents.length;
-                int indentsLen = Math.max(1, Math.min(leftLen, rightLen) - mLineCount);
+                int indentsLen = Math.max(1, Math.max(leftLen, rightLen) - mLineCount);
                 int[] indents = new int[indentsLen];
                 for (int i = 0; i < indentsLen; i++) {
                     int leftMargin = mLeftIndents == null ? 0 :
