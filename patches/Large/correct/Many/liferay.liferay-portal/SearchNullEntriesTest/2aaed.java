diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/SearchNullEntriesTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/SearchNullEntriesTest.java
index 6817b31..807d849 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/SearchNullEntriesTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/SearchNullEntriesTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
