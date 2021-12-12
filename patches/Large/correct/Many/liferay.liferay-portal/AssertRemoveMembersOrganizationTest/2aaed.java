diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/removemembersorganization/AssertRemoveMembersOrganizationTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/removemembersorganization/AssertRemoveMembersOrganizationTest.java
index 6e245cd..b2d6a38 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/removemembersorganization/AssertRemoveMembersOrganizationTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/removemembersorganization/AssertRemoveMembersOrganizationTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
