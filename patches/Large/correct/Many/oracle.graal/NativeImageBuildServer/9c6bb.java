diff --git a/substratevm/src/com.oracle.svm.hosted/src/com/oracle/svm/hosted/server/NativeImageBuildServer.java b/substratevm/src/com.oracle.svm.hosted/src/com/oracle/svm/hosted/server/NativeImageBuildServer.java
index 6e0e8d4..6c2b7b2 100644
--- a/substratevm/src/com.oracle.svm.hosted/src/com/oracle/svm/hosted/server/NativeImageBuildServer.java
+++ b/substratevm/src/com.oracle.svm.hosted/src/com/oracle/svm/hosted/server/NativeImageBuildServer.java
@@ -280,15 +280,15 @@
         SubstrateServerMessage serverCommand = gson.fromJson(commandLine, SubstrateServerMessage.class);
         OutputStreamWriter output = new OutputStreamWriter(socket.getOutputStream(), SOCKET_CHARSET);
         switch (serverCommand.command) {
-            case stop:
+            case STOP_SERVER:
                 log("Received 'stop' request. Shutting down server.\n");
                 sendExitStatus(output, 0);
                 return false;
-            case version:
+            case GET_VERSION:
                 log("Received 'version' request. Responding with " + System.getProperty(SUBSTRATEVM_VERSION_PROPERTY) + ".\n");
                 SubstrateServerMessage.send(new SubstrateServerMessage(serverCommand.command.toString(), System.getProperty(SUBSTRATEVM_VERSION_PROPERTY)), output);
                 return Instant.now().isBefore(lastKeepAliveAction.plus(Duration.ofMinutes(TIMEOUT_MINUTES)));
-            case build:
+            case BUILD_IMAGE:
                 if (activeBuildTasks.incrementAndGet() > 1) {
                     String message = "Can not build image: tasks are already running in the server.\n";
                     log(message);
@@ -324,7 +324,7 @@
                     }
                 }
                 return true;
-            case abort:
+            case ABORT_BUILD:
                 log("Abort request submitted: " + serverCommand.payload + "\n");
                 threadPoolExecutor.shutdownNow();
                 initThreadPool();
