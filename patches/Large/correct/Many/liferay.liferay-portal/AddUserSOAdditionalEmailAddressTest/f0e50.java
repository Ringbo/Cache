diff --git a/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersoadditionalemailaddress/AddUserSOAdditionalEmailAddressTest.java b/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersoadditionalemailaddress/AddUserSOAdditionalEmailAddressTest.java
index 6253764..5fea662 100644
--- a/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersoadditionalemailaddress/AddUserSOAdditionalEmailAddressTest.java
+++ b/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersoadditionalemailaddress/AddUserSOAdditionalEmailAddressTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
