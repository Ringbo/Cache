diff --git a/src/com/google/javascript/jscomp/NewTypeInference.java b/src/com/google/javascript/jscomp/NewTypeInference.java
index 53de964..83962b9 100644
--- a/src/com/google/javascript/jscomp/NewTypeInference.java
+++ b/src/com/google/javascript/jscomp/NewTypeInference.java
@@ -2560,7 +2560,7 @@
   private EnvTypePair analyzeCallNodeArgumentsBwd(
       Node callNode, TypeEnv outEnv) {
     TypeEnv env = outEnv;
-    for (int i = callNode.getChildCount() - 1; i >= 0; i--) {
+    for (int i = callNode.getChildCount() - 1; i > 0; i--) {
       Node arg = callNode.getChildAtIndex(i);
       env = analyzeExprBwd(arg, env).env;
     }
