diff --git a/src/com/google/javascript/refactoring/SuggestedFix.java b/src/com/google/javascript/refactoring/SuggestedFix.java
index 42db7e7..5ae7f28 100644
--- a/src/com/google/javascript/refactoring/SuggestedFix.java
+++ b/src/com/google/javascript/refactoring/SuggestedFix.java
@@ -574,8 +574,7 @@
       String shortName = namespace.substring(namespace.lastIndexOf('.') + 1);
 
       if (script.isModuleBody()) {
-        // TODO(tbreisacher): Switch to IR.const() once ES6+ is on by default everywhere.
-        googRequireNode = IR.var(IR.name(shortName), googRequireNode);
+        googRequireNode = IR.constNode(IR.name(shortName), googRequireNode);
       } else {
         googRequireNode = IR.exprResult(googRequireNode);
       }
