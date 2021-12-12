diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/assignmembersorganization/AssignMembersOrganizationTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/assignmembersorganization/AssignMembersOrganizationTest.java
index 183b27d..bfc9740 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/assignmembersorganization/AssignMembersOrganizationTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/assignmembersorganization/AssignMembersOrganizationTest.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
