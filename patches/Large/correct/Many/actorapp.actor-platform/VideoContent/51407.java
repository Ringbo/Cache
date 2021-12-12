diff --git a/library/actor-common/src/main/java/im/actor/model/entity/content/VideoContent.java b/library/actor-common/src/main/java/im/actor/model/entity/content/VideoContent.java
index 5f1f1c7..5f033d1 100644
--- a/library/actor-common/src/main/java/im/actor/model/entity/content/VideoContent.java
+++ b/library/actor-common/src/main/java/im/actor/model/entity/content/VideoContent.java
@@ -26,9 +26,9 @@
                         w, h, duration)));
     }
 
-    public static PhotoContent createRemotePhoto(FileReference reference, int w, int h,
+    public static VideoContent createRemoteVideo(FileReference reference, int w, int h,
                                                  int duration, FastThumb fastThumb) {
-        return new PhotoContent(new ContentRemoteContainer(
+        return new VideoContent(new ContentRemoteContainer(
                 new DocumentMessage(reference.getFileId(),
                         reference.getAccessHash(),
                         reference.getFileSize(),
