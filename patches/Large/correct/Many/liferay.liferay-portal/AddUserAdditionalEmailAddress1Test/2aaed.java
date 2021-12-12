diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useradditionalemailaddress/adduseradditionalemailaddressmultiple/AddUserAdditionalEmailAddress1Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useradditionalemailaddress/adduseradditionalemailaddressmultiple/AddUserAdditionalEmailAddress1Test.java
index 02320b5..1a95241 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useradditionalemailaddress/adduseradditionalemailaddressmultiple/AddUserAdditionalEmailAddress1Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useradditionalemailaddress/adduseradditionalemailaddressmultiple/AddUserAdditionalEmailAddress1Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
