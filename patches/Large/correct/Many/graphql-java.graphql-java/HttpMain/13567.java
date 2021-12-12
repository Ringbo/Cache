diff --git a/src/test/groovy/example/http/HttpMain.java b/src/test/groovy/example/http/HttpMain.java
index c8eeacd..d8cdc92 100644
--- a/src/test/groovy/example/http/HttpMain.java
+++ b/src/test/groovy/example/http/HttpMain.java
@@ -68,9 +68,9 @@
         }
 
         ExecutionInput.Builder executionInput = newExecutionInput()
-                .requestString(parameters.getQuery())
+                .query(parameters.getQuery())
                 .operationName(parameters.getOperationName())
-                .arguments(parameters.getVariables());
+                .variables(parameters.getVariables());
 
         //
         // the context object is something that means something to down stream code.  It is instructions
