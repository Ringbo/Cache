diff --git a/portal-web/test/com/liferay/portalweb/portal/controlpanel/socialactivity/usecase/demo1/EnableSocialActivityBlogsEntryTest.java b/portal-web/test/com/liferay/portalweb/portal/controlpanel/socialactivity/usecase/demo1/EnableSocialActivityBlogsEntryTest.java
index 9e6f231..c3e858c 100644
--- a/portal-web/test/com/liferay/portalweb/portal/controlpanel/socialactivity/usecase/demo1/EnableSocialActivityBlogsEntryTest.java
+++ b/portal-web/test/com/liferay/portalweb/portal/controlpanel/socialactivity/usecase/demo1/EnableSocialActivityBlogsEntryTest.java
@@ -31,7 +31,7 @@
 			}
 
 			try {
-				if (selenium.isVisible("link=Control Panel")) {
+				if (selenium.isElementPresent("link=Control Panel")) {
 					break;
 				}
 			}
