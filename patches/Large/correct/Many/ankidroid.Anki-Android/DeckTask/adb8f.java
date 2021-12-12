diff --git a/src/com/ichi2/anki/DeckTask.java b/src/com/ichi2/anki/DeckTask.java
index c223a53..8e9c44a 100644
--- a/src/com/ichi2/anki/DeckTask.java
+++ b/src/com/ichi2/anki/DeckTask.java
@@ -224,7 +224,7 @@
         AnkiDb ankiDB = AnkiDatabaseManager.getDatabase(deck.getDeckPath());
         ankiDB.getDatabase().beginTransaction();
         try {
-        	publishProgress(new TaskData(deck.addFact(editFact, cardModels) != null));
+        	publishProgress(new TaskData(deck.addFact(editFact, cardModels, false) != null));
             ankiDB.getDatabase().setTransactionSuccessful();
         } finally {
             ankiDB.getDatabase().endTransaction();
