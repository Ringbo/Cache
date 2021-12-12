diff --git a/flink-runtime/src/main/java/org/apache/flink/runtime/rest/handler/taskmanager/AbstractTaskManagerFileHandler.java b/flink-runtime/src/main/java/org/apache/flink/runtime/rest/handler/taskmanager/AbstractTaskManagerFileHandler.java
index 5b5d97d..83fab69 100644
--- a/flink-runtime/src/main/java/org/apache/flink/runtime/rest/handler/taskmanager/AbstractTaskManagerFileHandler.java
+++ b/flink-runtime/src/main/java/org/apache/flink/runtime/rest/handler/taskmanager/AbstractTaskManagerFileHandler.java
@@ -155,7 +155,7 @@
 		resultFuture.whenComplete(
 			(Void ignored, Throwable throwable) -> {
 				if (throwable != null) {
-					log.debug("Failed to transfer file from TaskExecutor {}.", taskManagerId, throwable);
+					log.error("Failed to transfer file from TaskExecutor {}.", taskManagerId, throwable);
 					fileBlobKeys.invalidate(taskManagerId);
 
 					final Throwable strippedThrowable = ExceptionUtils.stripCompletionException(throwable);
