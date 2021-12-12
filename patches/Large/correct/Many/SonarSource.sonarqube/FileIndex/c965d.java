diff --git a/sonar-batch/src/main/java/org/sonar/batch/scan/filesystem/FileIndex.java b/sonar-batch/src/main/java/org/sonar/batch/scan/filesystem/FileIndex.java
index 6ccd2fd..f5ff4bd 100644
--- a/sonar-batch/src/main/java/org/sonar/batch/scan/filesystem/FileIndex.java
+++ b/sonar-batch/src/main/java/org/sonar/batch/scan/filesystem/FileIndex.java
@@ -181,7 +181,8 @@
     }
     set(attributes, DefaultInputFile.ATTRIBUTE_COMPONENT_KEY, project.getEffectiveKey() + ":" + resourceKey);
     if (Java.KEY.equals(lang)) {
-      set(attributes, DefaultInputFile.ATTRIBUTE_COMPONENT_DEPRECATED_KEY, project.getEffectiveKey() + ":" + JavaFile.fromRelativePath(sourceRelativePath, false).getKey());
+      set(attributes, DefaultInputFile.ATTRIBUTE_COMPONENT_DEPRECATED_KEY, project.getEffectiveKey() + ":"
+        + JavaFile.fromRelativePath(sourceRelativePath, false).getDeprecatedKey());
     } else {
       set(attributes, DefaultInputFile.ATTRIBUTE_COMPONENT_DEPRECATED_KEY, project.getEffectiveKey() + ":" + sourceRelativePath);
     }
