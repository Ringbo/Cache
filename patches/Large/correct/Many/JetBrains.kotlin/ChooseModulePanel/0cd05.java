diff --git a/idea/src/org/jetbrains/kotlin/idea/framework/ui/ChooseModulePanel.java b/idea/src/org/jetbrains/kotlin/idea/framework/ui/ChooseModulePanel.java
index ddb022f..972febb 100644
--- a/idea/src/org/jetbrains/kotlin/idea/framework/ui/ChooseModulePanel.java
+++ b/idea/src/org/jetbrains/kotlin/idea/framework/ui/ChooseModulePanel.java
@@ -71,7 +71,7 @@
         allModulesWithKtRadioButton.addActionListener(listener);
         allModulesRadioButton.addActionListener(listener);
 
-        String fullList = StringUtil.join(modules, new Function<Module, String>() {
+        String fullList = StringUtil.join(modulesWithKtFiles, new Function<Module, String>() {
             @Override
             public String fun(Module module) {
                 return module.getName();
