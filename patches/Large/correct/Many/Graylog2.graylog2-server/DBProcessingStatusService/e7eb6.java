diff --git a/graylog2-server/src/main/java/org/graylog2/system/processing/DBProcessingStatusService.java b/graylog2-server/src/main/java/org/graylog2/system/processing/DBProcessingStatusService.java
index cf41374..3e6d3bf 100644
--- a/graylog2-server/src/main/java/org/graylog2/system/processing/DBProcessingStatusService.java
+++ b/graylog2-server/src/main/java/org/graylog2/system/processing/DBProcessingStatusService.java
@@ -70,9 +70,12 @@
                 mapper.get());
 
         db.createIndex(new BasicDBObject(ProcessingStatusDto.FIELD_NODE_ID, 1), new BasicDBObject("unique", true));
+        // Use a custom index name to avoid the automatically generated index name which will be pretty long and
+        // might cause errors due to the 127 character index name limit. (e.g. when using a long database name)
+        // See: https://github.com/Graylog2/graylog2-server/issues/6322
         db.createIndex(new BasicDBObject(FIELD_UPDATED_AT, 1)
                 .append(FIELD_UNCOMMITTED_ENTRIES, 1)
-                .append(FIELD_WRITTEN_MESSAGES_1M, 1));
+                .append(FIELD_WRITTEN_MESSAGES_1M, 1), new BasicDBObject("name", "compound_0"));
     }
 
     /**
