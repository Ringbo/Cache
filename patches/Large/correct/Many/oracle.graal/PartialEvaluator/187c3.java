diff --git a/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/PartialEvaluator.java b/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/PartialEvaluator.java
index 500f0ae..3dbe548 100644
--- a/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/PartialEvaluator.java
+++ b/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/PartialEvaluator.java
@@ -180,7 +180,7 @@
     private class InlineInvokePlugin implements GraphBuilderPlugins.InlineInvokePlugin {
 
         public boolean shouldInlineInvoke(ResolvedJavaMethod method, int depth) {
-            return method.getAnnotation(TruffleBoundary.class) != null;
+            return method.getAnnotation(TruffleBoundary.class) == null;
         }
 
     }
