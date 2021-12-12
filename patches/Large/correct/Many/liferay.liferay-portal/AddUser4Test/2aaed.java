diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/searchuserquotes/AddUser4Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/searchuserquotes/AddUser4Test.java
index ce8416d..0123986 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/searchuserquotes/AddUser4Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/searchuserquotes/AddUser4Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
