diff --git a/maven-core/src/main/java/org/apache/maven/exception/ExceptionSummary.java b/maven-core/src/main/java/org/apache/maven/exception/ExceptionSummary.java
index 1c9d71d..1325e04 100644
--- a/maven-core/src/main/java/org/apache/maven/exception/ExceptionSummary.java
+++ b/maven-core/src/main/java/org/apache/maven/exception/ExceptionSummary.java
@@ -28,20 +28,20 @@
 
 public class ExceptionSummary
 {
-    private Exception exception;
+    private Throwable exception;
     
     private String message;
     
     private String reference;
 
-    public ExceptionSummary( Exception exception, String message, String reference )
+    public ExceptionSummary( Throwable exception, String message, String reference )
     {
         this.exception = exception;
         this.message = message;
         this.reference = reference;
     }
 
-    public Exception getException()
+    public Throwable getException()
     {
         return exception;
     }
