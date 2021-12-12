diff --git a/src/main/java/org/jabref/gui/documentviewer/DocumentViewerControl.java b/src/main/java/org/jabref/gui/documentviewer/DocumentViewerControl.java
index 6fe2da0..8e12006 100644
--- a/src/main/java/org/jabref/gui/documentviewer/DocumentViewerControl.java
+++ b/src/main/java/org/jabref/gui/documentviewer/DocumentViewerControl.java
@@ -39,7 +39,7 @@
     public DocumentViewerControl(TaskExecutor taskExecutor) {
         this.taskExecutor = Objects.requireNonNull(taskExecutor);
 
-        this.getStyleClass().setAll("document-viewer");
+        this.getStyleClass().add("document-viewer");
 
         // External changes to currentPage should result in scrolling to this page
         EasyBind.subscribe(currentPage, this::showPage);
@@ -146,7 +146,7 @@
 
             imageView = new ImageView();
             imageHolder = new StackPane();
-            imageHolder.getStyleClass().setAll("page");
+            imageHolder.getStyleClass().add("page");
 
             // Show progress indicator
             ProgressIndicator progress = new ProgressIndicator();
