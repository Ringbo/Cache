diff --git a/src/com/maddyhome/idea/vim/helper/PsiHelper.java b/src/com/maddyhome/idea/vim/helper/PsiHelper.java
index cce01ce..4625e5e 100644
--- a/src/com/maddyhome/idea/vim/helper/PsiHelper.java
+++ b/src/com/maddyhome/idea/vim/helper/PsiHelper.java
@@ -49,7 +49,7 @@
     StructureViewBuilder structureViewBuilder = LanguageStructureViewBuilder.INSTANCE.getStructureViewBuilder(file);
     if (!(structureViewBuilder instanceof TreeBasedStructureViewBuilder)) return -1;
     TreeBasedStructureViewBuilder builder = (TreeBasedStructureViewBuilder)structureViewBuilder;
-    StructureViewModel model = builder.createStructureViewModel(editor);
+    StructureViewModel model = builder.createStructureViewModel();
 
     TIntArrayList navigationOffsets = new TIntArrayList();
     addNavigationElements(model.getRoot(), navigationOffsets, isStart);
