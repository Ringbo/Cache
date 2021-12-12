diff --git a/modules/sdk/ant-bnd/src/test/java/com/liferay/ant/bnd/npm/NpmAnalyzerPluginTest.java b/modules/sdk/ant-bnd/src/test/java/com/liferay/ant/bnd/npm/NpmAnalyzerPluginTest.java
index 5b5ead6..b710431 100644
--- a/modules/sdk/ant-bnd/src/test/java/com/liferay/ant/bnd/npm/NpmAnalyzerPluginTest.java
+++ b/modules/sdk/ant-bnd/src/test/java/com/liferay/ant/bnd/npm/NpmAnalyzerPluginTest.java
@@ -370,7 +370,8 @@
 	}
 
 	protected void assertVersionFilter(
-		String version, String expectedFilterString) {
+			String version, String expectedFilterString)
+		throws Exception {
 
 		NpmAnalyzerPlugin npmAnalyzerPlugin = new NpmAnalyzerPlugin();
 
