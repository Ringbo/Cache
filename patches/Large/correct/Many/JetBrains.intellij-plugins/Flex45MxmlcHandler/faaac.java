diff --git a/flex/tools/BuiltInFlexCompiler/Flex45Compiler/src/com/intellij/flex/compiler/flex45/Flex45MxmlcHandler.java b/flex/tools/BuiltInFlexCompiler/Flex45Compiler/src/com/intellij/flex/compiler/flex45/Flex45MxmlcHandler.java
index e90759e..966da4a 100644
--- a/flex/tools/BuiltInFlexCompiler/Flex45Compiler/src/com/intellij/flex/compiler/flex45/Flex45MxmlcHandler.java
+++ b/flex/tools/BuiltInFlexCompiler/Flex45Compiler/src/com/intellij/flex/compiler/flex45/Flex45MxmlcHandler.java
@@ -30,7 +30,7 @@
     final Application application;
 
     final List fileSpecs = ((CommandLineConfiguration)configuration).getFileSpecs();
-    if (fileSpecs.size() >= 0) {
+    if (fileSpecs.size() > 0) {
       final String inputFilePath = (String)fileSpecs.get(fileSpecs.size() - 1);
       application = new Application(new File(inputFilePath));
     }
