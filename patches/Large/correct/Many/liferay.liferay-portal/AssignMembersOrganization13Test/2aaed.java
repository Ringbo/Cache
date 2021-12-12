diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userroles/selectorganizationrolepage2/AssignMembersOrganization13Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userroles/selectorganizationrolepage2/AssignMembersOrganization13Test.java
index bf5a3dd1..bc93095 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userroles/selectorganizationrolepage2/AssignMembersOrganization13Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userroles/selectorganizationrolepage2/AssignMembersOrganization13Test.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
