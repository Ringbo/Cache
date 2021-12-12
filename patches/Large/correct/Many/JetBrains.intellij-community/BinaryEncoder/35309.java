diff --git a/platform/vcs-api/src/com/intellij/openapi/diff/impl/patch/BinaryEncoder.java b/platform/vcs-api/src/com/intellij/openapi/diff/impl/patch/BinaryEncoder.java
index 97ce560..8943e28 100644
--- a/platform/vcs-api/src/com/intellij/openapi/diff/impl/patch/BinaryEncoder.java
+++ b/platform/vcs-api/src/com/intellij/openapi/diff/impl/patch/BinaryEncoder.java
@@ -45,7 +45,7 @@
   }
 
   private static void checkLenIsValid(int len, @NotNull String errorMessage) throws BinaryPatchException {
-    if (len < 0 && len > 52) {
+    if (len < 0 || len > 52) {
       throw new BinaryPatchException(errorMessage);
     }
   }
