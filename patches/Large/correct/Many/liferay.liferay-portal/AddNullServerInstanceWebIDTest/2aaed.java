diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddNullServerInstanceWebIDTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddNullServerInstanceWebIDTest.java
index 6ce49ca..800ff81 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddNullServerInstanceWebIDTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/admin/AddNullServerInstanceWebIDTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
