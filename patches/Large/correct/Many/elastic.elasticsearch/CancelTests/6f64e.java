diff --git a/modules/reindex/src/test/java/org/elasticsearch/index/reindex/CancelTests.java b/modules/reindex/src/test/java/org/elasticsearch/index/reindex/CancelTests.java
index 30a7e45..d2110c5 100644
--- a/modules/reindex/src/test/java/org/elasticsearch/index/reindex/CancelTests.java
+++ b/modules/reindex/src/test/java/org/elasticsearch/index/reindex/CancelTests.java
@@ -120,7 +120,9 @@
          * exhausted their slice while others might have quite a bit left
          * to work on. We can't control that. */
         logger.debug("waiting for updates to be blocked");
-        boolean blocked = awaitBusy(() -> ALLOWED_OPERATIONS.hasQueuedThreads() && ALLOWED_OPERATIONS.availablePermits() == 0);
+        boolean blocked = awaitBusy(
+            () -> ALLOWED_OPERATIONS.hasQueuedThreads() && ALLOWED_OPERATIONS.availablePermits() == 0,
+            1, TimeUnit.MINUTES); // 10 seconds is usually fine but on heavilly loaded machines this can wake a while
         assertTrue("updates blocked", blocked);
 
         // Status should show the task running
