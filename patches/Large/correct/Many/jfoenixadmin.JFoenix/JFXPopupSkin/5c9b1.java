diff --git a/jfoenix/src/main/java/com/jfoenix/skins/JFXPopupSkin.java b/jfoenix/src/main/java/com/jfoenix/skins/JFXPopupSkin.java
index 30b0c9b..82419f7 100644
--- a/jfoenix/src/main/java/com/jfoenix/skins/JFXPopupSkin.java
+++ b/jfoenix/src/main/java/com/jfoenix/skins/JFXPopupSkin.java
@@ -54,7 +54,9 @@
 
     public JFXPopupSkin(JFXPopup control) {
         this.control = control;
-        scale = new Scale(1, 0, 0, 0);
+        // set scale y to 0.01 instead of 0 to allow layout of the content,
+        // otherwise it will cause exception in traverse engine, when focusing the 1st node
+        scale = new Scale(1, 0.01, 0, 0);
         popupContent = control.getPopupContent();
         container.getStyleClass().add("jfx-popup-container");
         container.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
