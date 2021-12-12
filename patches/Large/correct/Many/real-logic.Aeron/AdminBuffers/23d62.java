diff --git a/aeron-util/src/test/java/uk/co/real_logic/aeron/util/AdminBuffers.java b/aeron-util/src/test/java/uk/co/real_logic/aeron/util/AdminBuffers.java
index c181bea..7913ebd 100644
--- a/aeron-util/src/test/java/uk/co/real_logic/aeron/util/AdminBuffers.java
+++ b/aeron-util/src/test/java/uk/co/real_logic/aeron/util/AdminBuffers.java
@@ -54,7 +54,7 @@
         final File dir = new File(adminDir);
         if (dir.exists())
         {
-            IoUtil.delete(dir, false);
+            IoUtil.delete(dir, true);
         }
         IoUtil.ensureDirectoryExists(dir, "admin dir");
         creatingStrategy = new CreatingAdminBufferStrategy(adminDir, bufferSize);
