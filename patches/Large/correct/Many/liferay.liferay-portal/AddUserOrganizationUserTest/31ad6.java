diff --git a/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/AddUserOrganizationUserTest.java b/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/AddUserOrganizationUserTest.java
index b5e83b0..42fec24 100644
--- a/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/AddUserOrganizationUserTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/AddUserOrganizationUserTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
