diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennameanonymous/AddUserScreenNameAnonymousTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennameanonymous/AddUserScreenNameAnonymousTest.java
index 7c68152..4080e2e 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennameanonymous/AddUserScreenNameAnonymousTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennameanonymous/AddUserScreenNameAnonymousTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
