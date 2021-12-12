diff --git a/src/test/java/com/google/devtools/build/lib/rules/android/AarImportTest.java b/src/test/java/com/google/devtools/build/lib/rules/android/AarImportTest.java
index 42a4434..207c902 100644
--- a/src/test/java/com/google/devtools/build/lib/rules/android/AarImportTest.java
+++ b/src/test/java/com/google/devtools/build/lib/rules/android/AarImportTest.java
@@ -255,16 +255,22 @@
   public void testExportsManifest() throws Exception {
     Artifact binaryMergedManifest =
         getConfiguredTarget("//java:app").getProvider(ApkProvider.class).getMergedManifest();
-    assertThat(getGeneratingAction(binaryMergedManifest).getInputs())
+    // Compare root relative path strings instead of artifacts due to difference in configuration
+    // caused by the Android split transition.
+    assertThat(
+        Iterables.transform(
+            getGeneratingAction(binaryMergedManifest).getInputs(),
+            Artifact::getRootRelativePathString))
         .containsAllOf(getAndroidManifest("//a:foo"), getAndroidManifest("//a:bar"));
   }
 
-  private Artifact getAndroidManifest(String aarImport) throws Exception {
+  private String getAndroidManifest(String aarImport) throws Exception {
     return getConfiguredTarget(aarImport)
         .getProvider(AndroidResourcesProvider.class)
         .getDirectAndroidResources()
         .toList()
         .get(0)
-        .getManifest();
+        .getManifest()
+        .getRootRelativePathString();
   }
 }
