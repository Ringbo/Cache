diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressdollar/AddUserEmailAddressDollarTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressdollar/AddUserEmailAddressDollarTest.java
index 6f70853..6698e53 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressdollar/AddUserEmailAddressDollarTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddressdollar/AddUserEmailAddressDollarTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
