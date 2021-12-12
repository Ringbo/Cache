diff --git a/junit-vintage-engine/src/test/java/org/junit/vintage/engine/VintageTestEngineDiscoveryTests.java b/junit-vintage-engine/src/test/java/org/junit/vintage/engine/VintageTestEngineDiscoveryTests.java
index b19e010..b355e6a 100644
--- a/junit-vintage-engine/src/test/java/org/junit/vintage/engine/VintageTestEngineDiscoveryTests.java
+++ b/junit-vintage-engine/src/test/java/org/junit/vintage/engine/VintageTestEngineDiscoveryTests.java
@@ -122,7 +122,7 @@
 		TestDescriptor runnerDescriptor = getOnlyElement(engineDescriptor.getChildren());
 		assertFalse(runnerDescriptor.isContainer());
 		assertTrue(runnerDescriptor.isTest());
-		assertEquals(testClass.getName(), runnerDescriptor.getDisplayName());
+		assertEquals(testClass.getSimpleName(), runnerDescriptor.getDisplayName());
 		assertEquals(VintageUniqueIdBuilder.uniqueIdForClass(testClass), runnerDescriptor.getUniqueId());
 		assertThat(runnerDescriptor.getChildren()).isEmpty();
 	}
@@ -240,9 +240,9 @@
 		// @formatter:off
 		assertThat(engineDescriptor.getChildren())
 			.extracting(TestDescriptor::getDisplayName)
-			.contains(PlainJUnit4TestCaseWithSingleTestWhichFails.class.getName())
-			.contains(PlainJUnit3TestCaseWithSingleTestWhichFails.class.getName())
-			.doesNotContain(PlainOldJavaClassWithoutAnyTestsTestCase.class.getName());
+			.contains(PlainJUnit4TestCaseWithSingleTestWhichFails.class.getSimpleName())
+			.contains(PlainJUnit3TestCaseWithSingleTestWhichFails.class.getSimpleName())
+			.doesNotContain(PlainOldJavaClassWithoutAnyTestsTestCase.class.getSimpleName());
 		// @formatter:on
 	}
 
@@ -262,7 +262,7 @@
 			// @formatter:off
 			assertThat(engineDescriptor.getChildren())
 					.extracting(TestDescriptor::getDisplayName)
-					.containsExactly("com.example.project.JUnit4Test");
+					.containsExactly("JUnit4Test");
 			// @formatter:on
 		}
 		finally {
@@ -282,9 +282,9 @@
 		// @formatter:off
 		assertThat(engineDescriptor.getChildren())
 			.extracting(TestDescriptor::getDisplayName)
-			.contains(PlainJUnit4TestCaseWithSingleTestWhichFails.class.getName())
-			.doesNotContain(JUnit4TestCaseWithOverloadedMethod.class.getName())
-			.doesNotContain(PlainJUnit3TestCaseWithSingleTestWhichFails.class.getName());
+			.contains(PlainJUnit4TestCaseWithSingleTestWhichFails.class.getSimpleName())
+			.doesNotContain(JUnit4TestCaseWithOverloadedMethod.class.getSimpleName())
+			.doesNotContain(PlainJUnit3TestCaseWithSingleTestWhichFails.class.getSimpleName());
 		// @formatter:on
 	}
 
@@ -300,7 +300,7 @@
 		// @formatter:off
 		assertThat(engineDescriptor.getChildren())
 				.extracting(TestDescriptor::getDisplayName)
-				.contains(PlainJUnit4TestCaseWithSingleTestWhichFails.class.getName());
+				.contains(PlainJUnit4TestCaseWithSingleTestWhichFails.class.getSimpleName());
 		// @formatter:on
 	}
 
@@ -316,8 +316,8 @@
 		// @formatter:off
 		assertThat(engineDescriptor.getChildren())
 			.extracting(TestDescriptor::getDisplayName)
-			.contains(testClass.getName())
-			.doesNotContain(PlainJUnit3TestCaseWithSingleTestWhichFails.class.getName());
+			.contains(testClass.getSimpleName())
+			.doesNotContain(PlainJUnit3TestCaseWithSingleTestWhichFails.class.getSimpleName());
 		// @formatter:on
 	}
 
@@ -333,8 +333,8 @@
 		// @formatter:off
 		assertThat(engineDescriptor.getChildren())
 			.extracting(TestDescriptor::getDisplayName)
-			.contains(testClass.getName())
-			.doesNotContain(PlainJUnit4TestCaseWithSingleTestWhichFails.class.getName());
+			.contains(testClass.getSimpleName())
+			.doesNotContain(PlainJUnit4TestCaseWithSingleTestWhichFails.class.getSimpleName());
 		// @formatter:on
 	}
 
@@ -347,7 +347,7 @@
 		TestDescriptor engineDescriptor = discoverTests(discoveryRequest);
 
 		TestDescriptor runnerDescriptor = getOnlyElement(engineDescriptor.getChildren());
-		assertEquals(testClass.getName(), runnerDescriptor.getDisplayName());
+		assertEquals(testClass.getSimpleName(), runnerDescriptor.getDisplayName());
 		assertClassSource(testClass, runnerDescriptor);
 
 		TestDescriptor testDescriptor = getOnlyElement(runnerDescriptor.getChildren());
@@ -637,7 +637,7 @@
 		TestDescriptor engineDescriptor = discoverTests(request);
 
 		TestDescriptor runnerDescriptor = getOnlyElement(engineDescriptor.getChildren());
-		assertEquals(testClass.getName(), runnerDescriptor.getDisplayName());
+		assertEquals(testClass.getSimpleName(), runnerDescriptor.getDisplayName());
 		assertEquals(VintageUniqueIdBuilder.uniqueIdForClass(testClass), runnerDescriptor.getUniqueId());
 		assertThat(runnerDescriptor.getChildren()).isNotEmpty();
 	}
@@ -720,7 +720,7 @@
 	private static void assertRunnerTestDescriptor(TestDescriptor runnerDescriptor, Class<?> testClass) {
 		assertTrue(runnerDescriptor.isContainer());
 		assertFalse(runnerDescriptor.isTest());
-		assertEquals(testClass.getName(), runnerDescriptor.getDisplayName());
+		assertEquals(testClass.getSimpleName(), runnerDescriptor.getDisplayName());
 		assertEquals(VintageUniqueIdBuilder.uniqueIdForClass(testClass), runnerDescriptor.getUniqueId());
 		assertClassSource(testClass, runnerDescriptor);
 	}
