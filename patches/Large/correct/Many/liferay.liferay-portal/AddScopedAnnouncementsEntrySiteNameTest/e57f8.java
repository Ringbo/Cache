diff --git a/portal-web/test/com/liferay/portalweb/portlet/announcements/usecase/demo1/AddScopedAnnouncementsEntrySiteNameTest.java b/portal-web/test/com/liferay/portalweb/portlet/announcements/usecase/demo1/AddScopedAnnouncementsEntrySiteNameTest.java
index 6682951..2f17882 100644
--- a/portal-web/test/com/liferay/portalweb/portlet/announcements/usecase/demo1/AddScopedAnnouncementsEntrySiteNameTest.java
+++ b/portal-web/test/com/liferay/portalweb/portlet/announcements/usecase/demo1/AddScopedAnnouncementsEntrySiteNameTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Site Name")) {
+				if (selenium.isElementPresent("link=Site Name")) {
 					break;
 				}
 			}
