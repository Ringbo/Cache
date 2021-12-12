diff --git a/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/DefinePermissionsBlogsManagePagesOrganizationUserTest.java b/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/DefinePermissionsBlogsManagePagesOrganizationUserTest.java
index bc00a87..0f03f13 100644
--- a/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/DefinePermissionsBlogsManagePagesOrganizationUserTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/DefinePermissionsBlogsManagePagesOrganizationUserTest.java
@@ -33,7 +33,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
