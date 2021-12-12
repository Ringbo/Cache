diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/ImportLARTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/ImportLARTest.java
index e6061e5..d64da77 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/ImportLARTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/bookmarks/ImportLARTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
