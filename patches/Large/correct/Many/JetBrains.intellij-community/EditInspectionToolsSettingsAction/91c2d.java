diff --git a/platform/lang-impl/src/com/intellij/codeInspection/ex/EditInspectionToolsSettingsAction.java b/platform/lang-impl/src/com/intellij/codeInspection/ex/EditInspectionToolsSettingsAction.java
index 1440771..ef9ead9 100644
--- a/platform/lang-impl/src/com/intellij/codeInspection/ex/EditInspectionToolsSettingsAction.java
+++ b/platform/lang-impl/src/com/intellij/codeInspection/ex/EditInspectionToolsSettingsAction.java
@@ -103,7 +103,7 @@
     final ShowSettingsUtil settingsUtil = ShowSettingsUtil.getInstance();
     final ErrorsConfigurable errorsConfigurable;
     if (!canChooseDifferentProfile) {
-      errorsConfigurable = new ProjectInspectionToolsConfigurable(ProjectInspectionProfileManagerImpl.getInstance(project)) {
+      errorsConfigurable = new ProjectInspectionToolsConfigurable(ProjectInspectionProfileManagerImpl.getInstanceImpl(project)) {
 
         @Override
         protected boolean setActiveProfileAsDefaultOnApply() {
