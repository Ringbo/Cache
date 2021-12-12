diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/assignmembersorganization/AssertAssignMembersOrganizationTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/assignmembersorganization/AssertAssignMembersOrganizationTest.java
index de911e4..66359b7 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/assignmembersorganization/AssertAssignMembersOrganizationTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/assignmembersorganization/AssertAssignMembersOrganizationTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
