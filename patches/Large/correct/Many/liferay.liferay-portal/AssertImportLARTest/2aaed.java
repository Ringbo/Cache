diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AssertImportLARTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AssertImportLARTest.java
index ca7b907..49a91c0 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AssertImportLARTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/AssertImportLARTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
