diff --git a/src/main/java/com/google/devtools/build/lib/bazel/rules/python/BazelPythonSemantics.java b/src/main/java/com/google/devtools/build/lib/bazel/rules/python/BazelPythonSemantics.java
index 7092e5f..5b72cbd 100644
--- a/src/main/java/com/google/devtools/build/lib/bazel/rules/python/BazelPythonSemantics.java
+++ b/src/main/java/com/google/devtools/build/lib/bazel/rules/python/BazelPythonSemantics.java
@@ -110,7 +110,8 @@
         ImmutableList.of(
             Substitution.of("%main%", main),
             Substitution.of("%python_binary%", pythonBinary),
-            Substitution.of("%imports%", Joiner.on(":").join(imports))),
+            Substitution.of("%imports%", Joiner.on(":").join(imports)),
+            Substitution.of("%workspace_name%", ruleContext.getWorkspaceName())),
         true));
   }
 
