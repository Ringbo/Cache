diff --git a/test/unit/org/apache/cassandra/service/StorageServiceClientTest.java b/test/unit/org/apache/cassandra/service/StorageServiceClientTest.java
index b473c18..19efe3a 100644
--- a/test/unit/org/apache/cassandra/service/StorageServiceClientTest.java
+++ b/test/unit/org/apache/cassandra/service/StorageServiceClientTest.java
@@ -35,7 +35,7 @@
     {
         SchemaLoader.mkdirs();
         SchemaLoader.cleanup();
-        StorageService.instance.initClient();
+        StorageService.instance.initClient(0);
 
         // verify that no storage directories were created.
         for (String path : DatabaseDescriptor.getAllDataFileLocations())
