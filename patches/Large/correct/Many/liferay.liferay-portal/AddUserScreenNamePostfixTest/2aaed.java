diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennamepostfix/AddUserScreenNamePostfixTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennamepostfix/AddUserScreenNamePostfixTest.java
index f7c873b..a4eb7de 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennamepostfix/AddUserScreenNamePostfixTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennamepostfix/AddUserScreenNamePostfixTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
