diff --git a/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/keycolumnvalue/scan/StandardScannerExecutor.java b/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/keycolumnvalue/scan/StandardScannerExecutor.java
index ff80809..c260ebd 100644
--- a/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/keycolumnvalue/scan/StandardScannerExecutor.java
+++ b/titan-core/src/main/java/com/thinkaurelius/titan/diskstorage/keycolumnvalue/scan/StandardScannerExecutor.java
@@ -253,7 +253,7 @@
         public void run() {
             try {
                 job.workerIterationStart(jobConfiguration, graphConfiguration, metrics);
-                while (!finished) {
+                while (!finished || !processorQueue.isEmpty()) {
                     Row row;
                     while ((row=processorQueue.poll(100,TimeUnit.MILLISECONDS))!=null) {
                         if (numProcessed>=workBlockSize) {
