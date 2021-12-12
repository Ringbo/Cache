diff --git a/idea/src/org/jetbrains/jet/plugin/refactoring/extractFunction/ui/KotlinExtractFunctionDialog.java b/idea/src/org/jetbrains/jet/plugin/refactoring/extractFunction/ui/KotlinExtractFunctionDialog.java
index 9245e60..0bf8cb4 100644
--- a/idea/src/org/jetbrains/jet/plugin/refactoring/extractFunction/ui/KotlinExtractFunctionDialog.java
+++ b/idea/src/org/jetbrains/jet/plugin/refactoring/extractFunction/ui/KotlinExtractFunctionDialog.java
@@ -276,6 +276,6 @@
 
     @NotNull
     public ExtractionGeneratorOptions getGeneratorOptions() {
-        return new ExtractionGeneratorOptions(false, propertyCheckBox.isSelected());
+        return new ExtractionGeneratorOptions(false, propertyCheckBox.isSelected(), false);
     }
 }
