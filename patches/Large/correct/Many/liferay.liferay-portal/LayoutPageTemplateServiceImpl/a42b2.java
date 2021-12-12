diff --git a/modules/apps/web-experience/layout/layout-page-template-service/src/main/java/com/liferay/layout/page/template/service/impl/LayoutPageTemplateServiceImpl.java b/modules/apps/web-experience/layout/layout-page-template-service/src/main/java/com/liferay/layout/page/template/service/impl/LayoutPageTemplateServiceImpl.java
index 785c817..95f997c 100644
--- a/modules/apps/web-experience/layout/layout-page-template-service/src/main/java/com/liferay/layout/page/template/service/impl/LayoutPageTemplateServiceImpl.java
+++ b/modules/apps/web-experience/layout/layout-page-template-service/src/main/java/com/liferay/layout/page/template/service/impl/LayoutPageTemplateServiceImpl.java
@@ -49,7 +49,7 @@
 			LayoutPageTemplateActionKeys.ADD_LAYOUT_PAGE_TEMPLATE);
 
 		return layoutPageTemplateLocalService.addLayoutPageTemplate(
-			groupId, getUserId(), layoutPageTemplateFolderId, name,
+			getUserId(), groupId, layoutPageTemplateFolderId, name,
 			layoutPageTemplateFragments, serviceContext);
 	}
 
@@ -175,7 +175,8 @@
 			getPermissionChecker(), pageTemplateId, ActionKeys.UPDATE);
 
 		return layoutPageTemplateLocalService.updateLayoutPageTemplate(
-			pageTemplateId, name, layoutPageTemplateFragments, serviceContext);
+			getUserId(), pageTemplateId, name, layoutPageTemplateFragments,
+			serviceContext);
 	}
 
 	private static final Log _log = LogFactoryUtil.getLog(
