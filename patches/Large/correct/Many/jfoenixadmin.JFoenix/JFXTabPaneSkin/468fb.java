diff --git a/jfoenix/src/main/java/com/jfoenix/skins/JFXTabPaneSkin.java b/jfoenix/src/main/java/com/jfoenix/skins/JFXTabPaneSkin.java
index d8450a8..012b975 100644
--- a/jfoenix/src/main/java/com/jfoenix/skins/JFXTabPaneSkin.java
+++ b/jfoenix/src/main/java/com/jfoenix/skins/JFXTabPaneSkin.java
@@ -100,7 +100,7 @@
         tabsContainerHolder.getChildren().add(tabsContainer);
         tabsClip = new Rectangle();
         tabsContainerHolder.setClip(tabsClip);
-        getChildren().add(tabsContainerHolder);
+        getChildren().add(0, tabsContainerHolder);
 
         // add tabs
         for (Tab tab : getSkinnable().getTabs()) {
