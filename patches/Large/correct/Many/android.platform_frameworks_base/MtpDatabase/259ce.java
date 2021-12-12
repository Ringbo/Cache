diff --git a/packages/MtpDocumentsProvider/src/com/android/mtp/MtpDatabase.java b/packages/MtpDocumentsProvider/src/com/android/mtp/MtpDatabase.java
index 4afffea..8e1a0b2 100644
--- a/packages/MtpDocumentsProvider/src/com/android/mtp/MtpDatabase.java
+++ b/packages/MtpDocumentsProvider/src/com/android/mtp/MtpDatabase.java
@@ -368,7 +368,7 @@
         values.put(Document.COLUMN_DISPLAY_NAME, root.getRootName(resources));
         values.putNull(Document.COLUMN_SUMMARY);
         values.putNull(Document.COLUMN_LAST_MODIFIED);
-        values.putNull(Document.COLUMN_ICON);
+        values.put(Document.COLUMN_ICON, R.drawable.ic_root_mtp);
         values.put(Document.COLUMN_FLAGS, 0);
         values.put(Document.COLUMN_SIZE,
                 (int) Math.min(root.mMaxCapacity - root.mFreeSpace, Integer.MAX_VALUE));
