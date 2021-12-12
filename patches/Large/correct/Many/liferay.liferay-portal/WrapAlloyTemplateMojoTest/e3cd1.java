diff --git a/modules/util/portal-tools-soy-builder/src/test/java/com/liferay/portal/tools/soy/builder/maven/WrapAlloyTemplateMojoTest.java b/modules/util/portal-tools-soy-builder/src/test/java/com/liferay/portal/tools/soy/builder/maven/WrapAlloyTemplateMojoTest.java
index 3e358e1..1b40499 100644
--- a/modules/util/portal-tools-soy-builder/src/test/java/com/liferay/portal/tools/soy/builder/maven/WrapAlloyTemplateMojoTest.java
+++ b/modules/util/portal-tools-soy-builder/src/test/java/com/liferay/portal/tools/soy/builder/maven/WrapAlloyTemplateMojoTest.java
@@ -55,7 +55,7 @@
 		throws IOException {
 
 		String content = FileTestUtil.read(
-			ReplaceTranslationMojoTest.class.getClassLoader(),
+			WrapAlloyTemplateMojoTest.class.getClassLoader(),
 			"com/liferay/portal/tools/soy/builder/maven/dependencies" +
 				"/pom_xml.tmpl");
 
