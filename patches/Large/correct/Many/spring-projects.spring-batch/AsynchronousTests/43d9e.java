diff --git a/spring-batch-infrastructure-tests/src/test/java/org/springframework/batch/repeat/jms/AsynchronousTests.java b/spring-batch-infrastructure-tests/src/test/java/org/springframework/batch/repeat/jms/AsynchronousTests.java
index 22edf4f..2f54d40 100644
--- a/spring-batch-infrastructure-tests/src/test/java/org/springframework/batch/repeat/jms/AsynchronousTests.java
+++ b/spring-batch-infrastructure-tests/src/test/java/org/springframework/batch/repeat/jms/AsynchronousTests.java
@@ -161,7 +161,7 @@
 		// Need to sleep here, but not too long or the
 		// container goes into its own recovery cycle and spits out the bad
 		// message...
-		waitFor(list,2,2000);
+		waitFor(list,2,500);
 
 		container.stop();
 
@@ -189,9 +189,9 @@
 	 */
 	private void waitFor(List<String> list, int size, int timeout) throws InterruptedException {
 		int count = 0;
-		int max = timeout / 100;
+		int max = timeout / 50;
 		while (count<max && list.size()<size) {
-			Thread.sleep(100);
+			Thread.sleep(50);
 		}
 	}
 
