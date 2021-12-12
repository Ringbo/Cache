diff --git a/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/AddUserOrganizationContentReviewerTest.java b/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/AddUserOrganizationContentReviewerTest.java
index 8b1dba1..19ecf67 100644
--- a/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/AddUserOrganizationContentReviewerTest.java
+++ b/portal-web/test/com/liferay/portalweb/stagingorganization/blogs/AddUserOrganizationContentReviewerTest.java
@@ -37,7 +37,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
