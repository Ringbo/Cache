diff --git a/test/com/facebook/buck/android/ApkGenruleTest.java b/test/com/facebook/buck/android/ApkGenruleTest.java
index baa6e40..72c2b31 100644
--- a/test/com/facebook/buck/android/ApkGenruleTest.java
+++ b/test/com/facebook/buck/android/ApkGenruleTest.java
@@ -223,7 +223,7 @@
         .put("OUT", expectedApkOutput).build(),
         genruleCommand.getEnvironmentVariables(executionContext));
     assertEquals(
-        ImmutableList.of("/bin/bash", "-c", "python signer.py $APK key.properties > $OUT"),
+        ImmutableList.of("/bin/bash", "-e", "-c", "python signer.py $APK key.properties > $OUT"),
         genruleCommand.getShellCommand(executionContext));
 
     EasyMock.verify(parser);
