diff --git a/core/server/src/main/java/alluxio/worker/AlluxioWorker.java b/core/server/src/main/java/alluxio/worker/AlluxioWorker.java
index b87660f..894bcdf 100644
--- a/core/server/src/main/java/alluxio/worker/AlluxioWorker.java
+++ b/core/server/src/main/java/alluxio/worker/AlluxioWorker.java
@@ -35,7 +35,7 @@
   public static void main(String[] args) {
     if (args.length != 0) {
       LOG.info("java -cp {} {}", RuntimeConstants.ALLUXIO_JAR,
-          AlluxioWorkerService.class.getCanonicalName());
+          AlluxioWorker.class.getCanonicalName());
       System.exit(-1);
     }
 
