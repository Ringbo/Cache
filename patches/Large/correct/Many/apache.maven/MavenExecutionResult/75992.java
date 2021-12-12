diff --git a/maven-core/src/main/java/org/apache/maven/execution/MavenExecutionResult.java b/maven-core/src/main/java/org/apache/maven/execution/MavenExecutionResult.java
index ae6dff0..be725c9 100644
--- a/maven-core/src/main/java/org/apache/maven/execution/MavenExecutionResult.java
+++ b/maven-core/src/main/java/org/apache/maven/execution/MavenExecutionResult.java
@@ -44,7 +44,7 @@
     // - project building exception
     // - invalid project model exception: list of markers
     // - xmlpull parser exception
-    List<Exception> getExceptions();
+    List<Throwable> getExceptions();
 
     MavenExecutionResult addException( Throwable e );
 
