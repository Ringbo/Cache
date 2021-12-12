diff --git a/src/java/azkaban/executor/FlowRunner.java b/src/java/azkaban/executor/FlowRunner.java
index 10a9e94..1ef5883 100644
--- a/src/java/azkaban/executor/FlowRunner.java
+++ b/src/java/azkaban/executor/FlowRunner.java
@@ -269,7 +269,7 @@
 		logger.info("Finishing up flow. Awaiting Termination");
 		executorService.shutdown();
 
-		while (executorService.isTerminated()) {
+		while (!executorService.isTerminated()) {
 			try {
 				executorService.awaitTermination(1, TimeUnit.SECONDS);
 			} catch (InterruptedException e) {
