diff --git a/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/AddOrganizationTest.java b/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/AddOrganizationTest.java
index e3390d9..7dc50b2 100644
--- a/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/AddOrganizationTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/AddOrganizationTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
