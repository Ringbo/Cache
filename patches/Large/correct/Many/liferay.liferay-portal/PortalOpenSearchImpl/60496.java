diff --git a/portal-impl/src/com/liferay/portal/search/PortalOpenSearchImpl.java b/portal-impl/src/com/liferay/portal/search/PortalOpenSearchImpl.java
index c0cbf58..e9cc9ee 100644
--- a/portal-impl/src/com/liferay/portal/search/PortalOpenSearchImpl.java
+++ b/portal-impl/src/com/liferay/portal/search/PortalOpenSearchImpl.java
@@ -138,7 +138,8 @@
 					String snippet = results.snippet(i);
 
 					Summary summary = indexer.getSummary(
-						result, themeDisplay.getLocale(), snippet, portletURL);
+						result, themeDisplay.getLocale(), snippet, portletURL,
+						null, null);
 
 					title = summary.getTitle();
 					url = portletURL.toString();
