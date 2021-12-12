diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userwebsite/adduserwebsitemultiple/AddUserWebsite1Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userwebsite/adduserwebsitemultiple/AddUserWebsite1Test.java
index 507feb1..6db0f9e 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userwebsite/adduserwebsitemultiple/AddUserWebsite1Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userwebsite/adduserwebsitemultiple/AddUserWebsite1Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
