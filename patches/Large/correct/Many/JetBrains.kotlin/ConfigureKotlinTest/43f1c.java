diff --git a/idea/tests/org/jetbrains/kotlin/idea/configuration/ConfigureKotlinTest.java b/idea/tests/org/jetbrains/kotlin/idea/configuration/ConfigureKotlinTest.java
index 3c3608c..c16d37c 100644
--- a/idea/tests/org/jetbrains/kotlin/idea/configuration/ConfigureKotlinTest.java
+++ b/idea/tests/org/jetbrains/kotlin/idea/configuration/ConfigureKotlinTest.java
@@ -174,7 +174,7 @@
 
     @SuppressWarnings("ConstantConditions")
     public void testJvmProjectWithV1FacetConfig() {
-        KotlinFacetSettings settings = KotlinFacetSettingsProvider.Companion.getInstance(myProject).getSettings(getModule());
+        KotlinFacetSettings settings = KotlinFacetSettingsProvider.Companion.getInstance(myProject).getInitializedSettings(getModule());
         K2JVMCompilerArguments arguments = (K2JVMCompilerArguments) settings.getCompilerArguments();
         assertEquals(false, settings.getUseProjectSettings());
         assertEquals("1.1", settings.getLanguageLevel().getDescription());
@@ -189,7 +189,7 @@
 
     @SuppressWarnings("ConstantConditions")
     public void testJsProjectWithV1FacetConfig() {
-        KotlinFacetSettings settings = KotlinFacetSettingsProvider.Companion.getInstance(myProject).getSettings(getModule());
+        KotlinFacetSettings settings = KotlinFacetSettingsProvider.Companion.getInstance(myProject).getInitializedSettings(getModule());
         K2JSCompilerArguments arguments = (K2JSCompilerArguments) settings.getCompilerArguments();
         assertEquals(false, settings.getUseProjectSettings());
         assertEquals("1.1", settings.getLanguageLevel().getDescription());
@@ -204,7 +204,7 @@
 
     @SuppressWarnings("ConstantConditions")
     public void testJvmProjectWithV2FacetConfig() {
-        KotlinFacetSettings settings = KotlinFacetSettingsProvider.Companion.getInstance(myProject).getSettings(getModule());
+        KotlinFacetSettings settings = KotlinFacetSettingsProvider.Companion.getInstance(myProject).getInitializedSettings(getModule());
         K2JVMCompilerArguments arguments = (K2JVMCompilerArguments) settings.getCompilerArguments();
         assertEquals(false, settings.getUseProjectSettings());
         assertEquals("1.1", settings.getLanguageLevel().getDescription());
@@ -219,7 +219,7 @@
 
     @SuppressWarnings("ConstantConditions")
     public void testJsProjectWithV2FacetConfig() {
-        KotlinFacetSettings settings = KotlinFacetSettingsProvider.Companion.getInstance(myProject).getSettings(getModule());
+        KotlinFacetSettings settings = KotlinFacetSettingsProvider.Companion.getInstance(myProject).getInitializedSettings(getModule());
         K2JSCompilerArguments arguments = (K2JSCompilerArguments) settings.getCompilerArguments();
         assertEquals(false, settings.getUseProjectSettings());
         assertEquals("1.1", settings.getLanguageLevel().getDescription());
