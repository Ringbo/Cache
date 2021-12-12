diff --git a/library/actor-common/src/main/java/im/actor/model/modules/messages/SenderActor.java b/library/actor-common/src/main/java/im/actor/model/modules/messages/SenderActor.java
index 91c602a..f693b05 100644
--- a/library/actor-common/src/main/java/im/actor/model/modules/messages/SenderActor.java
+++ b/library/actor-common/src/main/java/im/actor/model/modules/messages/SenderActor.java
@@ -187,7 +187,7 @@
                     basePhotoContent.getH(), basePhotoContent.getFastThumb());
         } else if (msg.getContent() instanceof VideoContent) {
             VideoContent baseVideoContent = (VideoContent) msg.getContent();
-            nContent = VideoContent.createRemotePhoto(fileReference, baseVideoContent.getW(),
+            nContent = VideoContent.createRemoteVideo(fileReference, baseVideoContent.getW(),
                     baseVideoContent.getH(), baseVideoContent.getDuration(),
                     baseVideoContent.getFastThumb());
         } else if (msg.getContent() instanceof DocumentContent) {
