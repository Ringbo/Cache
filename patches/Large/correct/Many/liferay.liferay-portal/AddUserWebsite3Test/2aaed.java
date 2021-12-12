diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userwebsite/adduserwebsitemultiple/AddUserWebsite3Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userwebsite/adduserwebsitemultiple/AddUserWebsite3Test.java
index 28293fa..e0e16fb 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userwebsite/adduserwebsitemultiple/AddUserWebsite3Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userwebsite/adduserwebsitemultiple/AddUserWebsite3Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
