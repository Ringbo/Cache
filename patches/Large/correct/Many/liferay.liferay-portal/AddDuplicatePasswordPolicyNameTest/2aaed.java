diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/AddDuplicatePasswordPolicyNameTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/AddDuplicatePasswordPolicyNameTest.java
index d87c9c0..1f7a612 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/AddDuplicatePasswordPolicyNameTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/AddDuplicatePasswordPolicyNameTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
