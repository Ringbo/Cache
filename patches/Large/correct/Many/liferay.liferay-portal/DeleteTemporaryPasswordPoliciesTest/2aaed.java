diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/DeleteTemporaryPasswordPoliciesTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/DeleteTemporaryPasswordPoliciesTest.java
index 3350094..ea08604 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/DeleteTemporaryPasswordPoliciesTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/DeleteTemporaryPasswordPoliciesTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
