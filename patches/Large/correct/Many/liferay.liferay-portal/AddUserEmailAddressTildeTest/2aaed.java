diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddresstilde/AddUserEmailAddressTildeTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddresstilde/AddUserEmailAddressTildeTest.java
index 56301ae..533e222 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddresstilde/AddUserEmailAddressTildeTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddresstilde/AddUserEmailAddressTildeTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
