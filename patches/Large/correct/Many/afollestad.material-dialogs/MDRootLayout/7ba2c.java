diff --git a/library/src/main/java/com/afollestad/materialdialogs/internal/MDRootLayout.java b/library/src/main/java/com/afollestad/materialdialogs/internal/MDRootLayout.java
index 6d6054e..45b949c 100644
--- a/library/src/main/java/com/afollestad/materialdialogs/internal/MDRootLayout.java
+++ b/library/src/main/java/com/afollestad/materialdialogs/internal/MDRootLayout.java
@@ -502,7 +502,8 @@
      */
     @Nullable
     private static View getBottomView(ViewGroup viewGroup) {
-        if (viewGroup == null) return null;
+        if (viewGroup == null || viewGroup.getChildCount() == 0)
+            return null;
         View bottomView = null;
         for (int i = viewGroup.getChildCount() - 1; i >= 0; i--) {
             View child = viewGroup.getChildAt(i);
@@ -516,7 +517,7 @@
 
     @Nullable
     private static View getTopView(ViewGroup viewGroup) {
-        if (viewGroup == null)
+        if (viewGroup == null || viewGroup.getChildCount() == 0)
             return null;
         View topView = null;
         for (int i = viewGroup.getChildCount() - 1; i >= 0; i--) {
