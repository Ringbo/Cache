diff --git a/actor-sdk/sdk-core/runtime/runtime-js/src/main/java/im/actor/runtime/js/mvvm/JsDisplayList.java b/actor-sdk/sdk-core/runtime/runtime-js/src/main/java/im/actor/runtime/js/mvvm/JsDisplayList.java
index 24eb586..5dd3670 100644
--- a/actor-sdk/sdk-core/runtime/runtime-js/src/main/java/im/actor/runtime/js/mvvm/JsDisplayList.java
+++ b/actor-sdk/sdk-core/runtime/runtime-js/src/main/java/im/actor/runtime/js/mvvm/JsDisplayList.java
@@ -291,11 +291,11 @@
 
     private void markAsDirty(int index) {
         isOverlayDirty.set(index, true);
-        if (index - 1 > 0) {
+        if (index - 1 >= 0) {
             isOverlayDirty.set(index - 1, true);
         }
 
-        if (index < isOverlayDirty.size()) {
+        if (index + 1 < isOverlayDirty.size()) {
             isOverlayDirty.set(index + 1, true);
         }
     }
