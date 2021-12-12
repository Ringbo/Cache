diff --git a/byte-buddy-dep/src/main/java/net/bytebuddy/dynamic/DynamicType.java b/byte-buddy-dep/src/main/java/net/bytebuddy/dynamic/DynamicType.java
index 214f9ec..d1a9b51 100644
--- a/byte-buddy-dep/src/main/java/net/bytebuddy/dynamic/DynamicType.java
+++ b/byte-buddy-dep/src/main/java/net/bytebuddy/dynamic/DynamicType.java
@@ -4185,7 +4185,7 @@
         public Map<TypeDescription, File> saveIn(File folder) throws IOException {
             Map<TypeDescription, File> savedFiles = new HashMap<TypeDescription, File>();
             File target = new File(folder, typeDescription.getName().replace('.', File.separatorChar) + CLASS_FILE_EXTENSION);
-            if (target.getParentFile() != null && !target.getParentFile().exists() && !target.getParentFile().mkdirs()) {
+            if (target.getParentFile() != null && !target.getParentFile().isDirectory() && !target.getParentFile().mkdirs()) {
                 throw new IllegalArgumentException("Could not create directory: " + target.getParentFile());
             }
             OutputStream outputStream = new FileOutputStream(target);
@@ -4205,7 +4205,7 @@
         public File inject(File sourceJar, File targetJar) throws IOException {
             JarInputStream jarInputStream = new JarInputStream(new BufferedInputStream(new FileInputStream(sourceJar)));
             try {
-                if (!targetJar.exists() && !targetJar.createNewFile()) {
+                if (!targetJar.isFile() && !targetJar.createNewFile()) {
                     throw new IllegalArgumentException("Could not create file: " + targetJar);
                 }
                 JarOutputStream jarOutputStream = new JarOutputStream(new FileOutputStream(targetJar), jarInputStream.getManifest());
@@ -4282,7 +4282,7 @@
 
         @Override
         public File toJar(File file, Manifest manifest) throws IOException {
-            if (!file.exists() && !file.createNewFile()) {
+            if (!file.isFile() && !file.createNewFile()) {
                 throw new IllegalArgumentException("Could not create file: " + file);
             }
             JarOutputStream outputStream = new JarOutputStream(new FileOutputStream(file), manifest);
