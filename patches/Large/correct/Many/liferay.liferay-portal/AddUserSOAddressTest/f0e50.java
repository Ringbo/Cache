diff --git a/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersoaddress/AddUserSOAddressTest.java b/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersoaddress/AddUserSOAddressTest.java
index b20eb68..687ed9d 100644
--- a/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersoaddress/AddUserSOAddressTest.java
+++ b/portal-web/test/com/liferay/portalweb/socialofficeprofile/profile/addusersoaddress/AddUserSOAddressTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
