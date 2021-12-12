diff --git a/platform-tests/src/test/java/org/junit/platform/commons/util/ClasspathScannerTests.java b/platform-tests/src/test/java/org/junit/platform/commons/util/ClasspathScannerTests.java
index 27db861..76eb2f5 100644
--- a/platform-tests/src/test/java/org/junit/platform/commons/util/ClasspathScannerTests.java
+++ b/platform-tests/src/test/java/org/junit/platform/commons/util/ClasspathScannerTests.java
@@ -74,7 +74,7 @@
 		};
 
 		assertClassesScannedWhenExceptionIsThrown(malformedClassNameSimulationFilter);
-		assertWarningMessageLogged(listener, "Failed to load java.lang.Class for path .+ during classpath scanning.");
+		assertDebugMessageLogged(listener, "Failed to load java.lang.Class for path .+ during classpath scanning.");
 	}
 
 	@Test
@@ -89,7 +89,7 @@
 		};
 
 		assertClassesScannedWhenExceptionIsThrown(malformedClassNameSimulationFilter);
-		assertWarningMessageLogged(listener, "The java.lang.Class loaded from path .+ has a malformed class name .+");
+		assertDebugMessageLogged(listener, "The java.lang.Class loaded from path .+ has a malformed class name .+");
 	}
 
 	@Test
@@ -102,7 +102,7 @@
 		};
 
 		assertClassesScannedWhenExceptionIsThrown(otherInternalErrorSimulationFilter);
-		assertWarningMessageLogged(listener, "Failed to load java.lang.Class for path .+ during classpath scanning.");
+		assertDebugMessageLogged(listener, "Failed to load java.lang.Class for path .+ during classpath scanning.");
 	}
 
 	@Test
@@ -115,7 +115,7 @@
 		};
 
 		assertClassesScannedWhenExceptionIsThrown(runtimeExceptionSimulationFilter);
-		assertWarningMessageLogged(listener, "Failed to load java.lang.Class for path .+ during classpath scanning.");
+		assertDebugMessageLogged(listener, "Failed to load java.lang.Class for path .+ during classpath scanning.");
 	}
 
 	private void assertClassesScannedWhenExceptionIsThrown(Predicate<Class<?>> filter) throws Exception {
@@ -125,9 +125,9 @@
 		assertThat(classes.size()).isGreaterThanOrEqualTo(150);
 	}
 
-	private void assertWarningMessageLogged(LogRecordListener listener, String regex) {
+	private void assertDebugMessageLogged(LogRecordListener listener, String regex) {
 		// @formatter:off
-		assertThat(listener.getLogRecords(ClasspathScanner.class, Level.WARNING)
+		assertThat(listener.getLogRecords(ClasspathScanner.class, Level.FINE)
 				.map(LogRecord::getMessage)
 				.filter(m -> m.matches(regex))
 				.count()
@@ -356,7 +356,7 @@
 
 		@Override
 		public Enumeration<URL> getResources(String name) throws IOException {
-			throw new IOException();
+			throw new IOException("Demo I/O error");
 		}
 	}
 
