diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddIncorrectURLTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddIncorrectURLTest.java
index 5ce2869..a27edd0 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddIncorrectURLTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddIncorrectURLTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
