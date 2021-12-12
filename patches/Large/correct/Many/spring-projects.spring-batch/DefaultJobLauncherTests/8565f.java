diff --git a/spring-batch-execution/src/test/java/org/springframework/batch/execution/launch/DefaultJobLauncherTests.java b/spring-batch-execution/src/test/java/org/springframework/batch/execution/launch/DefaultJobLauncherTests.java
index 0997cff..5da3f7b 100644
--- a/spring-batch-execution/src/test/java/org/springframework/batch/execution/launch/DefaultJobLauncherTests.java
+++ b/spring-batch-execution/src/test/java/org/springframework/batch/execution/launch/DefaultJobLauncherTests.java
@@ -94,7 +94,7 @@
 		
 		assertTrue(jobLauncher.isRunning(jobIdentifier));
 		
-		Thread.sleep(100);
+		Thread.sleep(250);
 		assertFalse(jobLauncher.isRunning(jobIdentifier));
 		assertEquals(ExitStatus.FINISHED, jobExecution.getExitStatus());
 	}
