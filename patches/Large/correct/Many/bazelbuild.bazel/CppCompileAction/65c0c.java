diff --git a/src/main/java/com/google/devtools/build/lib/rules/cpp/CppCompileAction.java b/src/main/java/com/google/devtools/build/lib/rules/cpp/CppCompileAction.java
index 6465f6c..9347365 100644
--- a/src/main/java/com/google/devtools/build/lib/rules/cpp/CppCompileAction.java
+++ b/src/main/java/com/google/devtools/build/lib/rules/cpp/CppCompileAction.java
@@ -844,7 +844,7 @@
   }
 
   @Override
-  public Map<String, String> getExecutionInfo() {
+  public ImmutableMap<String, String> getExecutionInfo() {
     ImmutableMap.Builder<String, String> result = ImmutableMap.<String, String>builder();
     for (String requirement : executionRequirements) {
       result.put(requirement, "");
