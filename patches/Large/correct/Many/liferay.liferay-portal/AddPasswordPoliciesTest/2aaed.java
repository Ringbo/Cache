diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/AddPasswordPoliciesTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/AddPasswordPoliciesTest.java
index cff702b..ca23371 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/AddPasswordPoliciesTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/AddPasswordPoliciesTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
