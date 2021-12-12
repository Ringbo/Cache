diff --git a/src/main/java/org/jabref/gui/documentviewer/DocumentViewerControl.java b/src/main/java/org/jabref/gui/documentviewer/DocumentViewerControl.java
index 8e12006..76958ca 100644
--- a/src/main/java/org/jabref/gui/documentviewer/DocumentViewerControl.java
+++ b/src/main/java/org/jabref/gui/documentviewer/DocumentViewerControl.java
@@ -157,7 +157,7 @@
             background.setStyle("-fx-fill: WHITE");
             //imageView.setImage(new WritableImage(getDesiredWidth(), getDesiredHeight()));
             BackgroundTask<Image> generateImage = BackgroundTask
-                    .run(() -> renderPage(initialPage))
+                    .wrap(() -> renderPage(initialPage))
                     .onSuccess(image -> {
                         imageView.setImage(image);
                         progress.setVisible(false);
@@ -197,7 +197,7 @@
             imageView.setOpacity(0);
 
             BackgroundTask<Image> generateImage = BackgroundTask
-                    .run(() -> renderPage(page))
+                    .wrap(() -> renderPage(page))
                     .onSuccess(image -> {
                         imageView.setImage(image);
 
