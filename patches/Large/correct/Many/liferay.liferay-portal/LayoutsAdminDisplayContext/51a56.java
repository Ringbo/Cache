diff --git a/modules/apps/web-experience/layout/layout-admin-web/src/main/java/com/liferay/layout/admin/web/internal/display/context/LayoutsAdminDisplayContext.java b/modules/apps/web-experience/layout/layout-admin-web/src/main/java/com/liferay/layout/admin/web/internal/display/context/LayoutsAdminDisplayContext.java
index bc7f1a0..fe55501 100644
--- a/modules/apps/web-experience/layout/layout-admin-web/src/main/java/com/liferay/layout/admin/web/internal/display/context/LayoutsAdminDisplayContext.java
+++ b/modules/apps/web-experience/layout/layout-admin-web/src/main/java/com/liferay/layout/admin/web/internal/display/context/LayoutsAdminDisplayContext.java
@@ -273,7 +273,7 @@
 
 		List<LayoutPageTemplateCollection> layoutPageTemplateCollections =
 			layoutPageTemplateCollectionService.
-				getBasicLayoutPageTemplateCollections(
+				getLayoutPageTemplateCollections(
 					getGroupId(), QueryUtil.ALL_POS, QueryUtil.ALL_POS,
 					layoutPageTemplateCollectionNameComparator);
 
