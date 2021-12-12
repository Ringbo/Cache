diff --git a/src/main/java/com/google/devtools/build/lib/rules/cpp/CcToolchainFeatures.java b/src/main/java/com/google/devtools/build/lib/rules/cpp/CcToolchainFeatures.java
index db8774d..ec65b31 100644
--- a/src/main/java/com/google/devtools/build/lib/rules/cpp/CcToolchainFeatures.java
+++ b/src/main/java/com/google/devtools/build/lib/rules/cpp/CcToolchainFeatures.java
@@ -1695,7 +1695,7 @@
     /**
      * @return the command line for the given {@code action}.
      */
-    List<String> getCommandLine(String action, Variables variables) {
+    public List<String> getCommandLine(String action, Variables variables) {
       List<String> commandLine = new ArrayList<>();
       for (Feature feature : enabledFeatures) {
         feature.expandCommandLine(action, variables, enabledFeatureNames, commandLine);
