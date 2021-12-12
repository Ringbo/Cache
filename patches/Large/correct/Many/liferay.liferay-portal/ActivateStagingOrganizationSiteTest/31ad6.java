diff --git a/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/ActivateStagingOrganizationSiteTest.java b/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/ActivateStagingOrganizationSiteTest.java
index b32fbe1..6634dae 100644
--- a/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/ActivateStagingOrganizationSiteTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/ActivateStagingOrganizationSiteTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
