diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddresspercent/AddUserEmailAddressPercentTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddresspercent/AddUserEmailAddressPercentTest.java
index f41b00c..9c763cc 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddresspercent/AddUserEmailAddressPercentTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddresspercent/AddUserEmailAddressPercentTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
