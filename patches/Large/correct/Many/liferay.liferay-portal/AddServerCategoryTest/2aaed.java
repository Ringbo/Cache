diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddServerCategoryTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddServerCategoryTest.java
index 0fc644f..51c1453 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddServerCategoryTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddServerCategoryTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
