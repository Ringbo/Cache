diff --git a/portal-web/test/com/liferay/portalweb/portal/util/liferayselenium/BaseSeleniumImpl.java b/portal-web/test/com/liferay/portalweb/portal/util/liferayselenium/BaseSeleniumImpl.java
index 43a6d08..c332f09 100644
--- a/portal-web/test/com/liferay/portalweb/portal/util/liferayselenium/BaseSeleniumImpl.java
+++ b/portal-web/test/com/liferay/portalweb/portal/util/liferayselenium/BaseSeleniumImpl.java
@@ -155,7 +155,7 @@
 
 			Class<?> clazz = selenium.getClass();
 
-			Field field = clazz.getField("commandProcessor");
+			Field field = clazz.getDeclaredField("commandProcessor");
 
 			field.setAccessible(true);
 
