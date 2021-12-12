diff --git a/hooks/sevencogs-hook/docroot/WEB-INF/src/com/liferay/sevencogs/hook/upgrade/v1_0_0/UpgradeCompany.java b/hooks/sevencogs-hook/docroot/WEB-INF/src/com/liferay/sevencogs/hook/upgrade/v1_0_0/UpgradeCompany.java
index a2db9d2..758fd7d 100644
--- a/hooks/sevencogs-hook/docroot/WEB-INF/src/com/liferay/sevencogs/hook/upgrade/v1_0_0/UpgradeCompany.java
+++ b/hooks/sevencogs-hook/docroot/WEB-INF/src/com/liferay/sevencogs/hook/upgrade/v1_0_0/UpgradeCompany.java
@@ -298,7 +298,7 @@
 			group.getCreatorUserId(), group.getGroupId(), privateLayout,
 			LayoutConstants.DEFAULT_PARENT_LAYOUT_ID, name, StringPool.BLANK,
 			StringPool.BLANK, LayoutConstants.TYPE_PORTLET, false, friendlyURL,
-			false, serviceContext);
+			serviceContext);
 
 		LayoutTypePortlet layoutTypePortlet =
 			(LayoutTypePortlet)layout.getLayoutType();
