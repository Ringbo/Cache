diff --git a/portal-service/test/com/liferay/portal/kernel/concurrent/ThreadPoolExecutorTest.java b/portal-service/test/com/liferay/portal/kernel/concurrent/ThreadPoolExecutorTest.java
index 3673f6f..7bc8ac8 100644
--- a/portal-service/test/com/liferay/portal/kernel/concurrent/ThreadPoolExecutorTest.java
+++ b/portal-service/test/com/liferay/portal/kernel/concurrent/ThreadPoolExecutorTest.java
@@ -438,15 +438,16 @@
 		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
 			1, 2, TestUtil.KEEPALIVE_TIME, TimeUnit.MILLISECONDS, true, 3);
 
-		long startTime = System.currentTimeMillis();
+		long startTime = System.nanoTime();
 
 		assertFalse(
 			threadPoolExecutor.awaitTermination(
 				TestUtil.KEEPALIVE_TIME, TimeUnit.MILLISECONDS));
 
-		long waitTime = System.currentTimeMillis() - startTime;
+		long waitTime = System.nanoTime() - startTime;
 
-		assertTrue(waitTime >= TestUtil.KEEPALIVE_TIME);
+		assertTrue(waitTime >= TimeUnit.MILLISECONDS.toNanos(
+			TestUtil.KEEPALIVE_TIME));
 	}
 
 	public void testAwaitTermination2() throws InterruptedException {
