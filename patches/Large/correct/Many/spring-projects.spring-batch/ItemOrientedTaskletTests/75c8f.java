diff --git a/spring-batch-execution/src/test/java/org/springframework/batch/execution/tasklet/ItemOrientedTaskletTests.java b/spring-batch-execution/src/test/java/org/springframework/batch/execution/tasklet/ItemOrientedTaskletTests.java
index 54c5fff..77bb140 100644
--- a/spring-batch-execution/src/test/java/org/springframework/batch/execution/tasklet/ItemOrientedTaskletTests.java
+++ b/spring-batch-execution/src/test/java/org/springframework/batch/execution/tasklet/ItemOrientedTaskletTests.java
@@ -256,7 +256,7 @@
 		try {
 			module.afterPropertiesSet();
 		} catch (IllegalArgumentException e) {
-			assertTrue(e.getMessage().toLowerCase().indexOf("writer") >= 0);
+			assertTrue("Message did not contain writer: "+e.getMessage(), e.getMessage().toLowerCase().indexOf("writer") >= 0);
 		}
 	}
 
