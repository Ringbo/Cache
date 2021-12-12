diff --git a/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/AddUserOrganizationAdministratorTest.java b/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/AddUserOrganizationAdministratorTest.java
index d52c975..8eaa86c 100644
--- a/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/AddUserOrganizationAdministratorTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/AddUserOrganizationAdministratorTest.java
@@ -37,7 +37,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
