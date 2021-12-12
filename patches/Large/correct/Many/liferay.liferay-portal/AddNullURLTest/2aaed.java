diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddNullURLTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddNullURLTest.java
index fafb805..184ca4e 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddNullURLTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddNullURLTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
