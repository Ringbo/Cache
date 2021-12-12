diff --git a/plugins/structuralsearch/source/com/intellij/structuralsearch/plugin/replace/ui/ReplaceDialog.java b/plugins/structuralsearch/source/com/intellij/structuralsearch/plugin/replace/ui/ReplaceDialog.java
index aa03c1c..4c8dffb 100644
--- a/plugins/structuralsearch/source/com/intellij/structuralsearch/plugin/replace/ui/ReplaceDialog.java
+++ b/plugins/structuralsearch/source/com/intellij/structuralsearch/plugin/replace/ui/ReplaceDialog.java
@@ -126,7 +126,7 @@
     final Runnable replaceSelected = new Runnable() {
       public void run() {
         final Set<Usage> infos = context.getUsageView().getSelectedUsages();
-        if (infos.isEmpty()) return;
+        if (infos == null || infos.isEmpty()) return;
 
         LocalVcs instance = LocalVcs.getInstance(searchContext.getProject());
         LvcsAction lvcsAction = instance.startAction("StructuralReplace",null,false);
