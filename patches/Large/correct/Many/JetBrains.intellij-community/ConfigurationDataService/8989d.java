diff --git a/platform/external-system-impl/src/com/intellij/openapi/externalSystem/service/project/manage/ConfigurationDataService.java b/platform/external-system-impl/src/com/intellij/openapi/externalSystem/service/project/manage/ConfigurationDataService.java
index 52674de..f926f51 100644
--- a/platform/external-system-impl/src/com/intellij/openapi/externalSystem/service/project/manage/ConfigurationDataService.java
+++ b/platform/external-system-impl/src/com/intellij/openapi/externalSystem/service/project/manage/ConfigurationDataService.java
@@ -66,7 +66,7 @@
 
     DataNode<ConfigurationData> projectConfigurationNode = ExternalSystemApiUtil.find(projectDataNode, ProjectKeys.CONFIGURATION);
     if (projectConfigurationNode != null) {
-      if (ExternalSystemApiUtil.isOneToOneMapping(project, projectDataNode.getData())) {
+      if (!ExternalSystemApiUtil.isOneToOneMapping(project, projectDataNode.getData())) {
         LOG.warn("This external project are not the only project in the current IDE workspace, " +
                  "found project level configuration can override the configuration came from other external projects.");
       }
