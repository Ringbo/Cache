diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddNullSubfolderTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddNullSubfolderTest.java
index ad76c27..41825a3 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddNullSubfolderTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AddNullSubfolderTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
