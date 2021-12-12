diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useradditionalemailaddress/adduseradditionalemailaddressinvalid/AddUserAdditionalEmailAddressInvalidTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useradditionalemailaddress/adduseradditionalemailaddressinvalid/AddUserAdditionalEmailAddressInvalidTest.java
index c14b149..39e9822 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useradditionalemailaddress/adduseradditionalemailaddressinvalid/AddUserAdditionalEmailAddressInvalidTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useradditionalemailaddress/adduseradditionalemailaddressinvalid/AddUserAdditionalEmailAddressInvalidTest.java
@@ -32,7 +32,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
