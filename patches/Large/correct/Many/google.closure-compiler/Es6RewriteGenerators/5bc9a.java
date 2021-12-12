diff --git a/src/com/google/javascript/jscomp/Es6RewriteGenerators.java b/src/com/google/javascript/jscomp/Es6RewriteGenerators.java
index a21f677..fcb84c2 100644
--- a/src/com/google/javascript/jscomp/Es6RewriteGenerators.java
+++ b/src/com/google/javascript/jscomp/Es6RewriteGenerators.java
@@ -979,7 +979,7 @@
           break;
         case Token.CASE:
           if (controlCanExit(n.getFirstChild())) {
-            compiler.report(JSError.make(currentStatement, Es6ToEs3Converter.CANNOT_CONVERT_YET,
+            compiler.report(JSError.make(n, Es6ToEs3Converter.CANNOT_CONVERT_YET,
               "Case statements that contain yields"));
             return false;
           }
@@ -997,7 +997,7 @@
         decomposer.exposeExpression(n);
         compiler.reportCodeChange();
       } else {
-        compiler.report(JSError.make(currentStatement, Es6ToEs3Converter.CANNOT_CONVERT,
+        compiler.report(JSError.make(n, Es6ToEs3Converter.CANNOT_CONVERT,
           "Undecomposable expression"));
       }
     }
