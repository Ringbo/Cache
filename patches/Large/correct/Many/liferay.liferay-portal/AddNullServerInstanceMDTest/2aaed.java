diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddNullServerInstanceMDTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddNullServerInstanceMDTest.java
index 99cda81..0f89f5b 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddNullServerInstanceMDTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddNullServerInstanceMDTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
