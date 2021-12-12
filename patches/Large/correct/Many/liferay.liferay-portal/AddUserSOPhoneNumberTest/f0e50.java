diff --git a/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersophonenumber/AddUserSOPhoneNumberTest.java b/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersophonenumber/AddUserSOPhoneNumberTest.java
index d925ab8..9b32527c13 100644
--- a/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersophonenumber/AddUserSOPhoneNumberTest.java
+++ b/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersophonenumber/AddUserSOPhoneNumberTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
