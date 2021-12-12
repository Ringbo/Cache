diff --git a/maven-core/src/main/java/org/apache/maven/DefaultMaven.java b/maven-core/src/main/java/org/apache/maven/DefaultMaven.java
index c7c0806..92c8c0f 100644
--- a/maven-core/src/main/java/org/apache/maven/DefaultMaven.java
+++ b/maven-core/src/main/java/org/apache/maven/DefaultMaven.java
@@ -269,7 +269,7 @@
         return lifecycleListeners;
     }
 
-    private MavenExecutionResult processResult( MavenExecutionResult result, Exception e )
+    private MavenExecutionResult processResult( MavenExecutionResult result, Throwable e )
     {
         ExceptionHandler handler = new DefaultExceptionHandler();
         
