diff --git a/core/server/worker/src/main/java/alluxio/web/WebInterfaceWorkerBlockInfoServlet.java b/core/server/worker/src/main/java/alluxio/web/WebInterfaceWorkerBlockInfoServlet.java
index b7c3d0d..54aa8d0 100644
--- a/core/server/worker/src/main/java/alluxio/web/WebInterfaceWorkerBlockInfoServlet.java
+++ b/core/server/worker/src/main/java/alluxio/web/WebInterfaceWorkerBlockInfoServlet.java
@@ -59,7 +59,7 @@
    * @param blockWorker block worker handle
    */
   public WebInterfaceWorkerBlockInfoServlet(BlockWorker blockWorker) {
-    mBlockWorker = Preconditions.checkNotNull(blockWorker);
+    mBlockWorker = Preconditions.checkNotNull(blockWorker, "blockWorker");
   }
 
   /**
