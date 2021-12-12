diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/EditPrivatePageURLTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/EditPrivatePageURLTest.java
index e4f05f1..f63456a 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/EditPrivatePageURLTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/virtualhosting/EditPrivatePageURLTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
