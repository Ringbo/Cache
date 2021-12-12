diff --git a/modules/apps/foundation/user-associated-data/user-associated-data-web/src/main/java/com/liferay/user/associated/data/web/internal/portlet/action/ViewUADSummaryMVCRenderCommand.java b/modules/apps/foundation/user-associated-data/user-associated-data-web/src/main/java/com/liferay/user/associated/data/web/internal/portlet/action/ViewUADSummaryMVCRenderCommand.java
index cf21485..deca5d3 100644
--- a/modules/apps/foundation/user-associated-data/user-associated-data-web/src/main/java/com/liferay/user/associated/data/web/internal/portlet/action/ViewUADSummaryMVCRenderCommand.java
+++ b/modules/apps/foundation/user-associated-data/user-associated-data-web/src/main/java/com/liferay/user/associated/data/web/internal/portlet/action/ViewUADSummaryMVCRenderCommand.java
@@ -78,7 +78,8 @@
 
 		int reviewableUADEntitiesCount =
 			_uadApplicationSummaryHelper.getReviewableUADEntitiesCount(
-				_uadRegistry.getUADEntityDisplayStream(), selUser.getUserId());
+				_uadRegistry.getUADEntityDisplayStream(),
+				selectedUser.getUserId());
 
 		if (reviewableUADEntitiesCount > 0) {
 			return 3;
