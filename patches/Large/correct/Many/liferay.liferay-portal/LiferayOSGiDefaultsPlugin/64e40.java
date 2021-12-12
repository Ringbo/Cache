diff --git a/modules/sdk/gradle-plugins-defaults/src/main/java/com/liferay/gradle/plugins/defaults/LiferayOSGiDefaultsPlugin.java b/modules/sdk/gradle-plugins-defaults/src/main/java/com/liferay/gradle/plugins/defaults/LiferayOSGiDefaultsPlugin.java
index 72c0a7d..65a6ea4 100644
--- a/modules/sdk/gradle-plugins-defaults/src/main/java/com/liferay/gradle/plugins/defaults/LiferayOSGiDefaultsPlugin.java
+++ b/modules/sdk/gradle-plugins-defaults/src/main/java/com/liferay/gradle/plugins/defaults/LiferayOSGiDefaultsPlugin.java
@@ -2574,8 +2574,8 @@
 
 		sourceSet.setRuntimeClasspath(
 			FileUtil.join(
-				portalConfiguration, sourceSet.getRuntimeClasspath(),
-				portalTestConfiguration));
+				portalConfiguration, compileOnlyConfiguration,
+				sourceSet.getRuntimeClasspath(), portalTestConfiguration));
 	}
 
 	private void _configureTaskBaselineSyncReleaseVersions(
