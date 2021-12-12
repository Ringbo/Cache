diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/AddCommaPasswordPolicyNameTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/AddCommaPasswordPolicyNameTest.java
index ff1e857..e58feb7 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/AddCommaPasswordPolicyNameTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/AddCommaPasswordPolicyNameTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
