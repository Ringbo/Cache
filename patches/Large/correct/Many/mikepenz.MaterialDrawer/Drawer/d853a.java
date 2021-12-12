diff --git a/library/src/main/java/com/mikepenz/materialdrawer/Drawer.java b/library/src/main/java/com/mikepenz/materialdrawer/Drawer.java
index 078aa47..b8e5a26 100644
--- a/library/src/main/java/com/mikepenz/materialdrawer/Drawer.java
+++ b/library/src/main/java/com/mikepenz/materialdrawer/Drawer.java
@@ -1777,7 +1777,7 @@
      */
     private void resetStickyFooterSelection() {
         if (mStickyFooterView instanceof LinearLayout) {
-            for (int i = 1; i < ((LinearLayout) mStickyFooterView).getChildCount(); i++) {
+            for (int i = 0; i < ((LinearLayout) mStickyFooterView).getChildCount(); i++) {
                 if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
                     ((LinearLayout) mStickyFooterView).getChildAt(i).setActivated(false);
                 }
