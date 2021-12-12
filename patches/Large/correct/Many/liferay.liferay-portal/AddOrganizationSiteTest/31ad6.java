diff --git a/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/AddOrganizationSiteTest.java b/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/AddOrganizationSiteTest.java
index 04de5c5..d5b5eda 100644
--- a/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/AddOrganizationSiteTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/AddOrganizationSiteTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
