diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/TearDownPasswordPolicyTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/TearDownPasswordPolicyTest.java
index da5e317..7386e78 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/TearDownPasswordPolicyTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/passwordpolicies/TearDownPasswordPolicyTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
