diff --git a/bottom-bar/src/main/java/com/roughike/bottombar/BottomBar.java b/bottom-bar/src/main/java/com/roughike/bottombar/BottomBar.java
index ac1d1aa..6e1d231 100644
--- a/bottom-bar/src/main/java/com/roughike/bottombar/BottomBar.java
+++ b/bottom-bar/src/main/java/com/roughike/bottombar/BottomBar.java
@@ -314,7 +314,7 @@
     private void resizeTabsToCorrectSizes(BottomBarTab[] tabsToAdd) {
         int viewWidth = MiscUtils.pixelToDp(getContext(), getWidth());
 
-        if (viewWidth <= 0) {
+        if (viewWidth <= 0 || viewWidth > screenWidth) {
             viewWidth = screenWidth;
         }
 
