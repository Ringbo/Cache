diff --git a/python/educational-core/src/com/jetbrains/edu/learning/intellij/stepik/EduRemoteCourseModuleBuilder.java b/python/educational-core/src/com/jetbrains/edu/learning/intellij/stepik/EduRemoteCourseModuleBuilder.java
index 2241f33..db12a00 100644
--- a/python/educational-core/src/com/jetbrains/edu/learning/intellij/stepik/EduRemoteCourseModuleBuilder.java
+++ b/python/educational-core/src/com/jetbrains/edu/learning/intellij/stepik/EduRemoteCourseModuleBuilder.java
@@ -65,7 +65,7 @@
   @Nullable
   @Override
   public ModuleWizardStep modifySettingsStep(@NotNull SettingsStep settingsStep) {
-    return myModuleBuilder.modifySettingsStep(settingsStep);
+    return myModuleBuilder.modifyProjectTypeStep(settingsStep);
   }
 
   @NotNull
