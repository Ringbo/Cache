diff --git a/portal-impl/src/com/liferay/portal/service/impl/LayoutFriendlyURLLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/LayoutFriendlyURLLocalServiceImpl.java
index b2c0392..0b369ee 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/LayoutFriendlyURLLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/LayoutFriendlyURLLocalServiceImpl.java
@@ -233,7 +233,7 @@
 	public Map<Long, String> getLayoutFriendlyURLs(
 		Group siteGroup, List<Layout> layouts, String languageId) {
 
-		Map<Long, String> layoutFriendlyURLMap = new HashMap<>(layouts.size());
+		Map<Long, String> layoutFriendlyURLMap = new HashMap<>();
 
 		UnicodeProperties typeSettingsProperties =
 			siteGroup.getTypeSettingsProperties();
