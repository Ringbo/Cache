diff --git a/maven-embedder/src/test/java/org/apache/maven/error/ErrorReporterPointcutTest.java b/maven-embedder/src/test/java/org/apache/maven/error/ErrorReporterPointcutTest.java
index 2cd4c61..a6ab7cb 100644
--- a/maven-embedder/src/test/java/org/apache/maven/error/ErrorReporterPointcutTest.java
+++ b/maven-embedder/src/test/java/org/apache/maven/error/ErrorReporterPointcutTest.java
@@ -196,7 +196,7 @@
 
         if ( result.hasExceptions() )
         {
-            reportExceptions( result, basedir );
+            reportExceptions( result, basedir, true );
         }
     }
 
