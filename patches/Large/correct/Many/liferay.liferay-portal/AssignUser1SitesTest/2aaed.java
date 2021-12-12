diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/AssignUser1SitesTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/AssignUser1SitesTest.java
index f022425..be22f16 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/AssignUser1SitesTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/usecase/demo1/AssignUser1SitesTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
