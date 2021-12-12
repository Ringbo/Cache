diff --git a/portal-web/test/com/liferay/portalweb/portlet/announcements/usecase/demo1/ViewAnnouncementsEntrySiteNameTest.java b/portal-web/test/com/liferay/portalweb/portlet/announcements/usecase/demo1/ViewAnnouncementsEntrySiteNameTest.java
index 4821f77..5357eee 100644
--- a/portal-web/test/com/liferay/portalweb/portlet/announcements/usecase/demo1/ViewAnnouncementsEntrySiteNameTest.java
+++ b/portal-web/test/com/liferay/portalweb/portlet/announcements/usecase/demo1/ViewAnnouncementsEntrySiteNameTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Site Name")) {
+				if (selenium.isElementPresent("link=Site Name")) {
 					break;
 				}
 			}
