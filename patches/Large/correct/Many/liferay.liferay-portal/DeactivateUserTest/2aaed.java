diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/deactivateuser/DeactivateUserTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/deactivateuser/DeactivateUserTest.java
index 38ba5e5..f2407d8 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/deactivateuser/DeactivateUserTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/deactivateuser/DeactivateUserTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
