diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useraddress/adduseraddressmultiple/AddUserAddress1Test.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useraddress/adduseraddressmultiple/AddUserAddress1Test.java
index 32d63a0..1c1e8f4 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useraddress/adduseraddressmultiple/AddUserAddress1Test.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/useraddress/adduseraddressmultiple/AddUserAddress1Test.java
@@ -22,7 +22,7 @@
  */
 public class AddUserAddress1Test extends BaseTestCase {
 	public void testAddUserAddress1() throws Exception {
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
