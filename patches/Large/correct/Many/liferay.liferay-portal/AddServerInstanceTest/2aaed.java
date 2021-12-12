diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddServerInstanceTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddServerInstanceTest.java
index f005870..1808f42 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddServerInstanceTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddServerInstanceTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
