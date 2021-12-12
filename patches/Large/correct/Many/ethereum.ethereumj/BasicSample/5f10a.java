diff --git a/ethereumj-core/src/main/java/org/ethereum/samples/BasicSample.java b/ethereumj-core/src/main/java/org/ethereum/samples/BasicSample.java
index 704f529..d322729 100644
--- a/ethereumj-core/src/main/java/org/ethereum/samples/BasicSample.java
+++ b/ethereumj-core/src/main/java/org/ethereum/samples/BasicSample.java
@@ -145,7 +145,7 @@
     /**
      * Is called when the whole blockchain sync is complete
      */
-    public void onSyncDone() {
+    public void onSyncDone() throws Exception {
         logger.info("Monitoring new blocks in real-time...");
     }
 
