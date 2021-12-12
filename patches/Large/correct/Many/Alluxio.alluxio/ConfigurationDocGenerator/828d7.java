diff --git a/shell/src/main/java/alluxio/cli/ConfigurationDocGenerator.java b/shell/src/main/java/alluxio/cli/ConfigurationDocGenerator.java
index 3e6b440..e5306d9 100644
--- a/shell/src/main/java/alluxio/cli/ConfigurationDocGenerator.java
+++ b/shell/src/main/java/alluxio/cli/ConfigurationDocGenerator.java
@@ -198,7 +198,7 @@
     String filePath = PathUtils.concatPath(homeDir, CSV_FILE_DIR);
     writeCSVFile(defaultKeys, filePath);
     // generate YML files
-    filePath = PathUtils.concatPath(filePath, YML_FILE_DIR);
+    filePath = PathUtils.concatPath(homeDir, YML_FILE_DIR);
     writeYMLFile(defaultKeys, filePath);
   }
 }
