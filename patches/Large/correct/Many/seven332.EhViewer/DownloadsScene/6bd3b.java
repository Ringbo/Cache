diff --git a/app/src/main/java/com/hippo/ehviewer/ui/scene/DownloadsScene.java b/app/src/main/java/com/hippo/ehviewer/ui/scene/DownloadsScene.java
index daf6e78..38265a0 100644
--- a/app/src/main/java/com/hippo/ehviewer/ui/scene/DownloadsScene.java
+++ b/app/src/main/java/com/hippo/ehviewer/ui/scene/DownloadsScene.java
@@ -635,7 +635,7 @@
             if (list == null) {
                 return false;
             }
-            if (position < 0 && position >= list.size()) {
+            if (position < 0 || position >= list.size()) {
                 return false;
             }
 
