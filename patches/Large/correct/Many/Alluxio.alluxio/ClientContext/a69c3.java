diff --git a/clients/unshaded/src/main/java/tachyon/client/ClientContext.java b/clients/unshaded/src/main/java/tachyon/client/ClientContext.java
index c6a75f3..e395301 100644
--- a/clients/unshaded/src/main/java/tachyon/client/ClientContext.java
+++ b/clients/unshaded/src/main/java/tachyon/client/ClientContext.java
@@ -70,7 +70,7 @@
     sClientMetrics = new ClientMetrics();
 
     if (sExecutorService != null) {
-      sExecutorService.shutdown();
+      sExecutorService.shutdownNow();
     }
     sExecutorService = Executors.newFixedThreadPool(
         sTachyonConf.getInt(Constants.USER_BLOCK_WORKER_CLIENT_THREADS),
