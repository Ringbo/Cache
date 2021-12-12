diff --git a/src/com/google/javascript/jscomp/SyntacticScopeCreator.java b/src/com/google/javascript/jscomp/SyntacticScopeCreator.java
index 8d6b055..59e36b5 100644
--- a/src/com/google/javascript/jscomp/SyntacticScopeCreator.java
+++ b/src/com/google/javascript/jscomp/SyntacticScopeCreator.java
@@ -116,7 +116,8 @@
       scanVars(body);
     } else {
       // It's either a module or the global block
-      Preconditions.checkState(n.isModuleBody() || scope.getParent() == null);
+      Preconditions.checkState(n.isModuleBody() || scope.getParent() == null,
+          "Expected %s to be a module body, or %s to be the global scope.", n, scope);
       scanVars(n);
     }
   }
