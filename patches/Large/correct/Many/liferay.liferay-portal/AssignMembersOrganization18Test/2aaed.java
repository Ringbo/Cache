diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userroles/selectorganizationrolepage2/AssignMembersOrganization18Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userroles/selectorganizationrolepage2/AssignMembersOrganization18Test.java
index 05f0f26..80276dc 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userroles/selectorganizationrolepage2/AssignMembersOrganization18Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userroles/selectorganizationrolepage2/AssignMembersOrganization18Test.java
@@ -36,7 +36,7 @@
 					}
 
 					try {
-						if (selenium.isVisible("link=Control Panel")) {
+						if (selenium.isElementPresent("link=Control Panel")) {
 							break;
 						}
 					}
