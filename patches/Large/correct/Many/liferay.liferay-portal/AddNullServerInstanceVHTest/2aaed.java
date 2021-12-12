diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddNullServerInstanceVHTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddNullServerInstanceVHTest.java
index 6ad7b23..bc3ce91 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddNullServerInstanceVHTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddNullServerInstanceVHTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
