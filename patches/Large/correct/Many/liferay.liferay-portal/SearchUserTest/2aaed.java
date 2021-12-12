diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/searchuser/SearchUserTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/searchuser/SearchUserTest.java
index 3979100..cdd9437 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/searchuser/SearchUserTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/searchuser/SearchUserTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
