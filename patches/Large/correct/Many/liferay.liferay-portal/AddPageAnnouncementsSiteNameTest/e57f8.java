diff --git a/portal-web/test/com/liferay/portalweb/portlet/announcements/usecase/demo1/AddPageAnnouncementsSiteNameTest.java b/portal-web/test/com/liferay/portalweb/portlet/announcements/usecase/demo1/AddPageAnnouncementsSiteNameTest.java
index 9b17a9a..68cc59c 100644
--- a/portal-web/test/com/liferay/portalweb/portlet/announcements/usecase/demo1/AddPageAnnouncementsSiteNameTest.java
+++ b/portal-web/test/com/liferay/portalweb/portlet/announcements/usecase/demo1/AddPageAnnouncementsSiteNameTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Site Name")) {
+				if (selenium.isElementPresent("link=Site Name")) {
 					break;
 				}
 			}
