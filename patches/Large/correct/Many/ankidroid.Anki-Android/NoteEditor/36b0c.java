diff --git a/AnkiDroid/src/main/java/com/ichi2/anki/NoteEditor.java b/AnkiDroid/src/main/java/com/ichi2/anki/NoteEditor.java
index dc393c0..2022a85 100644
--- a/AnkiDroid/src/main/java/com/ichi2/anki/NoteEditor.java
+++ b/AnkiDroid/src/main/java/com/ichi2/anki/NoteEditor.java
@@ -1489,7 +1489,7 @@
 
     private void setNote(Note note) {
         try {
-            if (note == null) {
+            if (note == null || mAddNote) {
                 JSONObject conf = getCol().getConf();
                 JSONObject model = getCol().getModels().current();
                 if (conf.optBoolean("addToCur", true)) {
