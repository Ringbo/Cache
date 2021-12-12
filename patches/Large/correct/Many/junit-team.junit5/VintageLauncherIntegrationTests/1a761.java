diff --git a/junit-vintage-engine/src/test/java/org/junit/vintage/engine/VintageLauncherIntegrationTests.java b/junit-vintage-engine/src/test/java/org/junit/vintage/engine/VintageLauncherIntegrationTests.java
index fee422f..75f4aa6 100644
--- a/junit-vintage-engine/src/test/java/org/junit/vintage/engine/VintageLauncherIntegrationTests.java
+++ b/junit-vintage-engine/src/test/java/org/junit/vintage/engine/VintageLauncherIntegrationTests.java
@@ -67,7 +67,7 @@
 
 		Map<TestIdentifier, TestExecutionResult> results = execute(request);
 		assertThat(results.keySet().stream().map(TestIdentifier::getDisplayName)) //
-				.containsExactlyInAnyOrder("JUnit Vintage", testClass.getName(), "failingTest");
+				.containsExactlyInAnyOrder("JUnit Vintage", testClass.getSimpleName(), "failingTest");
 	}
 
 	@Test
@@ -83,7 +83,7 @@
 
 		Map<TestIdentifier, TestExecutionResult> results = execute(request);
 		assertThat(results.keySet().stream().map(TestIdentifier::getDisplayName)) //
-				.containsExactlyInAnyOrder("JUnit Vintage", testClass.getName(), nestedTestClass.getName(),
+				.containsExactlyInAnyOrder("JUnit Vintage", testClass.getSimpleName(), nestedTestClass.getName(),
 					"failingTest");
 	}
 
@@ -100,7 +100,7 @@
 
 		Map<TestIdentifier, TestExecutionResult> results = execute(request);
 		assertThat(results.keySet().stream().map(TestIdentifier::getDisplayName)) //
-				.containsExactlyInAnyOrder("JUnit Vintage", testClass.getName(), nestedTestClass.getName(),
+				.containsExactlyInAnyOrder("JUnit Vintage", testClass.getSimpleName(), nestedTestClass.getName(),
 					"successfulTest");
 	}
 
@@ -163,7 +163,7 @@
 
 		Map<TestIdentifier, TestExecutionResult> results = execute(request);
 		assertThat(results.keySet().stream().map(TestIdentifier::getDisplayName)) //
-				.containsExactlyInAnyOrder("JUnit Vintage", testClass.getName(), "Test #0", "Test #1");
+				.containsExactlyInAnyOrder("JUnit Vintage", testClass.getSimpleName(), "Test #0", "Test #1");
 		assertThat(logRecordListener.stream(RunnerTestDescriptor.class, Level.WARNING).map(LogRecord::getMessage)) //
 				.containsExactly(
 					"Runner " + NotFilterableRunner.class.getName() + " (used on class " + testClass.getName() + ")" //
@@ -185,7 +185,7 @@
 
 		Map<TestIdentifier, TestExecutionResult> results = execute(request);
 		assertThat(results.keySet().stream().map(TestIdentifier::getDisplayName)) //
-				.containsExactlyInAnyOrder("JUnit Vintage", suiteClass.getName(), testClass.getName(), "Test #0",
+				.containsExactlyInAnyOrder("JUnit Vintage", suiteClass.getSimpleName(), testClass.getName(), "Test #0",
 					"Test #1");
 		assertThat(logRecordListener.stream(RunnerTestDescriptor.class, Level.WARNING).map(LogRecord::getMessage)) //
 				.containsExactly("Runner " + Suite.class.getName() + " (used on class " + suiteClass.getName() + ")" //
@@ -205,7 +205,7 @@
 
 		Map<TestIdentifier, TestExecutionResult> results = execute(request);
 		assertThat(results.keySet().stream().map(TestIdentifier::getDisplayName)) //
-				.containsExactlyInAnyOrder("JUnit Vintage", suiteClass.getName(), testClass.getName(),
+				.containsExactlyInAnyOrder("JUnit Vintage", suiteClass.getSimpleName(), testClass.getName(),
 					"successfulTest");
 	}
 
