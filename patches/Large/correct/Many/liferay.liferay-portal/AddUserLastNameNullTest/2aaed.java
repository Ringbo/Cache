diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserlastnamenull/AddUserLastNameNullTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserlastnamenull/AddUserLastNameNullTest.java
index cce9ca5..f23260b 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserlastnamenull/AddUserLastNameNullTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduserlastnamenull/AddUserLastNameNullTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
