diff --git a/actor-sdk/sdk-core/core/core-js/src/main/java/im/actor/core/js/entity/JsSticker.java b/actor-sdk/sdk-core/core/core-js/src/main/java/im/actor/core/js/entity/JsSticker.java
index ee4a104..c52dd58 100644
--- a/actor-sdk/sdk-core/core/core-js/src/main/java/im/actor/core/js/entity/JsSticker.java
+++ b/actor-sdk/sdk-core/core/core-js/src/main/java/im/actor/core/js/entity/JsSticker.java
@@ -32,7 +32,7 @@
         return this.url;
     }-*/;
 
-    public Sticker getSticker() {
+    public final Sticker getSticker() {
         try {
             return new Sticker(Base64Utils.fromBase64(getContent()));
         } catch (IOException e) {
