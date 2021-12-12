diff --git a/zeppelin-zengine/src/test/java/org/apache/zeppelin/notebook/NotebookTest.java b/zeppelin-zengine/src/test/java/org/apache/zeppelin/notebook/NotebookTest.java
index 575bb85..0305b21 100644
--- a/zeppelin-zengine/src/test/java/org/apache/zeppelin/notebook/NotebookTest.java
+++ b/zeppelin-zengine/src/test/java/org/apache/zeppelin/notebook/NotebookTest.java
@@ -325,7 +325,7 @@
   @Test
   public void testExportAndImportNote() throws IOException, CloneNotSupportedException,
           InterruptedException {
-    Note note = notebook.createNote();
+    Note note = notebook.createNote(null);
     note.getNoteReplLoader().setInterpreters(factory.getDefaultInterpreterSettingList());
 
     final Paragraph p = note.addParagraph();
@@ -339,7 +339,7 @@
 
     String exportedNoteJson = notebook.exportNote(note.getId());
 
-    Note importedNote = notebook.importNote(exportedNoteJson, "Title");
+    Note importedNote = notebook.importNote(exportedNoteJson, "Title", null);
 
     Paragraph p2 = importedNote.getParagraphs().get(0);
 
@@ -374,7 +374,7 @@
   @Test
   public void testCloneNoteWithExceptionResult() throws IOException, CloneNotSupportedException,
       InterruptedException {
-    Note note = notebook.createNote();
+    Note note = notebook.createNote(null);
     note.getNoteReplLoader().setInterpreters(factory.getDefaultInterpreterSettingList());
 
     final Paragraph p = note.addParagraph();
@@ -386,7 +386,7 @@
     // Force paragraph to have String type object
     p.setResult("Exception");
 
-    Note cloneNote = notebook.cloneNote(note.getId(), "clone note with Exception result");
+    Note cloneNote = notebook.cloneNote(note.getId(), "clone note with Exception result", null);
     Paragraph cp = cloneNote.paragraphs.get(0);
 
     // Keep same ParagraphID
