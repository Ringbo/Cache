diff --git a/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/entity/content/AnimationContent.java b/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/entity/content/AnimationContent.java
index 232fc2d..2e56399 100644
--- a/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/entity/content/AnimationContent.java
+++ b/actor-sdk/sdk-core/core/core-shared/src/main/java/im/actor/core/entity/content/AnimationContent.java
@@ -54,7 +54,7 @@
 
     public AnimationContent(ContentLocalContainer contentContainer) {
         super(contentContainer);
-        LocalVideo localVideo = (LocalVideo) contentContainer.getContent();
+        LocalAnimation localVideo = (LocalAnimation) contentContainer.getContent();
         w = localVideo.getW();
         h = localVideo.getH();
     }
