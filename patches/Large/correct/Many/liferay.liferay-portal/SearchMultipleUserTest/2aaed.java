diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/searchuserquotes/SearchMultipleUserTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/searchuserquotes/SearchMultipleUserTest.java
index 7683a3f..c824263 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/searchuserquotes/SearchMultipleUserTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/searchuserquotes/SearchMultipleUserTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
