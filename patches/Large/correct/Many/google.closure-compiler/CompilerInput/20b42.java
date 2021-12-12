diff --git a/src/com/google/javascript/jscomp/CompilerInput.java b/src/com/google/javascript/jscomp/CompilerInput.java
index 4b71ebb..c6f162f 100644
--- a/src/com/google/javascript/jscomp/CompilerInput.java
+++ b/src/com/google/javascript/jscomp/CompilerInput.java
@@ -306,7 +306,7 @@
         return new LazyParsedDependencyInfo(info, (JsAst) ast, compiler);
       } catch (IOException e) {
         compiler.getErrorManager().report(CheckLevel.ERROR,
-            JSError.make(AbstractCompiler.READ_ERROR, getName()));
+            JSError.make(AbstractCompiler.READ_ERROR, getName(), e.getMessage()));
         return SimpleDependencyInfo.EMPTY;
       }
     } else {
