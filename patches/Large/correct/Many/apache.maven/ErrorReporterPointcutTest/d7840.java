diff --git a/maven-embedder/src/test/java/org/apache/maven/error/ErrorReporterPointcutTest.java b/maven-embedder/src/test/java/org/apache/maven/error/ErrorReporterPointcutTest.java
index 24dada4..1490c86 100644
--- a/maven-embedder/src/test/java/org/apache/maven/error/ErrorReporterPointcutTest.java
+++ b/maven-embedder/src/test/java/org/apache/maven/error/ErrorReporterPointcutTest.java
@@ -461,7 +461,7 @@
 
         reporter.reportErrorLoadingPlugin( null, null, null );
         reporterCtl.setMatcher( MockControl.ALWAYS_MATCHER );
-        reporterCtl.setVoidCallable();
+        reporterCtl.setVoidCallable( MockControl.ONE_OR_MORE );
 
         reporterCtl.replay();
 
