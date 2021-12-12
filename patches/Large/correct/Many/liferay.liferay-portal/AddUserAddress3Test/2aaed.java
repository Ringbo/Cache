diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useraddress/adduseraddressmultiple/AddUserAddress3Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useraddress/adduseraddressmultiple/AddUserAddress3Test.java
index e7e0881..d7a7489 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useraddress/adduseraddressmultiple/AddUserAddress3Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useraddress/adduseraddressmultiple/AddUserAddress3Test.java
@@ -22,7 +22,7 @@
  */
 public class AddUserAddress3Test extends BaseTestCase {
 	public void testAddUserAddress3() throws Exception {
-		selenium.open("/web/guest/home");
+		selenium.open("/web/guest/home/");
 		loadRequiredJavaScriptModules();
 
 		for (int second = 0;; second++) {
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
