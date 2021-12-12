diff --git a/test/com/facebook/buck/android/AndroidExopackageBinaryIntegrationTest.java b/test/com/facebook/buck/android/AndroidExopackageBinaryIntegrationTest.java
index 89e799c..ee11849 100644
--- a/test/com/facebook/buck/android/AndroidExopackageBinaryIntegrationTest.java
+++ b/test/com/facebook/buck/android/AndroidExopackageBinaryIntegrationTest.java
@@ -125,7 +125,8 @@
         workspace.getFile(
             "buck-out/gen/apps/multidex/app-native-exo.apk"));
 
-    zipInspector.assertFileExists("assets/secondary-program-dex-jars/metadata.txt");
+    zipInspector.assertFileDoesNotExist("assets/secondary-program-dex-jars/metadata.txt");
+
     zipInspector.assertFileExists("classes2.dex");
 
     zipInspector.assertFileExists("classes.dex");
