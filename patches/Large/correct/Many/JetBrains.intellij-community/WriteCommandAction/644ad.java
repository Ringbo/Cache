diff --git a/openapi/src/com/intellij/openapi/application/WriteCommandAction.java b/openapi/src/com/intellij/openapi/application/WriteCommandAction.java
index e8b0d86..3843207 100644
--- a/openapi/src/com/intellij/openapi/application/WriteCommandAction.java
+++ b/openapi/src/com/intellij/openapi/application/WriteCommandAction.java
@@ -34,7 +34,7 @@
   }
 
   public RunResult<T> execute() {
-    final RunResult<T> result = new RunResult<T>();
+    final RunResult<T> result = new RunResult<T>(this);
 
     if (canWriteNow()) {
       return executeCommand(result);
