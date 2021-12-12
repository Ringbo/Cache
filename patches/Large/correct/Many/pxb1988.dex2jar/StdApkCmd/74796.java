diff --git a/dex-tools/src/main/java/com/googlecode/dex2jar/tools/StdApkCmd.java b/dex-tools/src/main/java/com/googlecode/dex2jar/tools/StdApkCmd.java
index ee2445b..bafb9b4 100644
--- a/dex-tools/src/main/java/com/googlecode/dex2jar/tools/StdApkCmd.java
+++ b/dex-tools/src/main/java/com/googlecode/dex2jar/tools/StdApkCmd.java
@@ -59,7 +59,7 @@
                 if (!nEntry.isDirectory()) {
                     try (InputStream is = zipFile.getInputStream(e)) {
                         while (true) {
-                            int c = is.read(data);
+                            int c = is.read(buffer);
                             if (c < 0) {
                                 break;
                             }
