diff --git a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/deletesitetypeprivate/DeleteSiteTypePrivateTest.java b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/deletesitetypeprivate/DeleteSiteTypePrivateTest.java
index 8433bcd..b0ea27b 100644
--- a/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/deletesitetypeprivate/DeleteSiteTypePrivateTest.java
+++ b/portal-web/test/functional/com/liferay/portalweb/socialofficehome/sites/privatesite/deletesitetypeprivate/DeleteSiteTypePrivateTest.java
@@ -43,7 +43,7 @@
 			RuntimeVariables.replace("My Sites"));
 		selenium.type("//input[@id='_5_WAR_soportlet_dialogKeywords']",
 			RuntimeVariables.replace("Private Site Name"));
-		Thread.sleep(5000);
+		Thread.sleep(1000);
 		assertEquals(RuntimeVariables.replace("Private Site Name"),
 			selenium.getText("//span[@class='name']/a"));
 		assertEquals(RuntimeVariables.replace("Private Site Description"),
