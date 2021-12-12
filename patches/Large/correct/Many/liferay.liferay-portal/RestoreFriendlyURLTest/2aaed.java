diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/RestoreFriendlyURLTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/RestoreFriendlyURLTest.java
index e0d156b..4b3c55a 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/RestoreFriendlyURLTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/RestoreFriendlyURLTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
