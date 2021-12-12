diff --git a/test/com/facebook/buck/android/AndroidLibraryDescriptionIntegrationTest.java b/test/com/facebook/buck/android/AndroidLibraryDescriptionIntegrationTest.java
index 2e39133..0a25efe 100644
--- a/test/com/facebook/buck/android/AndroidLibraryDescriptionIntegrationTest.java
+++ b/test/com/facebook/buck/android/AndroidLibraryDescriptionIntegrationTest.java
@@ -51,16 +51,16 @@
   public void testQueryDepsNotInvalidatedWhenRuleKeyHit() throws Exception {
     AssumeAndroidPlatform.assumeSdkIsAvailable();
     // Build once to warm cache
-    workspace.runBuckCommand("build", "//:android_resources").assertSuccess();
+    workspace.runBuckBuild("//:android_resources").assertSuccess();
     workspace.getBuildLog().assertTargetBuiltLocally("//:android_resources");
 
     // Now, build again, assert we get the previous result
-    workspace.runBuckCommand("build", "//:android_resources").assertSuccess();
+    workspace.runBuckBuild("//:android_resources").assertSuccess();
     workspace.getBuildLog().assertTargetHadMatchingRuleKey("//:android_resources");
 
     // Now, edit lib_b, which is NOT part of the query result,
     workspace.replaceFileContents("B.java", "// method", "public static void foo() {}");
-    workspace.runBuckCommand("build", "//:android_resources").assertSuccess();
+    workspace.runBuckBuild("//:android_resources").assertSuccess();
 
     // And assert that we don't get rebuilt, BUT we had to re-run the query to find out
     workspace.getBuildLog().assertTargetHadMatchingInputRuleKey("//:android_resources");
@@ -70,12 +70,12 @@
   public void testDepQueryResultsAreInvalidatedWhenDirectDepChanges() throws Exception {
     AssumeAndroidPlatform.assumeSdkIsAvailable();
     // Build once to warm cache
-    workspace.runBuckCommand("build", "//:android_libraries").assertSuccess();
+    workspace.runBuckBuild("//:android_libraries").assertSuccess();
     workspace.getBuildLog().assertTargetBuiltLocally("//:android_libraries");
 
     // Now, edit lib_a, which is NOT part of the query result, and assert the query does not run
     workspace.replaceFileContents("A.java", "// method", "public static void foo() {}");
-    workspace.runBuckCommand("build", "//:android_libraries").assertSuccess();
+    workspace.runBuckBuild("//:android_libraries").assertSuccess();
     workspace.getBuildLog().assertTargetHadMatchingRuleKey("//:android_libraries");
 
     // Now, add lib_a to the 'top_level' library and build again
@@ -85,7 +85,7 @@
     workspace.replaceFileContents("TopLevel.java", "// placeholder", "public A a;");
 
     // Build again
-    workspace.runBuckCommand("build", "//:android_libraries");
+    workspace.runBuckBuild("//:android_libraries");
 
     // Now we should rebuild top_level, re-run the query, and rebuild android_libraries
     workspace.getBuildLog().assertTargetBuiltLocally("//:top_level");
@@ -96,12 +96,12 @@
   public void testDepQueryResultsAreInvalidatedWhenTransitiveDepChanges() throws Exception {
     AssumeAndroidPlatform.assumeSdkIsAvailable();
     // Build once to warm cache
-    workspace.runBuckCommand("build", "//:android_libraries").assertSuccess();
+    workspace.runBuckBuild("//:android_libraries").assertSuccess();
     workspace.getBuildLog().assertTargetBuiltLocally("//:android_libraries");
 
     // Now, edit lib_b, which is part of the query result, and assert the query is invalidated
     workspace.replaceFileContents("B.java", "// method", "public static void foo() {}");
-    workspace.runBuckCommand("build", "//:android_libraries").assertSuccess();
+    workspace.runBuckBuild("//:android_libraries").assertSuccess();
     workspace.getBuildLog().assertTargetBuiltLocally("//:lib_b");
     workspace.getBuildLog().assertTargetBuiltLocally("//:android_libraries");
   }
@@ -110,12 +110,12 @@
   public void testDepQueryResultsAreUpdatedWhenAttributesChange() throws Exception {
     AssumeAndroidPlatform.assumeSdkIsAvailable();
     // Build once to warm cache
-    workspace.runBuckCommand("build", "//:has_proc_params").assertSuccess();
+    workspace.runBuckBuild("//:has_proc_params").assertSuccess();
     workspace.getBuildLog().assertTargetBuiltLocally("//:has_proc_params");
 
     // Now, add annotation proc params to lib_b and assert the query is updated
     workspace.replaceFileContents("BUCK", "#annotation_placeholder", "'example.foo=True',");
-    workspace.runBuckCommand("build", "//:has_proc_params").assertSuccess();
+    workspace.runBuckBuild("//:has_proc_params").assertSuccess();
     workspace.getBuildLog().assertTargetBuiltLocally("//:has_proc_params");
   }
 
@@ -123,12 +123,12 @@
   public void testDepQueryResultsCanTakeAdvantageOfDepFileRuleKey() throws Exception {
     AssumeAndroidPlatform.assumeSdkIsAvailable();
     // Build once to warm cache
-    workspace.runBuckCommand("build", "//:java_libraries").assertSuccess();
+    workspace.runBuckBuild("//:java_libraries").assertSuccess();
     workspace.getBuildLog().assertTargetBuiltLocally("//:java_libraries");
 
     // Now, edit lib_c, which is part of the query result, and assert the query is invalidated
     workspace.replaceFileContents("D.java", "// method", "public static void foo() {}");
-    workspace.runBuckCommand("build", "//:java_libraries").assertSuccess();
+    workspace.runBuckBuild("//:java_libraries").assertSuccess();
     // But the libs above get a dep file hit
     workspace.getBuildLog().assertTargetHadMatchingDepfileRuleKey("//:java_libraries");
   }
@@ -137,17 +137,17 @@
   public void testDepQueryCanApplyToResources() throws Exception {
     AssumeAndroidPlatform.assumeSdkIsAvailable();
     // Build once to warm cache
-    workspace.runBuckCommand("build", "//:resources_from_query").assertSuccess();
+    workspace.runBuckBuild("//:resources_from_query").assertSuccess();
   }
 
   @Test
   public void testDepQueryWithClasspathDoesNotTraverseProvidedDeps() throws Exception {
     AssumeAndroidPlatform.assumeSdkIsAvailable();
     // Should succeed because lib_c is a provided dep
-    workspace.runBuckBuild("build", "//:provided_only");
+    workspace.runBuckBuild("//:provided_only");
 
     // Should fail becuase 'C.class' is not added to the classpath because it's a provided dep
-    workspace.runBuckCommand("build", "//:no_provided_deps").assertFailure();
+    workspace.runBuckBuild("//:no_provided_deps").assertFailure();
   }
 
   @Test
@@ -160,7 +160,7 @@
   @Test
   public void testProvidedDepsQueryDoesNotAffectPackaging() throws Exception {
     AssumeAndroidPlatform.assumeSdkIsAvailable();
-    workspace.runBuckCommand("build", "//:check_output_of_does_not_package_lib_c").assertSuccess();
+    workspace.runBuckBuild("//:check_output_of_does_not_package_lib_c").assertSuccess();
     String[] outputs =
         workspace
             .getFileContents(getOutputFile("//:check_output_of_does_not_package_lib_c"))
