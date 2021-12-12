diff --git a/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/Note.java b/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/Note.java
index 22934d3..f0eae73 100644
--- a/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/Note.java
+++ b/zeppelin-zengine/src/main/java/org/apache/zeppelin/notebook/Note.java
@@ -222,7 +222,7 @@
 
   public void initializeJobListenerForParagraph(Paragraph paragraph) {
     final Note paragraphNote = paragraph.getNote();
-    if (paragraphNote.getId().equals(this.getId())) {
+    if (!paragraphNote.getId().equals(this.getId())) {
       throw new IllegalArgumentException(
           format("The paragraph %s from note %s " + "does not belong to note %s", paragraph.getId(),
               paragraphNote.getId(), this.getId()));
