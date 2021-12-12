diff --git a/src/com/fsck/k9/mail/store/LockableDatabase.java b/src/com/fsck/k9/mail/store/LockableDatabase.java
index f30deea..5d25424 100644
--- a/src/com/fsck/k9/mail/store/LockableDatabase.java
+++ b/src/com/fsck/k9/mail/store/LockableDatabase.java
@@ -371,12 +371,12 @@
         try {
             final File databaseFile = prepareStorage(mStorageProviderId);
             try {
-                mDb = application.openOrCreateDatabase(databaseFile.getPath(), Context.MODE_PRIVATE, null);
+                mDb = application.openOrCreateDatabase(databaseFile.getName(), Context.MODE_PRIVATE, null);
             } catch (SQLiteException e) {
                 // try to gracefully handle DB corruption - see issue 2537
                 Log.w(K9.LOG_TAG, "Unable to open DB " + databaseFile + " - removing file and retrying", e);
                 databaseFile.delete();
-                mDb = application.openOrCreateDatabase(databaseFile.getPath(), Context.MODE_PRIVATE, null);
+                mDb = application.openOrCreateDatabase(databaseFile.getName(), Context.MODE_PRIVATE, null);
             }
             if (mDb.getVersion() != mSchemaDefinition.getVersion()) {
                 mSchemaDefinition.doDbUpgrade(mDb);
