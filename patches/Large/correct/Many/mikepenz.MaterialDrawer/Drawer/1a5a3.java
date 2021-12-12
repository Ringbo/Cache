diff --git a/library/src/main/java/com/mikepenz/materialdrawer/Drawer.java b/library/src/main/java/com/mikepenz/materialdrawer/Drawer.java
index 18b1c02..9179a47 100644
--- a/library/src/main/java/com/mikepenz/materialdrawer/Drawer.java
+++ b/library/src/main/java/com/mikepenz/materialdrawer/Drawer.java
@@ -453,7 +453,7 @@
      * @param fireOnClick
      */
     public void setStickyFooterSelection(int identifier, boolean fireOnClick) {
-        setStickyFooterSelectionAtPosition(getPosition(identifier), fireOnClick);
+        setStickyFooterSelectionAtPosition(getStickyFooterPosition(identifier), fireOnClick);
     }
 
     /**
