diff --git a/maven-core/src/main/java/org/apache/maven/exception/ExceptionHandler.java b/maven-core/src/main/java/org/apache/maven/exception/ExceptionHandler.java
index 058653a..4dec0ee 100644
--- a/maven-core/src/main/java/org/apache/maven/exception/ExceptionHandler.java
+++ b/maven-core/src/main/java/org/apache/maven/exception/ExceptionHandler.java
@@ -21,5 +21,5 @@
 
 public interface ExceptionHandler    
 {
-    ExceptionSummary handleException( Exception e );
+    ExceptionSummary handleException( Throwable e );
 }
