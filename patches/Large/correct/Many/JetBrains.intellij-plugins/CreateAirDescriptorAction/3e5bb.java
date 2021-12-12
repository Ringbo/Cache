diff --git a/flex/src/com/intellij/lang/javascript/flex/actions/airdescriptor/CreateAirDescriptorAction.java b/flex/src/com/intellij/lang/javascript/flex/actions/airdescriptor/CreateAirDescriptorAction.java
index 81a9361..aa9f668 100644
--- a/flex/src/com/intellij/lang/javascript/flex/actions/airdescriptor/CreateAirDescriptorAction.java
+++ b/flex/src/com/intellij/lang/javascript/flex/actions/airdescriptor/CreateAirDescriptorAction.java
@@ -94,7 +94,7 @@
           attributes.setProperty("android_permissions_start", parameters.isAndroidPermissionsEnabled() ? "" : "<!--");
           attributes.setProperty("android_permissions_end", parameters.isAndroidPermissionsEnabled() ? "" : "-->");
 
-          final String airDescriptorContent = FileTemplateUtil.mergeTemplate(attributes, airDescriptorContentTemplate);
+          final String airDescriptorContent = FileTemplateUtil.mergeTemplate(attributes, airDescriptorContentTemplate, true);
           final VirtualFile descriptorFolder = VfsUtil.createDirectories(parameters.getDescriptorFolderPath());
           return FlexUtils.addFileWithContent(parameters.getDescriptorFileName(), airDescriptorContent, descriptorFolder);
         }
