diff --git a/junit-vintage-engine/src/test/java/org/junit/vintage/engine/VintageTestEngineExecutionTests.java b/junit-vintage-engine/src/test/java/org/junit/vintage/engine/VintageTestEngineExecutionTests.java
index 708fee6..b5bf012 100644
--- a/junit-vintage-engine/src/test/java/org/junit/vintage/engine/VintageTestEngineExecutionTests.java
+++ b/junit-vintage-engine/src/test/java/org/junit/vintage/engine/VintageTestEngineExecutionTests.java
@@ -378,7 +378,7 @@
 		// @formatter:off
 		assertThat(PlainJUnit4TestCaseWithLifecycleMethods.EVENTS).containsExactly(
 			"executionStarted:JUnit Vintage",
-				"executionStarted:" + testClass.getName(),
+				"executionStarted:" + testClass.getSimpleName(),
 					"beforeClass",
 						"executionStarted:failingTest",
 							"before",
@@ -392,7 +392,7 @@
 							"after",
 						"executionFinished:succeedingTest",
 					"afterClass",
-				"executionFinished:" + testClass.getName(),
+				"executionFinished:" + testClass.getSimpleName(),
 			"executionFinished:JUnit Vintage"
 		);
 		// @formatter:on
