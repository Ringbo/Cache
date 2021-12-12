diff --git a/modules/util/portal-tools-soy-builder/src/test/java/com/liferay/portal/tools/soy/builder/ant/WrapAlloyTemplateTaskTest.java b/modules/util/portal-tools-soy-builder/src/test/java/com/liferay/portal/tools/soy/builder/ant/WrapAlloyTemplateTaskTest.java
index 080dc67..407f7bd 100644
--- a/modules/util/portal-tools-soy-builder/src/test/java/com/liferay/portal/tools/soy/builder/ant/WrapAlloyTemplateTaskTest.java
+++ b/modules/util/portal-tools-soy-builder/src/test/java/com/liferay/portal/tools/soy/builder/ant/WrapAlloyTemplateTaskTest.java
@@ -37,7 +37,7 @@
 	public void setUp() throws Exception {
 		super.setUp();
 
-		URL url = ReplaceTranslationTaskTest.class.getResource(
+		URL url = WrapAlloyTemplateTaskTest.class.getResource(
 			"dependencies/wrap_alloy_template/build.xml");
 
 		File buildXmlFile = new File(url.toURI());
