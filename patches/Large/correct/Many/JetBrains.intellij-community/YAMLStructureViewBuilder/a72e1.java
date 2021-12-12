diff --git a/plugins/yaml/src/org/jetbrains/yaml/structureView/YAMLStructureViewBuilder.java b/plugins/yaml/src/org/jetbrains/yaml/structureView/YAMLStructureViewBuilder.java
index ef265ed..af94671 100644
--- a/plugins/yaml/src/org/jetbrains/yaml/structureView/YAMLStructureViewBuilder.java
+++ b/plugins/yaml/src/org/jetbrains/yaml/structureView/YAMLStructureViewBuilder.java
@@ -23,6 +23,6 @@
   public StructureViewModel createStructureViewModel() {
     return new StructureViewModelBase(myPsiFile, new YAMLStructureViewElement(myPsiFile))
       .withSorters(Sorter.ALPHA_SORTER)
-      .withSuitableClasses(YAMLDocument.class, YAMLKeyValue.class);
+      .withSuitableClasses(YAMLFile.class, YAMLDocument.class, YAMLKeyValue.class);
   }
 }
