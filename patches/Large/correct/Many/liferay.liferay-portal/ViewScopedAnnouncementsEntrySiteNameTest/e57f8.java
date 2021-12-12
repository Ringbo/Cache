diff --git a/portal-web/test/com/liferay/portalweb/portlet/announcements/usecase/demo1/ViewScopedAnnouncementsEntrySiteNameTest.java b/portal-web/test/com/liferay/portalweb/portlet/announcements/usecase/demo1/ViewScopedAnnouncementsEntrySiteNameTest.java
index 4c9ef5f..1dc2ac4 100644
--- a/portal-web/test/com/liferay/portalweb/portlet/announcements/usecase/demo1/ViewScopedAnnouncementsEntrySiteNameTest.java
+++ b/portal-web/test/com/liferay/portalweb/portlet/announcements/usecase/demo1/ViewScopedAnnouncementsEntrySiteNameTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Site Name")) {
+				if (selenium.isElementPresent("link=Site Name")) {
 					break;
 				}
 			}
