diff --git a/library/src/main/java/com/mikepenz/materialdrawer/Drawer.java b/library/src/main/java/com/mikepenz/materialdrawer/Drawer.java
index 816468e..a6e21fc 100644
--- a/library/src/main/java/com/mikepenz/materialdrawer/Drawer.java
+++ b/library/src/main/java/com/mikepenz/materialdrawer/Drawer.java
@@ -867,7 +867,7 @@
                 return mDrawerItems.get(position - mHeaderOffset);
             }
         } else {
-            if (mDrawerItems != null && mDrawerItems.size() > mCurrentSelection && mCurrentSelection > -1) {
+            if (mDrawerItems != null && mDrawerItems.size() > position && position > -1) {
                 return mDrawerItems.get(position);
             }
         }
@@ -887,7 +887,7 @@
                 return true;
             }
         } else {
-            if (mDrawerItems != null && mDrawerItems.size() > mCurrentSelection && mCurrentSelection > -1) {
+            if (mDrawerItems != null && mDrawerItems.size() > position && position > -1) {
                 return true;
             }
         }
