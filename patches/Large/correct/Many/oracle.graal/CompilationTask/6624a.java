diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/CompilationTask.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/CompilationTask.java
index 242e5db..ac83b96 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/CompilationTask.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/CompilationTask.java
@@ -233,9 +233,10 @@
             handleException(t);
             /*
              * Treat random exceptions from the compiler as indicating a problem compiling this
-             * method.
+             * method. Report the result of toString instead of getMessage to ensure that the
+             * exception type is included in the output in case there's no detail mesage.
              */
-            return CompilationRequestResult.failure(t.getMessage(), false);
+            return CompilationRequestResult.failure(t.toString(), false);
         } finally {
             try {
                 int compiledBytecodes = 0;
