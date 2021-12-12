diff --git a/src/main/java/org/jabref/gui/entryeditor/FileAnnotationTab.java b/src/main/java/org/jabref/gui/entryeditor/FileAnnotationTab.java
index 7c6901c..14483ce 100644
--- a/src/main/java/org/jabref/gui/entryeditor/FileAnnotationTab.java
+++ b/src/main/java/org/jabref/gui/entryeditor/FileAnnotationTab.java
@@ -127,7 +127,7 @@
      */
     private void updateShownAnnotations(List<FileAnnotation> annotations) {
         listModel.clear();
-        if (annotations.isEmpty()) {
+        if (annotations == null || annotations.isEmpty()) {
             listModel.addElement(new FileAnnotation("", LocalDateTime.now(), 0, Localization.lang("File has no attached annotations"), NONE, Optional.empty()));
         } else {
             Comparator<FileAnnotation> byPage = Comparator.comparingInt(FileAnnotation::getPage);
