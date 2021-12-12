diff --git a/tools/tinkey/src/main/java/com/google/crypto/tink/tinkey/TinkeyUtil.java b/tools/tinkey/src/main/java/com/google/crypto/tink/tinkey/TinkeyUtil.java
index bd05a22..284750e 100644
--- a/tools/tinkey/src/main/java/com/google/crypto/tink/tinkey/TinkeyUtil.java
+++ b/tools/tinkey/src/main/java/com/google/crypto/tink/tinkey/TinkeyUtil.java
@@ -138,7 +138,7 @@
         manager = manager.destroy(keyId);
         break;
       case DISABLE_KEY:
-        manager = manager.enable(keyId);
+        manager = manager.disable(keyId);
         break;
       case ENABLE_KEY:
         manager = manager.enable(keyId);
