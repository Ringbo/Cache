diff --git a/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
index daa7c7f..73b384a 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
@@ -276,7 +276,7 @@
 
 		// Layout friendly URLs
 
-		layoutFriendlyURLLocalService.addLayoutFriendlyURLs(
+		layoutFriendlyURLLocalService.updateLayoutFriendlyURLs(
 			user.getCompanyId(), groupId, plid, privateLayout, friendlyURLMap,
 			serviceContext);
 
