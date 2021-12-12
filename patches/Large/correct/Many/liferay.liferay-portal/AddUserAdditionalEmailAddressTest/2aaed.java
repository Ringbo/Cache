diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useradditionalemailaddress/adduseradditionalemailaddress/AddUserAdditionalEmailAddressTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useradditionalemailaddress/adduseradditionalemailaddress/AddUserAdditionalEmailAddressTest.java
index 2afa810..3855ec8 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useradditionalemailaddress/adduseradditionalemailaddress/AddUserAdditionalEmailAddressTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useradditionalemailaddress/adduseradditionalemailaddress/AddUserAdditionalEmailAddressTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
