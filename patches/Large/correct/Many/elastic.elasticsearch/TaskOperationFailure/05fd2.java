diff --git a/core/src/main/java/org/elasticsearch/action/TaskOperationFailure.java b/core/src/main/java/org/elasticsearch/action/TaskOperationFailure.java
index 519adc7..8c8f263 100644
--- a/core/src/main/java/org/elasticsearch/action/TaskOperationFailure.java
+++ b/core/src/main/java/org/elasticsearch/action/TaskOperationFailure.java
@@ -88,7 +88,7 @@
         return status;
     }
 
-    public Throwable getCause() {
+    public Exception getCause() {
         return reason;
     }
 
