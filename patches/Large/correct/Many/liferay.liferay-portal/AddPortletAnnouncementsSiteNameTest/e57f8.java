diff --git a/portal-web/test/com/liferay/portalweb/portlet/announcements/usecase/demo1/AddPortletAnnouncementsSiteNameTest.java b/portal-web/test/com/liferay/portalweb/portlet/announcements/usecase/demo1/AddPortletAnnouncementsSiteNameTest.java
index 6c416c6..8ccb18d 100644
--- a/portal-web/test/com/liferay/portalweb/portlet/announcements/usecase/demo1/AddPortletAnnouncementsSiteNameTest.java
+++ b/portal-web/test/com/liferay/portalweb/portlet/announcements/usecase/demo1/AddPortletAnnouncementsSiteNameTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Site Name")) {
+				if (selenium.isElementPresent("link=Site Name")) {
 					break;
 				}
 			}
