diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userwebsite/adduserwebsitemultiple/AddUserWebsite2Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userwebsite/adduserwebsitemultiple/AddUserWebsite2Test.java
index b46a65f..92f124d 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userwebsite/adduserwebsitemultiple/AddUserWebsite2Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userwebsite/adduserwebsitemultiple/AddUserWebsite2Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
