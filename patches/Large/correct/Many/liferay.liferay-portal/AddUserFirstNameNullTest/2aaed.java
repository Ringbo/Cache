diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserfirstnamenull/AddUserFirstNameNullTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserfirstnamenull/AddUserFirstNameNullTest.java
index 810c7f9..ef1425b 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserfirstnamenull/AddUserFirstNameNullTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserfirstnamenull/AddUserFirstNameNullTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
