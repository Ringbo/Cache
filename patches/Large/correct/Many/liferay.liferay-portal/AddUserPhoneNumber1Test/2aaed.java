diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userphonenumber/adduserphonenumbermultiple/AddUserPhoneNumber1Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userphonenumber/adduserphonenumbermultiple/AddUserPhoneNumber1Test.java
index 7269042f..b59afe5 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userphonenumber/adduserphonenumbermultiple/AddUserPhoneNumber1Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userphonenumber/adduserphonenumbermultiple/AddUserPhoneNumber1Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
