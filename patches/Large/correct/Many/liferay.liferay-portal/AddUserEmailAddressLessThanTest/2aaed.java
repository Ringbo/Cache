diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddresslessthan/AddUserEmailAddressLessThanTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddresslessthan/AddUserEmailAddressLessThanTest.java
index acb3ec2..f7f2d30 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddresslessthan/AddUserEmailAddressLessThanTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/users/user/adduseremailaddresslessthan/AddUserEmailAddressLessThanTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
