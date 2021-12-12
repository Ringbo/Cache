diff --git a/modules/sdk/project-templates/project-templates/src/test/java/com/liferay/project/templates/ProjectTemplatesTest.java b/modules/sdk/project-templates/project-templates/src/test/java/com/liferay/project/templates/ProjectTemplatesTest.java
index 28e967b..5008cff 100644
--- a/modules/sdk/project-templates/project-templates/src/test/java/com/liferay/project/templates/ProjectTemplatesTest.java
+++ b/modules/sdk/project-templates/project-templates/src/test/java/com/liferay/project/templates/ProjectTemplatesTest.java
@@ -194,7 +194,7 @@
 	public void testBuildTemplateActivatorWithBOM() throws Exception {
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"activator", "activator-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -269,7 +269,7 @@
 	public void testBuildTemplateApiWithBOM() throws Exception {
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"api", "api-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -347,7 +347,7 @@
 
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"content-targeting-report", "report-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -422,7 +422,7 @@
 
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"content-targeting-rule", "rule-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -503,8 +503,8 @@
 
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"content-targeting-tracking-action",
-			"tracking-dependency-management", "--dependency-management-enabled",
-			"true");
+			"tracking-dependency-management",
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -580,7 +580,7 @@
 	public void testBuildTemplateControlMenuEntryWithBOM() throws Exception {
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"control-menu-entry", "entry-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -604,7 +604,7 @@
 	public void testBuildTemplateFMPortletWithBOM() throws Exception {
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"freemarker-portlet", "freemarker-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -692,7 +692,7 @@
 	public void testBuildTemplateFormFieldWithBOM() throws Exception {
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"form-field", "field-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -885,7 +885,7 @@
 	public void testBuildTemplateMVCPortletWithBOM() throws Exception {
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"mvc-portlet", "mvc-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -932,7 +932,7 @@
 	public void testBuildTemplateNAPortletWithBOM() throws Exception {
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"npm-angular-portlet", "angular-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -956,7 +956,7 @@
 	public void testBuildTemplateNBPortletWithBOM() throws Exception {
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"npm-billboardjs-portlet", "billboardjs-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -1062,7 +1062,7 @@
 
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"npm-isomorphic-portlet", "isomorphic-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -1120,7 +1120,7 @@
 	public void testBuildTemplateNpmJQueryPortletWithBOM() throws Exception {
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"npm-jquery-portlet", "jquery-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -1174,7 +1174,7 @@
 	public void testBuildTemplateNpmMetaljsPortletWithBOM() throws Exception {
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"npm-metaljs-portlet", "metaljs-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -1232,7 +1232,7 @@
 	public void testBuildTemplateNpmPortletWithBOM() throws Exception {
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"npm-portlet", "npm-portlet-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -1284,7 +1284,7 @@
 	public void testBuildTemplateNpmReactPortletWithBOM() throws Exception {
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"npm-react-portlet", "react-portlet-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -1338,7 +1338,7 @@
 	public void testBuildTemplateNpmVuejsPortletWithBOM() throws Exception {
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"npm-vuejs-portlet", "vuejs-portlet-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -1443,7 +1443,7 @@
 	public void testBuildTemplatePanelAppWithBOM() throws Exception {
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"panel-app", "panel-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -1579,7 +1579,7 @@
 
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"portlet-configuration-icon", "icon-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -1654,7 +1654,7 @@
 	public void testBuildTemplatePortletProviderWithBOM() throws Exception {
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"portlet-provider", "provider-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -1737,7 +1737,7 @@
 
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"portlet-toolbar-contributor", "contributor-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -1763,7 +1763,7 @@
 	public void testBuildTemplatePortletWithBOM() throws Exception {
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"portlet", "portlet-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -1859,7 +1859,7 @@
 	public void testBuildTemplateRestWithBOM() throws Exception {
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"rest", "rest-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -2121,7 +2121,7 @@
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"service", "service-dependency-management", "--service",
 			"com.liferay.portal.kernel.events.LifecycleAction",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -2228,7 +2228,7 @@
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"service-wrapper", "wrapper-dependency-management", "--service",
 			"com.liferay.portal.kernel.service.UserLocalServiceWrapper",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -2310,7 +2310,7 @@
 
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"simulation-panel-entry", "simulator-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -2537,7 +2537,7 @@
 	public void testBuildTemplateSoyPortletWithBOM() throws Exception {
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"soy-portlet", "soy-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -2629,7 +2629,7 @@
 	public void testBuildTemplateSpringMvcPortletWithBOM() throws Exception {
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"spring-mvc-portlet", "spring-mvc-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -2781,7 +2781,7 @@
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"template-context-contributor",
 			"context-contributor-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -2961,7 +2961,7 @@
 	public void testBuildTemplateWarHookWithBOM() throws Exception {
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"war-hook", "war-hook-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
@@ -3113,7 +3113,7 @@
 	public void testBuildTemplateWarMvcWithBOM() throws Exception {
 		File gradleProjectDir = _buildTemplateWithGradle(
 			"war-mvc-portlet", "war-mvc-dependency-management",
-			"--dependency-management-enabled", "true");
+			"--dependency-management-enabled");
 
 		_testNotContains(
 			gradleProjectDir, "build.gradle",
