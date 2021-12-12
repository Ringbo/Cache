diff --git a/maven-core/src/main/java/org/apache/maven/exception/DefaultExceptionHandler.java b/maven-core/src/main/java/org/apache/maven/exception/DefaultExceptionHandler.java
index 6438f59..4dcb880 100644
--- a/maven-core/src/main/java/org/apache/maven/exception/DefaultExceptionHandler.java
+++ b/maven-core/src/main/java/org/apache/maven/exception/DefaultExceptionHandler.java
@@ -79,7 +79,7 @@
 public class DefaultExceptionHandler
     implements ExceptionHandler
 {
-    public ExceptionSummary handleException( Exception exception )
+    public ExceptionSummary handleException( Throwable exception )
     {
         String message;
         
