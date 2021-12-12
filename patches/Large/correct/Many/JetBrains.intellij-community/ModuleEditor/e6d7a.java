diff --git a/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/ModuleEditor.java b/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/ModuleEditor.java
index c2c035a..082be71 100644
--- a/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/ModuleEditor.java
+++ b/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/ModuleEditor.java
@@ -180,7 +180,7 @@
     return new ModuleConfigurationStateImpl(myProject, myModulesProvider) {
       @Override
       public ModifiableRootModel getRootModel() {
-        return getModifiableRootModel();
+        return getModifiableRootModelProxy();
       }
 
       @Override
