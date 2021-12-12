diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/removemembersorganization/RemoveMembersOrganizationTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/removemembersorganization/RemoveMembersOrganizationTest.java
index 1342959..11c1d06 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/removemembersorganization/RemoveMembersOrganizationTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/removemembersorganization/RemoveMembersOrganizationTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
