diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/searchuserquotes/AddUser5Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/searchuserquotes/AddUser5Test.java
index a245d33..d30f1f9 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/searchuserquotes/AddUser5Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/searchuserquotes/AddUser5Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
