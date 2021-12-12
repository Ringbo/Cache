diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/AddAsteriskPasswordPolicyNameTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/AddAsteriskPasswordPolicyNameTest.java
index 52818ab..aac0b56 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/AddAsteriskPasswordPolicyNameTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/AddAsteriskPasswordPolicyNameTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
