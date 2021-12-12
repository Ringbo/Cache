diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationcomment/addorganizationcomment/AddOrganizationCommentTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationcomment/addorganizationcomment/AddOrganizationCommentTest.java
index 579f10a..a7832b3 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationcomment/addorganizationcomment/AddOrganizationCommentTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organizationcomment/addorganizationcomment/AddOrganizationCommentTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
@@ -139,7 +139,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
