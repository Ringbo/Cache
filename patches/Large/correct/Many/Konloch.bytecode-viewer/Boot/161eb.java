diff --git a/src/the/bytecode/club/bootloader/Boot.java b/src/the/bytecode/club/bootloader/Boot.java
index dfd9a4d..dcd82a3 100644
--- a/src/the/bytecode/club/bootloader/Boot.java
+++ b/src/the/bytecode/club/bootloader/Boot.java
@@ -323,7 +323,7 @@
     }
 
     public static void populateLibsDirectory() {
-        if (libsDir() != null)
+        if (libsDir() != null && libsDir().exists())
             for (File f : libsDir().listFiles()) {
                 libsList.add(f.getName());
                 libsFileList.add(f.getAbsolutePath());
