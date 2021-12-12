diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/restoreuser/RestoreUserTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/restoreuser/RestoreUserTest.java
index 6c69a30..d01f88c 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/restoreuser/RestoreUserTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/restoreuser/RestoreUserTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
