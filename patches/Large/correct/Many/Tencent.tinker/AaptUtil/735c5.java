diff --git a/tinker-build/tinker-patch-lib/src/main/java/com/tencent/tinker/build/aapt/AaptUtil.java b/tinker-build/tinker-patch-lib/src/main/java/com/tencent/tinker/build/aapt/AaptUtil.java
index 8e058f7..fd2e722 100644
--- a/tinker-build/tinker-patch-lib/src/main/java/com/tencent/tinker/build/aapt/AaptUtil.java
+++ b/tinker-build/tinker-patch-lib/src/main/java/com/tencent/tinker/build/aapt/AaptUtil.java
@@ -105,8 +105,8 @@
                 File xmlFile = new File(xmlFullFilename);
                 String parentFullFilename = xmlFile.getParent();
                 File parentFile = new File(parentFullFilename);
-                if (isAValuesDirectory(parentFile.getName())) {
-                    // Ignore files under values* directories.
+                if (isAValuesDirectory(parentFile.getName()) || parentFile.getName().startsWith("raw")) {
+                    // Ignore files under values* directories and raw*.
                     continue;
                 }
                 processXmlFile(xmlFullFilename, references, resourceCollector);
