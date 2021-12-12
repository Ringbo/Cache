diff --git a/modules/sdk/gradle-plugins/src/main/java/com/liferay/gradle/plugins/LiferayOSGiPlugin.java b/modules/sdk/gradle-plugins/src/main/java/com/liferay/gradle/plugins/LiferayOSGiPlugin.java
index 265891b..b3f4403 100644
--- a/modules/sdk/gradle-plugins/src/main/java/com/liferay/gradle/plugins/LiferayOSGiPlugin.java
+++ b/modules/sdk/gradle-plugins/src/main/java/com/liferay/gradle/plugins/LiferayOSGiPlugin.java
@@ -649,13 +649,13 @@
 			while (iterator.hasNext()) {
 				File file = iterator.next();
 
-				if (_classPathReferences.contains(file)) {
+				if (_resourceReferences.contains(file)) {
 					iterator.remove();
 
 					continue;
 				}
 
-				_classPathReferences.add(file);
+				_resourceReferences.add(file);
 
 				if (_logger.isInfoEnabled()) {
 					_logger.info("RESOURCE: {}", file.getAbsolutePath());
