diff --git a/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmSyncService.java b/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmSyncService.java
index be2279a..67e1c0c 100644
--- a/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmSyncService.java
+++ b/astrid/plugin-src/com/todoroo/astrid/actfm/sync/ActFmSyncService.java
@@ -450,7 +450,7 @@
                     for(cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
                         metadata.readFromCursor(cursor);
                         if(metadata.containsNonNullValue(TagMetadata.TAG_UUID) &&
-                                metadata.getValue(TagMetadata.TAG_UUID) > 0) {
+                                metadata.getValue(TagMetadata.TAG_UUID) != 0) {
                             params.add("tag_ids[]");
                             params.add(metadata.getValue(TagMetadata.TAG_UUID));
                         } else {
