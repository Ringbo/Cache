diff --git a/aeron-util/src/test/java/uk/co/real_logic/aeron/util/SharedDirectory.java b/aeron-util/src/test/java/uk/co/real_logic/aeron/util/SharedDirectory.java
index 0aa8885..4d63fc2 100644
--- a/aeron-util/src/test/java/uk/co/real_logic/aeron/util/SharedDirectory.java
+++ b/aeron-util/src/test/java/uk/co/real_logic/aeron/util/SharedDirectory.java
@@ -35,7 +35,7 @@
         dataDir = new File(Directories.DATA_DIR);
         if (dataDir.exists())
         {
-            IoUtil.delete(dataDir, false);
+            IoUtil.delete(dataDir, true);
         }
         IoUtil.ensureDirectoryExists(dataDir, "data dir");
         mapping = new FileMappingConvention(dataDir.getAbsolutePath());
