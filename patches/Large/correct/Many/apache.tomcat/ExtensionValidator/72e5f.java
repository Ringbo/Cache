diff --git a/java/org/apache/catalina/util/ExtensionValidator.java b/java/org/apache/catalina/util/ExtensionValidator.java
index 3d88d89..88fcc9e 100644
--- a/java/org/apache/catalina/util/ExtensionValidator.java
+++ b/java/org/apache/catalina/util/ExtensionValidator.java
@@ -91,7 +91,7 @@
             String classpathItem = strTok.nextToken();
             if (classpathItem.toLowerCase().endsWith(".jar")) {
                 File item = new File(classpathItem);
-                if (item.exists()) {
+                if (item.isFile()) {
                     try {
                         addSystemResource(item);
                     } catch (IOException e) {
@@ -409,12 +409,13 @@
                 = new StringTokenizer(extensionsDir, File.pathSeparator);
             while (extensionsTok.hasMoreTokens()) {
                 File targetDir = new File(extensionsTok.nextToken());
-                if (!targetDir.exists() || !targetDir.isDirectory()) {
+                if (!targetDir.isDirectory()) {
                     continue;
                 }
                 File[] files = targetDir.listFiles();
                 for (int i = 0; i < files.length; i++) {
-                    if (files[i].getName().toLowerCase().endsWith(".jar")) {
+                    if (files[i].getName().toLowerCase().endsWith(".jar") &&
+                            files[i].isFile()) {
                         try {
                             addSystemResource(files[i]);
                         } catch (IOException e) {
