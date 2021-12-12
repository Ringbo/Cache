diff --git a/hooks/so-hook/docroot/WEB-INF/src/com/liferay/so/hook/events/ServicePreAction.java b/hooks/so-hook/docroot/WEB-INF/src/com/liferay/so/hook/events/ServicePreAction.java
index 2a036e9..8a8093c 100644
--- a/hooks/so-hook/docroot/WEB-INF/src/com/liferay/so/hook/events/ServicePreAction.java
+++ b/hooks/so-hook/docroot/WEB-INF/src/com/liferay/so/hook/events/ServicePreAction.java
@@ -134,7 +134,8 @@
 		throws Exception {
 
 		List<Layout> layouts = LayoutLocalServiceUtil.getLayouts(
-			groupId, false, LayoutConstants.DEFAULT_PARENT_LAYOUT_ID, 0, 1);
+			groupId, false, LayoutConstants.DEFAULT_PARENT_LAYOUT_ID, false,
+			0, 1);
 
 		if (layouts.size() > 0) {
 			Layout layout = layouts.get(0);
