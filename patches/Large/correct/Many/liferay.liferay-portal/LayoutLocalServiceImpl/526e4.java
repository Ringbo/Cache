diff --git a/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
index cc17e9f..6dc6de1 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/LayoutLocalServiceImpl.java
@@ -738,7 +738,7 @@
 
 		// Layout set
 
-		if (!GetterUtil.getBoolean(
+		if (GetterUtil.getBoolean(
 				serviceContext.getAttribute("updatePageCount"), true)) {
 
 			layoutSetLocalService.updatePageCount(groupId, privateLayout);
