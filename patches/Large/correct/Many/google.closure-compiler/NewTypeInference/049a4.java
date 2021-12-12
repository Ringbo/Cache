diff --git a/src/com/google/javascript/jscomp/NewTypeInference.java b/src/com/google/javascript/jscomp/NewTypeInference.java
index 3917232..515b599 100644
--- a/src/com/google/javascript/jscomp/NewTypeInference.java
+++ b/src/com/google/javascript/jscomp/NewTypeInference.java
@@ -3236,7 +3236,8 @@
     if (NodeUtil.isFunctionBind(expr)) {
       return true;
     }
-    if (!expr.isGetProp() || !expr.getLastChild().getString().equals("bind")) {
+    if (!expr.isGetProp() || !expr.isQualifiedName()
+        || !expr.getLastChild().getString().equals("bind")) {
       return false;
     }
     Node recv = expr.getFirstChild();
