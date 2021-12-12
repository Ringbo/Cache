diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/EditServerCategoryTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/EditServerCategoryTest.java
index b139fc9..2ce3849 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/EditServerCategoryTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/EditServerCategoryTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
