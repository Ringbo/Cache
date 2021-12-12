diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennamecyrus/AddUserScreenNameCyrusTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennamecyrus/AddUserScreenNameCyrusTest.java
index bc0a459..b0c5f68 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennamecyrus/AddUserScreenNameCyrusTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserscreennamecyrus/AddUserScreenNameCyrusTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
