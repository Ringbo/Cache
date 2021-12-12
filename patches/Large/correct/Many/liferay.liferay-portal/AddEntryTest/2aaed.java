diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddEntryTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddEntryTest.java
index 0224bb4..dfe8bc6 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddEntryTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddEntryTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
