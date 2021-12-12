diff --git a/actor-sdk/sdk-core/core/core-js/src/main/java/im/actor/core/js/modules/JsFilesModule.java b/actor-sdk/sdk-core/core/core-js/src/main/java/im/actor/core/js/modules/JsFilesModule.java
index 71b3400..d47abf7 100644
--- a/actor-sdk/sdk-core/core/core-js/src/main/java/im/actor/core/js/modules/JsFilesModule.java
+++ b/actor-sdk/sdk-core/core/core-js/src/main/java/im/actor/core/js/modules/JsFilesModule.java
@@ -169,7 +169,7 @@
             }
             ArrayList<ApiFileLocation> fileLocations = new ArrayList<ApiFileLocation>();
             for (int i = 0; i < MAX_FILE_SIZE && filesQueue.size() > 0; i++) {
-                FileRequest request = filesQueue.get(0);
+                FileRequest request = filesQueue.remove(0);
                 fileLocations.add(new ApiFileLocation(request.getId(),
                         request.getAccessHash()));
             }
