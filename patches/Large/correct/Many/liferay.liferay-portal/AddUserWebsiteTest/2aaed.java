diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userwebsite/adduserwebsite/AddUserWebsiteTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userwebsite/adduserwebsite/AddUserWebsiteTest.java
index 9d5b7e2..31d235e 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userwebsite/adduserwebsite/AddUserWebsiteTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userwebsite/adduserwebsite/AddUserWebsiteTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
