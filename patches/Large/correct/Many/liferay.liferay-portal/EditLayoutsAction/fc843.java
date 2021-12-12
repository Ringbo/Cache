diff --git a/portal-impl/src/com/liferay/portlet/layoutsadmin/action/EditLayoutsAction.java b/portal-impl/src/com/liferay/portlet/layoutsadmin/action/EditLayoutsAction.java
index a9acf81..5e44f12 100644
--- a/portal-impl/src/com/liferay/portlet/layoutsadmin/action/EditLayoutsAction.java
+++ b/portal-impl/src/com/liferay/portlet/layoutsadmin/action/EditLayoutsAction.java
@@ -951,8 +951,8 @@
 					groupId, privateLayout, parentLayoutId, nameMap, titleMap,
 					descriptionMap, keywordsMap, robotsMap,
 					LayoutConstants.TYPE_PORTLET,
-					typeSettingsProperties.toSortedString(), hidden,
-					friendlyURLMap, serviceContext);
+					typeSettingsProperties.toString(), hidden, friendlyURLMap,
+					serviceContext);
 			}
 			else {
 				long copyLayoutId = ParamUtil.getLong(
@@ -977,8 +977,8 @@
 				layout = LayoutServiceUtil.addLayout(
 					groupId, privateLayout, parentLayoutId, nameMap, titleMap,
 					descriptionMap, keywordsMap, robotsMap, type,
-					typeSettingsProperties.toSortedString(), hidden,
-					friendlyURLMap, serviceContext);
+					typeSettingsProperties.toString(), hidden, friendlyURLMap,
+					serviceContext);
 
 				LayoutTypePortlet layoutTypePortlet =
 					(LayoutTypePortlet)layout.getLayoutType();
@@ -1229,7 +1229,7 @@
 
 			LayoutServiceUtil.updateLayout(
 				groupId, privateLayout, layoutId,
-				typeSettingsProperties.toSortedString());
+				typeSettingsProperties.toString());
 
 			LayoutServiceUtil.updateLookAndFeel(
 				groupId, privateLayout, layoutId, deviceThemeId,
