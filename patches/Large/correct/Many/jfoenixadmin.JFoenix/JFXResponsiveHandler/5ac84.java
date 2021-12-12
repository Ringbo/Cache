diff --git a/jfoenix/src/main/java/com/jfoenix/responsive/JFXResponsiveHandler.java b/jfoenix/src/main/java/com/jfoenix/responsive/JFXResponsiveHandler.java
index f917f83..b6a6bcc 100644
--- a/jfoenix/src/main/java/com/jfoenix/responsive/JFXResponsiveHandler.java
+++ b/jfoenix/src/main/java/com/jfoenix/responsive/JFXResponsiveHandler.java
@@ -61,7 +61,7 @@
      * @param pseudoClass css class for certain device
      */
     public JFXResponsiveHandler(Stage stage, PseudoClass pseudoClass) {
-        scanAllNodes(stage.getScene().getRoot(), PSEUDO_CLASS_LARGE);
+        scanAllNodes(stage.getScene().getRoot(), pseudoClass);
     }
 
     /**
