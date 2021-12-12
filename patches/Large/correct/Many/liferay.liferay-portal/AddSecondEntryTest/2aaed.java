diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddSecondEntryTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddSecondEntryTest.java
index 1f0947b..9dabcf0 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddSecondEntryTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddSecondEntryTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
