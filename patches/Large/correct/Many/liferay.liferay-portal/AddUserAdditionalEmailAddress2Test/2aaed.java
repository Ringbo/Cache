diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useradditionalemailaddress/adduseradditionalemailaddressmultiple/AddUserAdditionalEmailAddress2Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useradditionalemailaddress/adduseradditionalemailaddressmultiple/AddUserAdditionalEmailAddress2Test.java
index 21c0806..cb629a4 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useradditionalemailaddress/adduseradditionalemailaddressmultiple/AddUserAdditionalEmailAddress2Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useradditionalemailaddress/adduseradditionalemailaddressmultiple/AddUserAdditionalEmailAddress2Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}