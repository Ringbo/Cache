diff --git a/portal-web/test/com/liferay/portalweb/portlet/directory/organizations/vieworganizationuser/AddUserTest.java b/portal-web/test/com/liferay/portalweb/portlet/directory/organizations/vieworganizationuser/AddUserTest.java
index 9b89963..c689c1a 100644
--- a/portal-web/test/com/liferay/portalweb/portlet/directory/organizations/vieworganizationuser/AddUserTest.java
+++ b/portal-web/test/com/liferay/portalweb/portlet/directory/organizations/vieworganizationuser/AddUserTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
