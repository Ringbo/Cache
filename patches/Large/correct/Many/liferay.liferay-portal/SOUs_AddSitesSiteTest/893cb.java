diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/home/announcement/sousaddannouncementsentrysitesite/SOUs_AddSitesSiteTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/home/announcement/sousaddannouncementsentrysitesite/SOUs_AddSitesSiteTest.java
index bb5086a..977fc00 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficesite/home/announcement/sousaddannouncementsentrysitesite/SOUs_AddSitesSiteTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficesite/home/announcement/sousaddannouncementsentrysitesite/SOUs_AddSitesSiteTest.java
@@ -84,7 +84,7 @@
 		assertEquals(RuntimeVariables.replace(
 				"Your request completed successfully."),
 			selenium.getText("//span[@class='portlet-msg-success']"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Open Site Name"),
 			selenium.getText(
 				"//li[contains(@class, 'social-office-enabled')]/span[2]/a"));
