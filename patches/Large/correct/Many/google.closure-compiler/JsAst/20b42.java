diff --git a/src/com/google/javascript/jscomp/JsAst.java b/src/com/google/javascript/jscomp/JsAst.java
index 1562e3a..b94b909 100644
--- a/src/com/google/javascript/jscomp/JsAst.java
+++ b/src/com/google/javascript/jscomp/JsAst.java
@@ -172,7 +172,7 @@
       }
     } catch (IOException e) {
       compiler.report(
-          JSError.make(AbstractCompiler.READ_ERROR, sourceFile.getName()));
+          JSError.make(AbstractCompiler.READ_ERROR, sourceFile.getName(), e.getMessage()));
     }
 
     if (root == null) {
