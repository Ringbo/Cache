diff --git a/modules/sdk/ant-bnd/src/test/java/com/liferay/ant/bnd/npm/NpmAnalyzerPluginTest.java b/modules/sdk/ant-bnd/src/test/java/com/liferay/ant/bnd/npm/NpmAnalyzerPluginTest.java
index 6ba8530..08e7ccb2 100644
--- a/modules/sdk/ant-bnd/src/test/java/com/liferay/ant/bnd/npm/NpmAnalyzerPluginTest.java
+++ b/modules/sdk/ant-bnd/src/test/java/com/liferay/ant/bnd/npm/NpmAnalyzerPluginTest.java
@@ -372,7 +372,7 @@
 
 		NpmAnalyzerPlugin npmAnalyzerPlugin = new NpmAnalyzerPlugin();
 
-		String filterString = npmAnalyzerPlugin.getBowerVersionFilter(version);
+		String filterString = npmAnalyzerPlugin.getNpmVersionFilter(version);
 
 		Assert.assertEquals(expectedFilterString, filterString);
 
