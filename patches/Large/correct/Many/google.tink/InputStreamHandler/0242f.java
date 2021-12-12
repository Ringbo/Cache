diff --git a/tools/tinkey/src/main/java/com/google/cloud/crypto/tink/tinkey/InputStreamHandler.java b/tools/tinkey/src/main/java/com/google/cloud/crypto/tink/tinkey/InputStreamHandler.java
index 4c5fcf0..fc68341 100644
--- a/tools/tinkey/src/main/java/com/google/cloud/crypto/tink/tinkey/InputStreamHandler.java
+++ b/tools/tinkey/src/main/java/com/google/cloud/crypto/tink/tinkey/InputStreamHandler.java
@@ -45,7 +45,7 @@
     final String token = params.getParameter(0);
     try {
       File inFile = Paths.get(token).toFile();
-      SubtleUtil.validateNotExist(inFile);
+      SubtleUtil.validateExists(inFile);
       setter.addValue(new FileInputStream(inFile));
     } catch (IOException e) {
       throw new CmdLineException(owner, e.getMessage(), e);
