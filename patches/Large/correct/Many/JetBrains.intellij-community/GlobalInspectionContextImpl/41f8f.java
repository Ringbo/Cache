diff --git a/inspections/impl/com/intellij/codeInspection/ex/GlobalInspectionContextImpl.java b/inspections/impl/com/intellij/codeInspection/ex/GlobalInspectionContextImpl.java
index 9e7cc31..3f65b478 100644
--- a/inspections/impl/com/intellij/codeInspection/ex/GlobalInspectionContextImpl.java
+++ b/inspections/impl/com/intellij/codeInspection/ex/GlobalInspectionContextImpl.java
@@ -315,7 +315,7 @@
         performInspectionsWithProgress(scope, runWithEditorSettings, manager);
         final HashMap<InspectionTool, HighlightDisplayLevel> tools = new HashMap<InspectionTool, HighlightDisplayLevel>();
         if (runWithEditorSettings){
-          final Set<String> profiles = myCurrentScope.getActiveInspectionProfiles();
+          final Set<String> profiles = scope.getActiveInspectionProfiles();
           for (String profileName : profiles) {
             collectProfileTools((InspectionProfileImpl)InspectionProjectProfileManager.getInstance(myProject).getProfile(profileName), tools);
           }
