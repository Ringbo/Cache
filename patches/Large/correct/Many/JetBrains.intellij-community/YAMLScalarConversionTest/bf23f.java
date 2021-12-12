diff --git a/plugins/yaml/testSrc/org/jetbrains/yaml/scalarConversion/YAMLScalarConversionTest.java b/plugins/yaml/testSrc/org/jetbrains/yaml/scalarConversion/YAMLScalarConversionTest.java
index 77612ef..741472a 100644
--- a/plugins/yaml/testSrc/org/jetbrains/yaml/scalarConversion/YAMLScalarConversionTest.java
+++ b/plugins/yaml/testSrc/org/jetbrains/yaml/scalarConversion/YAMLScalarConversionTest.java
@@ -60,7 +60,7 @@
 
     final String text;
     try {
-      text = FileUtil.loadFile(new File(getTestDataPath() + getTestName(true) + ".txt"));
+      text = FileUtil.loadFile(new File(getTestDataPath() + getTestName(true) + ".txt"), true);
     }
     catch (IOException e) {
       fail(e.toString());
