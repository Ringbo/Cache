diff --git a/extensions/jython/src/com/google/refine/jython/JythonEvaluable.java b/extensions/jython/src/com/google/refine/jython/JythonEvaluable.java
index ebe6689..2b96794 100644
--- a/extensions/jython/src/com/google/refine/jython/JythonEvaluable.java
+++ b/extensions/jython/src/com/google/refine/jython/JythonEvaluable.java
@@ -128,7 +128,7 @@
 
             return unwrap(result);
         } catch (PyException e) {
-            return new EvalError(e.getMessage());
+            return new EvalError(e.toString());
         }
     }
     
