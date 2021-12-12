diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userroles/selectorganizationrolepage2/AddOrganization11Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userroles/selectorganizationrolepage2/AddOrganization11Test.java
index 94ce94c..7a3e1a6 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userroles/selectorganizationrolepage2/AddOrganization11Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/userroles/selectorganizationrolepage2/AddOrganization11Test.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
