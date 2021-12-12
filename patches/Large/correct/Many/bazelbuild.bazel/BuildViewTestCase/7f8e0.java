diff --git a/src/test/java/com/google/devtools/build/lib/analysis/util/BuildViewTestCase.java b/src/test/java/com/google/devtools/build/lib/analysis/util/BuildViewTestCase.java
index 62889d5..c2a6a1a 100644
--- a/src/test/java/com/google/devtools/build/lib/analysis/util/BuildViewTestCase.java
+++ b/src/test/java/com/google/devtools/build/lib/analysis/util/BuildViewTestCase.java
@@ -1159,7 +1159,7 @@
    * <p>This should be used for targets use configurations with C++ fragments.
    */
   protected String stripCppPrefixForDynamicConfigs(String outputPath) {
-    return targetConfig.useDynamicConfigurations()
+    return targetConfig.trimConfigurations()
         ? AnalysisTestUtil.OUTPUT_PATH_CPP_PREFIX_PATTERN.matcher(outputPath).replaceFirst("")
         : outputPath;
   }
