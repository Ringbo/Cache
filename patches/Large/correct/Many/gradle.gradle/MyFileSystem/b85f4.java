diff --git a/subprojects/native/src/main/java/org/gradle/os/MyFileSystem.java b/subprojects/native/src/main/java/org/gradle/os/MyFileSystem.java
index 674fefa..06bc035 100755
--- a/subprojects/native/src/main/java/org/gradle/os/MyFileSystem.java
+++ b/subprojects/native/src/main/java/org/gradle/os/MyFileSystem.java
@@ -194,7 +194,7 @@
             try {
                 link = generateUniqueTempFileName();
                 int returnCode = PosixUtil.current().symlink(file.getPath(), link.getPath());
-                return returnCode != 0 && hasContent(link, content);
+                return returnCode == 0 && hasContent(link, content);
             } catch (IOException e) {
                 LOGGER.warn("Failed to determine if file system can create symbolic links. Assuming it can't.");
                 return false;
