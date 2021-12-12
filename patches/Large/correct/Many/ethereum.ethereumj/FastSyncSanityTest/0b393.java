diff --git a/ethereumj-core/src/test/java/org/ethereum/longrun/FastSyncSanityTest.java b/ethereumj-core/src/test/java/org/ethereum/longrun/FastSyncSanityTest.java
index 960c91d..679ff25 100644
--- a/ethereumj-core/src/test/java/org/ethereum/longrun/FastSyncSanityTest.java
+++ b/ethereumj-core/src/test/java/org/ethereum/longrun/FastSyncSanityTest.java
@@ -103,7 +103,6 @@
      */
     static class RegularNode extends BasicNode {
         public RegularNode() {
-            // peers need different loggers
             super("sampleNode");
         }
 
@@ -116,7 +115,7 @@
 
         @Override
         public void waitForSync() throws Exception {
-            logger.info("Waiting for the whole blockchain sync (will take up to an hour on fast sync for the whole chain)...");
+            testLogger.info("Waiting for the whole blockchain sync (will take up to an hour on fast sync for the whole chain)...");
             while(true) {
                 sleep(10000);
                 if (syncState == null) continue;
@@ -124,7 +123,7 @@
                 switch (syncState) {
                     case UNSECURE:
                         if (!firstRun.get()) break;
-                        logger.info("[v] Unsecure sync completed");
+                        testLogger.info("[v] Unsecure sync completed");
                         sleep(60000);
                         stopSync();
                         BlockchainValidation.checkNodes(ethereum, commonConfig, fatalErrors);
@@ -132,14 +131,14 @@
                         break;
                     case SECURE:
                         if (!secondRun.get()) break;
-                        logger.info("[v] Secure sync completed");
+                        testLogger.info("[v] Secure sync completed");
                         sleep(60000);
                         stopSync();
                         BlockchainValidation.checkFastHeaders(ethereum, commonConfig, fatalErrors);
                         secondRun.set(false);
                         break;
                     case COMPLETE:
-                        logger.info("[v] Sync complete! The best block: " + bestBlock.getShortDescr());
+                        testLogger.info("[v] Sync complete! The best block: " + bestBlock.getShortDescr());
                         stopSync();
                         return;
                 }
