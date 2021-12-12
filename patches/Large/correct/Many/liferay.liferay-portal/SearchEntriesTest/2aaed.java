diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/SearchEntriesTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/SearchEntriesTest.java
index 890486c..85d0a86 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/SearchEntriesTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/SearchEntriesTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
