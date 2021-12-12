diff --git a/idea/src/org/jetbrains/jet/plugin/framework/KotlinModuleSettingStep.java b/idea/src/org/jetbrains/jet/plugin/framework/KotlinModuleSettingStep.java
index b71ed99..dca091e 100644
--- a/idea/src/org/jetbrains/jet/plugin/framework/KotlinModuleSettingStep.java
+++ b/idea/src/org/jetbrains/jet/plugin/framework/KotlinModuleSettingStep.java
@@ -57,7 +57,7 @@
     public KotlinModuleSettingStep(TargetPlatform targetPlatform, ModuleBuilder moduleBuilder, @NotNull SettingsStep settingsStep) {
         this.targetPlatform = targetPlatform;
 
-        myJavaStep = JavaModuleType.getModuleType().modifySettingsStep(settingsStep, moduleBuilder);
+        myJavaStep = JavaModuleType.getModuleType().modifyProjectTypeStep(settingsStep, moduleBuilder);
 
         basePath = moduleBuilder.getContentEntryPath();
         librariesContainer = LibrariesContainerFactory.createContainer(settingsStep.getContext().getProject());
