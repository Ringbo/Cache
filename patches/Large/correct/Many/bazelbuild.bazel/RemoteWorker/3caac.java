diff --git a/src/tools/remote_worker/src/main/java/com/google/devtools/build/remote/RemoteWorker.java b/src/tools/remote_worker/src/main/java/com/google/devtools/build/remote/RemoteWorker.java
index 9bb4d2b..250aedb 100644
--- a/src/tools/remote_worker/src/main/java/com/google/devtools/build/remote/RemoteWorker.java
+++ b/src/tools/remote_worker/src/main/java/com/google/devtools/build/remote/RemoteWorker.java
@@ -127,7 +127,7 @@
     Path workPath = getFileSystem().getPath(remoteWorkerOptions.workPath);
     FileSystemUtils.createDirectoryAndParents(workPath);
     RemoteWorker worker = new RemoteWorker(workPath, remoteOptions, remoteWorkerOptions, cache);
-    Server server =
+    final Server server =
         ServerBuilder.forPort(remoteWorkerOptions.listenPort)
             .addService(RemoteWorkGrpc.bindService(worker))
             .build();
