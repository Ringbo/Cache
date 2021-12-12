diff --git a/server/src/main/java/io/druid/indexer/SQLMetadataStorageUpdaterJobHandler.java b/server/src/main/java/io/druid/indexer/SQLMetadataStorageUpdaterJobHandler.java
index 31385e1..d6a9dbc 100644
--- a/server/src/main/java/io/druid/indexer/SQLMetadataStorageUpdaterJobHandler.java
+++ b/server/src/main/java/io/druid/indexer/SQLMetadataStorageUpdaterJobHandler.java
@@ -67,10 +67,10 @@
                       .put("created_date", new DateTime().toString())
                       .put("start", segment.getInterval().getStart().toString())
                       .put("end", segment.getInterval().getEnd().toString())
-                      .put("partitioned", (segment.getShardSpec() instanceof NoneShardSpec) ? 0 : 1)
+                      .put("partitioned", (segment.getShardSpec() instanceof NoneShardSpec) ? false : true)
                       .put("version", segment.getVersion())
                       .put("used", true)
-                      .put("payload", mapper.writeValueAsString(segment))
+                      .put("payload", mapper.writeValueAsBytes(segment))
                       .build()
               );
 
