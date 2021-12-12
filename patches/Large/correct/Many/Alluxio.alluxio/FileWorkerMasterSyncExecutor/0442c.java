diff --git a/servers/src/main/java/tachyon/worker/file/FileWorkerMasterSyncExecutor.java b/servers/src/main/java/tachyon/worker/file/FileWorkerMasterSyncExecutor.java
index 440d3e6..568e65d 100644
--- a/servers/src/main/java/tachyon/worker/file/FileWorkerMasterSyncExecutor.java
+++ b/servers/src/main/java/tachyon/worker/file/FileWorkerMasterSyncExecutor.java
@@ -112,7 +112,7 @@
 
   @Override
   public void close() {
-    mFixedExecutionService.shutdown();
+    mPersistFileService.shutdown();
   }
 
   /**
