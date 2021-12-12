diff --git a/zeppelin-server/src/main/java/org/apache/zeppelin/socket/NotebookServer.java b/zeppelin-server/src/main/java/org/apache/zeppelin/socket/NotebookServer.java
index a2fa16e..8dfb295 100644
--- a/zeppelin-server/src/main/java/org/apache/zeppelin/socket/NotebookServer.java
+++ b/zeppelin-server/src/main/java/org/apache/zeppelin/socket/NotebookServer.java
@@ -416,7 +416,8 @@
 
     return cronUpdated;
   }
-  private void createNote(WebSocket conn, Notebook notebook, Message message) throws IOException {
+  private void createNote(NotebookSocket conn, Notebook notebook, Message message)
+      throws IOException {
     Note note = notebook.createNote();
     note.addParagraph(); // it's an empty note. so add one paragraph
     if (message != null) {
@@ -429,7 +430,7 @@
 
     note.persist();
     addConnectionToNote(note.id(), (NotebookSocket) conn);
-    broadcastNote(note);
+    conn.send(serializeMessage(new Message(OP.NEW_NOTE).put("note", note)));
     broadcastNoteList();
   }
 
@@ -473,7 +474,7 @@
     String name = (String) fromMessage.get("name");
     Note newNote = notebook.cloneNote(noteId, name);
     addConnectionToNote(newNote.id(), (NotebookSocket) conn);
-    broadcastNote(newNote);
+    conn.send(serializeMessage(new Message(OP.NEW_NOTE).put("note", newNote)));
     broadcastNoteList();
   }
 
