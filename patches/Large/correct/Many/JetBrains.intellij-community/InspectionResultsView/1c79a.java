diff --git a/platform/lang-impl/src/com/intellij/codeInspection/ui/InspectionResultsView.java b/platform/lang-impl/src/com/intellij/codeInspection/ui/InspectionResultsView.java
index eb2ad34..594ee39 100644
--- a/platform/lang-impl/src/com/intellij/codeInspection/ui/InspectionResultsView.java
+++ b/platform/lang-impl/src/com/intellij/codeInspection/ui/InspectionResultsView.java
@@ -617,7 +617,7 @@
   public Set<SuppressIntentionAction> getSuppressActions(InspectionToolWrapper wrapper) {
     return mySuppressActions.computeIfAbsent(wrapper, (w) -> {
       final SuppressIntentionAction[] actions = InspectionManagerEx.getSuppressActions(w);
-      return actions == null ? Collections.emptySet() : ContainerUtil.newHashSet(actions);
+      return actions == null ? Collections.emptySet() : ContainerUtil.newLinkedHashSet(actions);
     });
   }
 
