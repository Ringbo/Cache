diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddInvalidServerInstanceVHTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddInvalidServerInstanceVHTest.java
index 19ea783..2398d23 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddInvalidServerInstanceVHTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddInvalidServerInstanceVHTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
