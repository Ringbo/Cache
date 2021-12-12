diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddSubfolderTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddSubfolderTest.java
index 5008e12..7ac9741 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddSubfolderTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddSubfolderTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
