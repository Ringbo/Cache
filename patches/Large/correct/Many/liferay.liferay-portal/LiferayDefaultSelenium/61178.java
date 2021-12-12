diff --git a/portal-web/test/com/liferay/portalweb/portal/util/LiferayDefaultSelenium.java b/portal-web/test/com/liferay/portalweb/portal/util/LiferayDefaultSelenium.java
index 4c49d4b..03ee47f 100644
--- a/portal-web/test/com/liferay/portalweb/portal/util/LiferayDefaultSelenium.java
+++ b/portal-web/test/com/liferay/portalweb/portal/util/LiferayDefaultSelenium.java
@@ -56,11 +56,11 @@
 
 			Runtime runtime = Runtime.getRuntime();
 
-			Thread.sleep(1000);
+			Thread.sleep(5000);
 
 			runtime.exec(commands);
 
-			Thread.sleep(10000);
+			Thread.sleep(30000);
 		}
 		catch (Exception e) {
 			e.printStackTrace();
