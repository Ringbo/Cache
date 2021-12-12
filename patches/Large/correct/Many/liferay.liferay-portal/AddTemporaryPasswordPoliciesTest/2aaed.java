diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/AddTemporaryPasswordPoliciesTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/AddTemporaryPasswordPoliciesTest.java
index 16f4f3c..12d3f03 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/AddTemporaryPasswordPoliciesTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/AddTemporaryPasswordPoliciesTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
