diff --git a/modules/apps/user-associated-data/user-associated-data-web/src/main/java/com/liferay/user/associated/data/web/internal/portlet/action/ViewUADEntitiesMVCRenderCommand.java b/modules/apps/user-associated-data/user-associated-data-web/src/main/java/com/liferay/user/associated/data/web/internal/portlet/action/ViewUADEntitiesMVCRenderCommand.java
index 744f47f..c6e469b 100644
--- a/modules/apps/user-associated-data/user-associated-data-web/src/main/java/com/liferay/user/associated/data/web/internal/portlet/action/ViewUADEntitiesMVCRenderCommand.java
+++ b/modules/apps/user-associated-data/user-associated-data-web/src/main/java/com/liferay/user/associated/data/web/internal/portlet/action/ViewUADEntitiesMVCRenderCommand.java
@@ -241,9 +241,7 @@
 
 			searchContainer.setTotal(
 				(int)uadDisplay.searchCount(
-					selectedUserId, null, displayTerms.getKeywords(),
-					searchContainer.getOrderByCol(),
-					searchContainer.getOrderByType()));
+					selectedUserId, null, displayTerms.getKeywords()));
 		}
 		catch (Exception e) {
 			if (_log.isWarnEnabled()) {
