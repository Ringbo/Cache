diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/searchorganization/SearchOrganizationTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/searchorganization/SearchOrganizationTest.java
index 2b19c2a..2c52cea 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/searchorganization/SearchOrganizationTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/organizations/organization/searchorganization/SearchOrganizationTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
