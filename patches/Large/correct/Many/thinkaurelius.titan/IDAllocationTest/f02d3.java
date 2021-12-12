diff --git a/titan-test/src/main/java/com/thinkaurelius/titan/diskstorage/IDAllocationTest.java b/titan-test/src/main/java/com/thinkaurelius/titan/diskstorage/IDAllocationTest.java
index cfc64db..50778e9 100644
--- a/titan-test/src/main/java/com/thinkaurelius/titan/diskstorage/IDAllocationTest.java
+++ b/titan-test/src/main/java/com/thinkaurelius/titan/diskstorage/IDAllocationTest.java
@@ -66,7 +66,7 @@
 
         c = GraphDatabaseConfiguration.buildConfiguration();
         c.set(IDAUTHORITY_UNIQUEID_RETRY_COUNT,10);
-        c.set(IDAUTHORITY_WAIT_MS,10);
+        c.set(IDAUTHORITY_WAIT_MS,100);
         c.set(IDAUTHORITY_UNIQUE_ID_BITS,7);
         c.set(IDAUTHORITY_RANDOMIZE_UNIQUE_ID,true);
         c.set(IDS_BLOCK_SIZE,400);
