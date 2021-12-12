diff --git a/idea/src/org/jetbrains/kotlin/idea/framework/ui/ChooseModulePanel.java b/idea/src/org/jetbrains/kotlin/idea/framework/ui/ChooseModulePanel.java
index 0d5c699..a73e1fe 100644
--- a/idea/src/org/jetbrains/kotlin/idea/framework/ui/ChooseModulePanel.java
+++ b/idea/src/org/jetbrains/kotlin/idea/framework/ui/ChooseModulePanel.java
@@ -95,7 +95,7 @@
             });
         }
         else {
-            allModulesWithKtNames.setText(StringUtil.join(modules, new Function<Module, String>() {
+            allModulesWithKtNames.setText(StringUtil.join(modulesWithKtFiles, new Function<Module, String>() {
                 @Override
                 public String fun(Module module) {
                     return module.getName();
