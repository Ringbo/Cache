diff --git a/examples/showcase/src/test/java/org/springside/examples/showcase/schedule/QuartzTimerClusterJobTest.java b/examples/showcase/src/test/java/org/springside/examples/showcase/schedule/QuartzTimerClusterJobTest.java
index 7b357cc..e2f1231 100644
--- a/examples/showcase/src/test/java/org/springside/examples/showcase/schedule/QuartzTimerClusterJobTest.java
+++ b/examples/showcase/src/test/java/org/springside/examples/showcase/schedule/QuartzTimerClusterJobTest.java
@@ -30,8 +30,8 @@
 		Log4jMockAppender appender = new Log4jMockAppender();
 		appender.addToLogger(QuartzClusterableJob.class);
 
-		//等待任务启动
-		Threads.sleep(2000);
+		//等待任务延时2秒启动
+		Threads.sleep(3000);
 
 		//验证任务已执行
 		assertEquals(1, appender.getLogsCount());
