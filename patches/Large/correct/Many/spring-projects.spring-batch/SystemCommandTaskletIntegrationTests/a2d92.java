diff --git a/spring-batch-samples/src/test/java/org/springframework/batch/sample/tasklet/SystemCommandTaskletIntegrationTests.java b/spring-batch-samples/src/test/java/org/springframework/batch/sample/tasklet/SystemCommandTaskletIntegrationTests.java
index 8652682..2e7112f 100644
--- a/spring-batch-samples/src/test/java/org/springframework/batch/sample/tasklet/SystemCommandTaskletIntegrationTests.java
+++ b/spring-batch-samples/src/test/java/org/springframework/batch/sample/tasklet/SystemCommandTaskletIntegrationTests.java
@@ -71,7 +71,7 @@
 			fail();
 		}
 		catch (SystemCommandException e) {
-			assertTrue(e.getMessage().contains("did not finish successfully within the timeout"));
+			assertTrue(e.getMessage().indexOf("did not finish successfully within the timeout") > 0);
 		}
 	}
 
@@ -129,7 +129,7 @@
 			// expected
 		}
 
-		File notDirectory = File.createTempFile(this.getClass().getSimpleName(), null);
+		File notDirectory = File.createTempFile(this.getClass().getName(), null);
 		Assert.state(notDirectory.exists());
 		Assert.state(!notDirectory.isDirectory());
 
