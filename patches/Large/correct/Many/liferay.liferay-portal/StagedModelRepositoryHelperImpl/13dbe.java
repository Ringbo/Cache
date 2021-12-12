diff --git a/modules/apps/export-import/export-import-service/src/main/java/com/liferay/exportimport/internal/staged/model/repository/StagedModelRepositoryHelperImpl.java b/modules/apps/export-import/export-import-service/src/main/java/com/liferay/exportimport/internal/staged/model/repository/StagedModelRepositoryHelperImpl.java
index 227ae45..4d29871 100644
--- a/modules/apps/export-import/export-import-service/src/main/java/com/liferay/exportimport/internal/staged/model/repository/StagedModelRepositoryHelperImpl.java
+++ b/modules/apps/export-import/export-import-service/src/main/java/com/liferay/exportimport/internal/staged/model/repository/StagedModelRepositoryHelperImpl.java
@@ -38,13 +38,13 @@
 	implements StagedModelRepositoryHelper {
 
 	@Override
-	public StagedModel fetchMissingReference(
+	public <T extends StagedModel> T fetchMissingReference(
 		String uuid, long groupId,
-		StagedModelRepository<?> stagedModelRepository) {
+		StagedModelRepository<T> stagedModelRepository) {
 
 		// Try to fetch the existing staged model from the importing group
 
-		StagedModel existingStagedModel =
+		T existingStagedModel =
 			stagedModelRepository.fetchStagedModelByUuidAndGroupId(
 				uuid, groupId);
 
@@ -80,12 +80,11 @@
 				return existingStagedModel;
 			}
 
-			List<StagedModel> existingStagedModels =
-				(List<StagedModel>)
+			List<T> existingStagedModels =
 					stagedModelRepository.fetchStagedModelsByUuidAndCompanyId(
 						uuid, originalGroup.getCompanyId());
 
-			for (StagedModel stagedModel : existingStagedModels) {
+			for (T stagedModel : existingStagedModels) {
 				try {
 					if (stagedModel instanceof StagedGroupedModel) {
 						StagedGroupedModel stagedGroupedModel =
