diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseropenid/AddUserOpenIDTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseropenid/AddUserOpenIDTest.java
index 826e9fa..7aa1d6e 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseropenid/AddUserOpenIDTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseropenid/AddUserOpenIDTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
