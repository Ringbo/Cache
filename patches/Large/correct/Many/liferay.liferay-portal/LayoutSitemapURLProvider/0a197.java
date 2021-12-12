diff --git a/portal-impl/src/com/liferay/portal/util/LayoutSitemapURLProvider.java b/portal-impl/src/com/liferay/portal/util/LayoutSitemapURLProvider.java
index 677f5d8..de654ed 100644
--- a/portal-impl/src/com/liferay/portal/util/LayoutSitemapURLProvider.java
+++ b/portal-impl/src/com/liferay/portal/util/LayoutSitemapURLProvider.java
@@ -108,7 +108,7 @@
 				Locale availableLocale = entry.getKey();
 				String alternateURL = entry.getValue();
 
-				if (availableLocale.equals(defaultLocale)) {
+				if (!availableLocale.equals(defaultLocale)) {
 					SitemapUtil.addURLElement(
 						element, alternateURL, typeSettingsProperties,
 						layout.getModifiedDate(), layoutFullURL, alternateURLs);
