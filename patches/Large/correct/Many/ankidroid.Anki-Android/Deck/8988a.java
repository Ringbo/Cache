diff --git a/src/com/ichi2/anki/Deck.java b/src/com/ichi2/anki/Deck.java
index 1add5bf..b4fce42 100644
--- a/src/com/ichi2/anki/Deck.java
+++ b/src/com/ichi2/anki/Deck.java
@@ -1411,7 +1411,7 @@
     @SuppressWarnings("unused")
     private void _fillRevEarlyQueue() {
         if ((mRevCount != 0) && mRevQueue.isEmpty()) {
-            String sql = "SELECT id, factId, combinedDue FROM cards WHERE type = 1 AND combinedDue > " + dueCutoff
+            String sql = "SELECT id, factId, combinedDue FROM cards WHERE type = 1 AND combinedDue > " + mDueCutoff
                     + " ORDER BY combinedDue LIMIT " + mQueueLimit;
             Cursor cur = getDB().getDatabase().rawQuery(sql, null);
             while (cur.moveToNext()) {
