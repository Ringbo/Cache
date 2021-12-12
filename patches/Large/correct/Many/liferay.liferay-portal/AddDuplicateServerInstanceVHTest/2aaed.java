diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddDuplicateServerInstanceVHTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddDuplicateServerInstanceVHTest.java
index 8f9ac8e..59ce19c 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddDuplicateServerInstanceVHTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddDuplicateServerInstanceVHTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
