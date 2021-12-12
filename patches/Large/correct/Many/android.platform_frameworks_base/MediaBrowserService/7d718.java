diff --git a/media/java/android/service/media/MediaBrowserService.java b/media/java/android/service/media/MediaBrowserService.java
index ae86632..6954045 100644
--- a/media/java/android/service/media/MediaBrowserService.java
+++ b/media/java/android/service/media/MediaBrowserService.java
@@ -657,9 +657,9 @@
         if (page == -1 && pageSize == -1) {
             return list;
         }
-        int fromIndex = pageSize * (page - 1);
+        int fromIndex = pageSize * page;
         int toIndex = fromIndex + pageSize;
-        if (page < 1 || pageSize < 1 || fromIndex >= list.size()) {
+        if (page < 0 || pageSize < 1 || fromIndex >= list.size()) {
             return Collections.EMPTY_LIST;
         }
         if (toIndex > list.size()) {
