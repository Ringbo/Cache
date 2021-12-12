diff --git a/app/src/main/java/com/hippo/ehviewer/ui/scene/DownloadsScene.java b/app/src/main/java/com/hippo/ehviewer/ui/scene/DownloadsScene.java
index 4b070e4..daf6e78 100644
--- a/app/src/main/java/com/hippo/ehviewer/ui/scene/DownloadsScene.java
+++ b/app/src/main/java/com/hippo/ehviewer/ui/scene/DownloadsScene.java
@@ -1092,7 +1092,7 @@
             }
             int size = list.size();
             int index = recyclerView.getChildAdapterPosition(itemView);
-            if (index < 0 && index >= size) {
+            if (index < 0 || index >= size) {
                 return;
             }
 
