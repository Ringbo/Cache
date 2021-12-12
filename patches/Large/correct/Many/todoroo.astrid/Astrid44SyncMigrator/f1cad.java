diff --git a/astrid/plugin-src/com/todoroo/astrid/tags/Astrid44SyncMigrator.java b/astrid/plugin-src/com/todoroo/astrid/tags/Astrid44SyncMigrator.java
index 5b7afbe..c75ef14 100644
--- a/astrid/plugin-src/com/todoroo/astrid/tags/Astrid44SyncMigrator.java
+++ b/astrid/plugin-src/com/todoroo/astrid/tags/Astrid44SyncMigrator.java
@@ -95,12 +95,12 @@
                 m.readFromCursor(incompleteMetadata);
                 boolean changes = false;
 
-                if (!m.containsNonNullValue(TagMetadata.TASK_UUID) && m.getValue(TagMetadata.TASK_UUID) == 0) {
+                if (!m.containsNonNullValue(TagMetadata.TASK_UUID) || m.getValue(TagMetadata.TASK_UUID) == 0) {
                     updateTaskUuid(m);
                     changes = true;
                 }
 
-                if (!m.containsNonNullValue(TagMetadata.TAG_UUID) && m.getValue(TagMetadata.TAG_UUID) == 0) {
+                if (!m.containsNonNullValue(TagMetadata.TAG_UUID) || m.getValue(TagMetadata.TAG_UUID) == 0) {
                     updateTagUuid(m);
                     changes = true;
                 }
