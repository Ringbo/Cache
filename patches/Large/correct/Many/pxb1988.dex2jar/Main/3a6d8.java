diff --git a/dex-translator/src/main/java/com/googlecode/dex2jar/v3/Main.java b/dex-translator/src/main/java/com/googlecode/dex2jar/v3/Main.java
index 8f512fa..0fbd7af 100644
--- a/dex-translator/src/main/java/com/googlecode/dex2jar/v3/Main.java
+++ b/dex-translator/src/main/java/com/googlecode/dex2jar/v3/Main.java
@@ -106,7 +106,7 @@
 
         for (String file : args) {
             File dex = new File(file);
-            final File gen = new File(FilenameUtils.getBaseName(file) + "_dex2jar.jar");
+            final File gen = new File(dex.getParentFile(),FilenameUtils.getBaseName(file) + "_dex2jar.jar");
             log.info("dex2jar {} -> {}", dex, gen);
             try {
                 doFile(dex, gen);
