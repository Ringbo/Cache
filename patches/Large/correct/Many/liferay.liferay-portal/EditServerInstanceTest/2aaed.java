diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/EditServerInstanceTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/EditServerInstanceTest.java
index 007b27c..cdd87fd 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/EditServerInstanceTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/EditServerInstanceTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
