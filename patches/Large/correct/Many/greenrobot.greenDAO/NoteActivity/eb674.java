diff --git a/DaoExample/src/main/java/de/greenrobot/daoexample/NoteActivity.java b/DaoExample/src/main/java/de/greenrobot/daoexample/NoteActivity.java
index 48a3ba5..3427cbf 100644
--- a/DaoExample/src/main/java/de/greenrobot/daoexample/NoteActivity.java
+++ b/DaoExample/src/main/java/de/greenrobot/daoexample/NoteActivity.java
@@ -116,7 +116,7 @@
 
         final DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
         String comment = "Added on " + df.format(new Date());
-        Note note = new Note(null, noteText, comment, new Date());
+        Note note = new Note(null, noteText, comment, new Date(), NoteType.TEXT);
         noteDao.insert(note);
         Log.d("DaoExample", "Inserted new note, ID: " + note.getId());
 
