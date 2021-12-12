diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/addusersocialnetwork/AddUserSocialNetworkTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/addusersocialnetwork/AddUserSocialNetworkTest.java
index 646b84b..f3ff291 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/addusersocialnetwork/AddUserSocialNetworkTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/addusersocialnetwork/AddUserSocialNetworkTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
