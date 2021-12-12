diff --git a/spring-batch-infrastructure/src/test/java/org/springframework/batch/repeat/support/AsynchronousRepeatTests.java b/spring-batch-infrastructure/src/test/java/org/springframework/batch/repeat/support/AsynchronousRepeatTests.java
index 085e94f..8386b7a 100644
--- a/spring-batch-infrastructure/src/test/java/org/springframework/batch/repeat/support/AsynchronousRepeatTests.java
+++ b/spring-batch-infrastructure/src/test/java/org/springframework/batch/repeat/support/AsynchronousRepeatTests.java
@@ -46,7 +46,7 @@
 				assertNotSame(threadName, Thread.currentThread().getName());
 				threadNames.add(Thread.currentThread().getName());
 				Thread.sleep(100);
-				Object item = provider.read();
+				Trade item = provider.read();
 				if (item!=null) {
 					processor.write(item);
 				}
