diff --git a/src/main/java/com/google/devtools/build/lib/bazel/rules/cpp/BazelCppSemantics.java b/src/main/java/com/google/devtools/build/lib/bazel/rules/cpp/BazelCppSemantics.java
index 0296eda..e7b9830 100644
--- a/src/main/java/com/google/devtools/build/lib/bazel/rules/cpp/BazelCppSemantics.java
+++ b/src/main/java/com/google/devtools/build/lib/bazel/rules/cpp/BazelCppSemantics.java
@@ -83,7 +83,7 @@
 
   @Override
   public boolean needsDotdInputPruning() {
-    return false;
+    return true;
   }
   
   @Override
