diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/searchuserquotes/AddUser3Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/searchuserquotes/AddUser3Test.java
index 3de6c4a..4bef30d 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/searchuserquotes/AddUser3Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/searchuserquotes/AddUser3Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
