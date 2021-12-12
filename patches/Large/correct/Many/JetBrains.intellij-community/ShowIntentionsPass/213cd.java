diff --git a/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/ShowIntentionsPass.java b/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/ShowIntentionsPass.java
index 12028ab..51bc88c 100644
--- a/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/ShowIntentionsPass.java
+++ b/platform/lang-impl/src/com/intellij/codeInsight/daemon/impl/ShowIntentionsPass.java
@@ -84,7 +84,7 @@
     final int offset = ((EditorEx)editor).getExpectedCaretOffset();
     final Project project = file.getProject();
 
-    final List<HighlightInfo.IntentionActionDescriptor> result = new ArrayList<HighlightInfo.IntentionActionDescriptor>();
+    final List<HighlightInfo.IntentionActionDescriptor> result = new ArrayList<>();
     DaemonCodeAnalyzerImpl.processHighlightsNearOffset(editor.getDocument(), project, HighlightSeverity.INFORMATION, offset, true, info -> {
       addAvailableActionsForGroups(info, editor, file, result, passId, offset);
       return true;
@@ -244,7 +244,7 @@
   private static boolean appendCleanupCode(@NotNull List<HighlightInfo.IntentionActionDescriptor> actionDescriptors, @NotNull PsiFile file) {
     for (HighlightInfo.IntentionActionDescriptor descriptor : actionDescriptors) {
       if (descriptor.canCleanup(file)) {
-        final ArrayList<IntentionAction> options = new ArrayList<IntentionAction>();
+        final ArrayList<IntentionAction> options = new ArrayList<>();
         options.add(EditCleanupProfileIntentionAction.INSTANCE);
         options.add(CleanupOnScopeIntention.INSTANCE);
         actionDescriptors.add(new HighlightInfo.IntentionActionDescriptor(CleanupAllIntention.INSTANCE, options, "Code Cleanup Options"));
@@ -303,7 +303,7 @@
                                                                  (psiFile, editor) -> ShowIntentionActionsHandler.availableFor(psiFile, editor, action));
 
       if (place != null) {
-        List<IntentionAction> enableDisableIntentionAction = new ArrayList<IntentionAction>();
+        List<IntentionAction> enableDisableIntentionAction = new ArrayList<>();
         enableDisableIntentionAction.add(new IntentionHintComponent.EnableDisableIntentionAction(action));
         enableDisableIntentionAction.add(new IntentionHintComponent.EditIntentionSettingsAction(action));
         HighlightInfo.IntentionActionDescriptor descriptor = new HighlightInfo.IntentionActionDescriptor(action, enableDisableIntentionAction, null);
@@ -367,7 +367,7 @@
 
         final Set<String> dialectIds = InspectionEngine.calcElementDialectIds(elements);
         final LocalInspectionToolSession session = new LocalInspectionToolSession(hostFile, 0, hostFile.getTextLength());
-        final Processor<LocalInspectionToolWrapper> processor = (toolWrapper) -> {
+        final Processor<LocalInspectionToolWrapper> processor = toolWrapper -> {
           final LocalInspectionTool localInspectionTool = toolWrapper.getTool();
           final HighlightDisplayKey key = HighlightDisplayKey.find(toolWrapper.getShortName());
           final String displayName = toolWrapper.getDisplayName();
@@ -397,7 +397,7 @@
           localInspectionTool.inspectionFinished(session, holder);
           return true;
         };
-        JobLauncher.getInstance().invokeConcurrentlyUnderProgress(intentionTools, new EmptyProgressIndicator(), false, processor);
+        JobLauncher.getInstance().invokeConcurrentlyUnderProgress(intentionTools, new DaemonProgressIndicator(), false, processor);
       }
     }
   }
