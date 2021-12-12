diff --git a/spring-context/src/main/java/org/springframework/context/annotation/ClassPathScanningCandidateComponentProvider.java b/spring-context/src/main/java/org/springframework/context/annotation/ClassPathScanningCandidateComponentProvider.java
index 9283f14..c8c0dc1 100644
--- a/spring-context/src/main/java/org/springframework/context/annotation/ClassPathScanningCandidateComponentProvider.java
+++ b/spring-context/src/main/java/org/springframework/context/annotation/ClassPathScanningCandidateComponentProvider.java
@@ -239,7 +239,7 @@
 		try {
 			this.includeFilters.add(new AnnotationTypeFilter(
 					((Class<? extends Annotation>) cl.loadClass("javax.annotation.ManagedBean")), false));
-			logger.info("JSR-250 'javax.annotation.ManagedBean' found and supported for component scanning");
+			logger.debug("JSR-250 'javax.annotation.ManagedBean' found and supported for component scanning");
 		}
 		catch (ClassNotFoundException ex) {
 			// JSR-250 1.1 API (as included in Java EE 6) not available - simply skip.
@@ -247,7 +247,7 @@
 		try {
 			this.includeFilters.add(new AnnotationTypeFilter(
 					((Class<? extends Annotation>) cl.loadClass("javax.inject.Named")), false));
-			logger.info("JSR-330 'javax.inject.Named' annotation found and supported for component scanning");
+			logger.debug("JSR-330 'javax.inject.Named' annotation found and supported for component scanning");
 		}
 		catch (ClassNotFoundException ex) {
 			// JSR-330 API not available - simply skip.
