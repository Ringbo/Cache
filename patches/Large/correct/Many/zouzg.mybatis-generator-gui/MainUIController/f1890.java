diff --git a/src/main/java/com/zzg/mybatis/generator/controller/MainUIController.java b/src/main/java/com/zzg/mybatis/generator/controller/MainUIController.java
index 32b7cb8..840a720 100644
--- a/src/main/java/com/zzg/mybatis/generator/controller/MainUIController.java
+++ b/src/main/java/com/zzg/mybatis/generator/controller/MainUIController.java
@@ -291,9 +291,9 @@
         connectorPathField.setText(generatorConfig.getConnectorJarPath());
         projectFolderField.setText(generatorConfig.getProjectFolder());
         modelTargetPackage.setText(generatorConfig.getModelPackage());
-        modelTargetProject.setText(generatorConfig.getModelPackage());
+        modelTargetProject.setText(generatorConfig.getModelPackageTargetFolder());
         daoTargetPackage.setText(generatorConfig.getDaoPackage());
-        daoTargetProject.setText(generatorConfig.getDaoPackage());
+        daoTargetProject.setText(generatorConfig.getDaoTargetFolder());
         mapperTargetPackage.setText(generatorConfig.getMappingXMLPackage());
         mappingTargetProject.setText(generatorConfig.getMappingXMLTargetFolder());
     }
