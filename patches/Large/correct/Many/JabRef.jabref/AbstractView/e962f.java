diff --git a/src/main/java/org/jabref/gui/AbstractView.java b/src/main/java/org/jabref/gui/AbstractView.java
index 1b521d1..79df1bb 100644
--- a/src/main/java/org/jabref/gui/AbstractView.java
+++ b/src/main/java/org/jabref/gui/AbstractView.java
@@ -22,7 +22,7 @@
         Parent view = super.getView();
 
         // Add our base css file
-        view.getStylesheets().add(AbstractDialogView.class.getResource("Main.css").toExternalForm());
+        view.getStylesheets().add(0, AbstractDialogView.class.getResource("Main.css").toExternalForm());
 
         // Notify controller about the stage, where it is displayed
         view.sceneProperty().addListener((observable, oldValue, newValue) -> {
