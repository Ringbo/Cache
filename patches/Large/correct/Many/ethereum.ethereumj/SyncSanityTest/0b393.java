diff --git a/ethereumj-core/src/test/java/org/ethereum/longrun/SyncSanityTest.java b/ethereumj-core/src/test/java/org/ethereum/longrun/SyncSanityTest.java
index 1e68e27..f0f428f 100644
--- a/ethereumj-core/src/test/java/org/ethereum/longrun/SyncSanityTest.java
+++ b/ethereumj-core/src/test/java/org/ethereum/longrun/SyncSanityTest.java
@@ -101,18 +101,17 @@
      */
     static class RegularNode extends BasicNode {
         public RegularNode() {
-            // peers need different loggers
             super("sampleNode");
         }
 
         @Override
         public void waitForSync() throws Exception {
-            logger.info("Waiting for the whole blockchain sync (will take up to an hour on fast sync for the whole chain)...");
+            testLogger.info("Waiting for the whole blockchain sync (will take up to an hour on fast sync for the whole chain)...");
             while(true) {
                 sleep(10000);
 
                 if (syncComplete) {
-                    logger.info("[v] Sync complete! The best block: " + bestBlock.getShortDescr());
+                    testLogger.info("[v] Sync complete! The best block: " + bestBlock.getShortDescr());
 
                     // Stop syncing
                     config.setSyncEnabled(false);
