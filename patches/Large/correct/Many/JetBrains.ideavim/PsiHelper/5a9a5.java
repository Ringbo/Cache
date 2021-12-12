diff --git a/src/com/maddyhome/idea/vim/helper/PsiHelper.java b/src/com/maddyhome/idea/vim/helper/PsiHelper.java
index 4625e5e..cce01ce 100644
--- a/src/com/maddyhome/idea/vim/helper/PsiHelper.java
+++ b/src/com/maddyhome/idea/vim/helper/PsiHelper.java
@@ -49,7 +49,7 @@
     StructureViewBuilder structureViewBuilder = LanguageStructureViewBuilder.INSTANCE.getStructureViewBuilder(file);
     if (!(structureViewBuilder instanceof TreeBasedStructureViewBuilder)) return -1;
     TreeBasedStructureViewBuilder builder = (TreeBasedStructureViewBuilder)structureViewBuilder;
-    StructureViewModel model = builder.createStructureViewModel();
+    StructureViewModel model = builder.createStructureViewModel(editor);
 
     TIntArrayList navigationOffsets = new TIntArrayList();
     addNavigationElements(model.getRoot(), navigationOffsets, isStart);
