diff --git a/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api/src/main/java/org/apache/nifi/web/api/VersionsResource.java b/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api/src/main/java/org/apache/nifi/web/api/VersionsResource.java
index dcc8493..518ceeb 100644
--- a/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api/src/main/java/org/apache/nifi/web/api/VersionsResource.java
+++ b/nifi-nar-bundles/nifi-framework-bundle/nifi-framework/nifi-web/nifi-web-api/src/main/java/org/apache/nifi/web/api/VersionsResource.java
@@ -820,7 +820,7 @@
                 versionControlInfoDto.setState(flowState.name());
 
                 final ProcessGroupEntity updatedGroup = serviceFacade.updateProcessGroupContents(rev, groupId, versionControlInfoDto, flowSnapshot, getIdGenerationSeed().orElse(null), false,
-                    true, entity.getUpdateDescendantVersionedFlows());
+                    false, entity.getUpdateDescendantVersionedFlows());
                 final VersionControlInformationDTO updatedVci = updatedGroup.getComponent().getVersionControlInformation();
 
                 final VersionControlInformationEntity responseEntity = new VersionControlInformationEntity();
