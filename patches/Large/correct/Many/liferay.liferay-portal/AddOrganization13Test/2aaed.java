diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userroles/selectorganizationrolepage2/AddOrganization13Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userroles/selectorganizationrolepage2/AddOrganization13Test.java
index 7e93125..b231d33 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userroles/selectorganizationrolepage2/AddOrganization13Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userroles/selectorganizationrolepage2/AddOrganization13Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
