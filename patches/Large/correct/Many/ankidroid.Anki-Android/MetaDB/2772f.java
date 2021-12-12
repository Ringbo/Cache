diff --git a/src/com/ichi2/anki/MetaDB.java b/src/com/ichi2/anki/MetaDB.java
index 521d1b7..b6e4253 100644
--- a/src/com/ichi2/anki/MetaDB.java
+++ b/src/com/ichi2/anki/MetaDB.java
@@ -36,7 +36,7 @@
     }
 
     public static void closeDB() {
-        if (mMetaDb != null && !mMetaDb.isOpen()) {
+        if (mMetaDb != null && mMetaDb.isOpen()) {
             mMetaDb.close();
             Log.i(AnkiDroidApp.TAG, "Closing MetaDB");
         }
