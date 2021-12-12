diff --git a/src/main/java/com/google/devtools/build/lib/bazel/rules/cpp/BazelCppSemantics.java b/src/main/java/com/google/devtools/build/lib/bazel/rules/cpp/BazelCppSemantics.java
index e7b9830..0296eda 100644
--- a/src/main/java/com/google/devtools/build/lib/bazel/rules/cpp/BazelCppSemantics.java
+++ b/src/main/java/com/google/devtools/build/lib/bazel/rules/cpp/BazelCppSemantics.java
@@ -83,7 +83,7 @@
 
   @Override
   public boolean needsDotdInputPruning() {
-    return true;
+    return false;
   }
   
   @Override
