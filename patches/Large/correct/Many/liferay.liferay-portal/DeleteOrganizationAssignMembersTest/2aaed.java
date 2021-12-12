diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/deleteorganizationassignmembers/DeleteOrganizationAssignMembersTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/deleteorganizationassignmembers/DeleteOrganizationAssignMembersTest.java
index 9be43eb..6bb7ebd 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/deleteorganizationassignmembers/DeleteOrganizationAssignMembersTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/deleteorganizationassignmembers/DeleteOrganizationAssignMembersTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
