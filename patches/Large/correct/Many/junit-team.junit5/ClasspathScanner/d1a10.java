diff --git a/junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClasspathScanner.java b/junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClasspathScanner.java
index 97d729b..07b0792 100644
--- a/junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClasspathScanner.java
+++ b/junit-platform-commons/src/main/java/org/junit/platform/commons/util/ClasspathScanner.java
@@ -188,7 +188,7 @@
 
 	private void logMalformedClassName(Path classFile, String fullyQualifiedClassName, InternalError ex) {
 		try {
-			logger.warn(ex, () -> format("The java.lang.Class loaded from path [%s] has a malformed class name [%s].",
+			logger.debug(ex, () -> format("The java.lang.Class loaded from path [%s] has a malformed class name [%s].",
 				classFile.toAbsolutePath(), fullyQualifiedClassName));
 		}
 		catch (Throwable t) {
@@ -198,7 +198,7 @@
 	}
 
 	private void logGenericFileProcessingException(Path classFile, Throwable throwable) {
-		logger.warn(throwable, () -> format("Failed to load java.lang.Class for path [%s] during classpath scanning.",
+		logger.debug(throwable, () -> format("Failed to load java.lang.Class for path [%s] during classpath scanning.",
 			classFile.toAbsolutePath()));
 	}
 
