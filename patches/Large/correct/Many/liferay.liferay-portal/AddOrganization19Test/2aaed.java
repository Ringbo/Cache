diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userroles/selectorganizationrolepage2/AddOrganization19Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userroles/selectorganizationrolepage2/AddOrganization19Test.java
index e43b37e..8b3a012 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userroles/selectorganizationrolepage2/AddOrganization19Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userroles/selectorganizationrolepage2/AddOrganization19Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
