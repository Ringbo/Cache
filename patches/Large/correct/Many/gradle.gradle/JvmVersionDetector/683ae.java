diff --git a/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/client/JvmVersionDetector.java b/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/client/JvmVersionDetector.java
index 1bd1575..ec7bab7 100644
--- a/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/client/JvmVersionDetector.java
+++ b/subprojects/launcher/src/main/java/org/gradle/launcher/daemon/client/JvmVersionDetector.java
@@ -54,12 +54,12 @@
         builder.setErrorOutput(outputStream);
         builder.build().start().waitForFinish().assertNormalExitValue();
 
-        version = parseJavaVersionCommandOutput(jvm.getJavaExecutable(), new BufferedReader(new InputStreamReader(new ByteArrayInputStream(outputStream.toByteArray()))));
+        version = parseJavaVersionCommandOutput(jvm.getJavaExecutable().getPath(), new BufferedReader(new InputStreamReader(new ByteArrayInputStream(outputStream.toByteArray()))));
         cachedResults.put(jvm, version);
         return version;
     }
 
-    JavaVersion parseJavaVersionCommandOutput(File javaExecutable, BufferedReader reader) {
+    JavaVersion parseJavaVersionCommandOutput(String javaExecutable, BufferedReader reader) {
         try {
             String versionStr = reader.readLine();
             while (versionStr != null) {
@@ -73,6 +73,6 @@
             throw new UncheckedIOException(e);
         }
 
-        throw new GradleException(String.format("Could not determine Java version using executable %s.", javaExecutable.getPath()));
+        throw new GradleException(String.format("Could not determine Java version using executable %s.", javaExecutable));
     }
 }
