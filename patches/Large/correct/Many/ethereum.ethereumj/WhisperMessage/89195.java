diff --git a/ethereumj-core/src/main/java/org/ethereum/net/shh/WhisperMessage.java b/ethereumj-core/src/main/java/org/ethereum/net/shh/WhisperMessage.java
index 82ec878..fbd06cd 100644
--- a/ethereumj-core/src/main/java/org/ethereum/net/shh/WhisperMessage.java
+++ b/ethereumj-core/src/main/java/org/ethereum/net/shh/WhisperMessage.java
@@ -353,7 +353,7 @@
 
     public byte[] getBytes() {
         if (signature != null) {
-            return merge(new byte[]{flags}, signature, payload);
+            return merge(new byte[]{flags}, payload, signature);
         } else {
             return merge(new byte[]{flags}, payload);
         }
