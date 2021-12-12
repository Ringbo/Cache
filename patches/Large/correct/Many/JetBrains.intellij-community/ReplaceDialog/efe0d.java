diff --git a/plugins/structuralsearch/source/com/intellij/structuralsearch/plugin/replace/ui/ReplaceDialog.java b/plugins/structuralsearch/source/com/intellij/structuralsearch/plugin/replace/ui/ReplaceDialog.java
index d75ce3c..fb6956f 100644
--- a/plugins/structuralsearch/source/com/intellij/structuralsearch/plugin/replace/ui/ReplaceDialog.java
+++ b/plugins/structuralsearch/source/com/intellij/structuralsearch/plugin/replace/ui/ReplaceDialog.java
@@ -109,7 +109,7 @@
     final Runnable replaceRunnable = new Runnable() {
       public void run() {
         LocalVcs instance = LocalVcs.getInstance(searchContext.getProject());
-        LocalHistoryAction lvcsAction = instance.startAction(getDefaultTitle(), null, false);
+        LocalHistoryAction lvcsAction = instance.startAction_New(getDefaultTitle(), null, false);
 
         doReplace(replaceContext);
         replaceContext.getUsageView().close();
@@ -127,7 +127,7 @@
         if (infos == null || infos.isEmpty()) return;
 
         LocalVcs instance = LocalVcs.getInstance(searchContext.getProject());
-        LocalHistoryAction lvcsAction = instance.startAction(getDefaultTitle(), null, false);
+        LocalHistoryAction lvcsAction = instance.startAction_New(getDefaultTitle(), null, false);
 
         for (final Usage info : infos) {
           final UsageInfo2UsageAdapter usage = (UsageInfo2UsageAdapter)info;
