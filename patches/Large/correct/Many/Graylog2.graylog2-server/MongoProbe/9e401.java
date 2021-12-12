diff --git a/graylog2-server/src/main/java/org/graylog2/system/stats/mongo/MongoProbe.java b/graylog2-server/src/main/java/org/graylog2/system/stats/mongo/MongoProbe.java
index be769b5..276b096 100644
--- a/graylog2-server/src/main/java/org/graylog2/system/stats/mongo/MongoProbe.java
+++ b/graylog2-server/src/main/java/org/graylog2/system/stats/mongo/MongoProbe.java
@@ -210,7 +210,7 @@
                     memoryMap.getInt("virtual"),
                     memoryMap.getBoolean("supported"),
                     memoryMap.getInt("mapped"),
-                    memoryMap.getInt("mappedWithJournal")
+                    memoryMap.getInt("mappedWithJournal", -1)
             );
 
             final BasicDBObject storageEngineMap = (BasicDBObject) serverStatusResult.get("storageEngine");
