diff --git a/spring-batch-core/src/test/java/org/springframework/batch/core/scope/StepScopeDestructionCallbackIntegrationTests.java b/spring-batch-core/src/test/java/org/springframework/batch/core/scope/StepScopeDestructionCallbackIntegrationTests.java
index 445222f..00a86b5 100644
--- a/spring-batch-core/src/test/java/org/springframework/batch/core/scope/StepScopeDestructionCallbackIntegrationTests.java
+++ b/spring-batch-core/src/test/java/org/springframework/batch/core/scope/StepScopeDestructionCallbackIntegrationTests.java
@@ -56,7 +56,7 @@
 	public void testProxiedScopedProxy() throws Exception {
 		assertNotNull(nested);
 		nested.execute(new StepExecution("step", new JobExecution(0L), 1L));
-		assertEquals(2, TestAdvice.names.size());
+		assertEquals(4, TestAdvice.names.size());
 		assertEquals("bar", TestAdvice.names.get(0));
 		assertEquals("destroyed", TestDisposableCollaborator.message);
 	}
