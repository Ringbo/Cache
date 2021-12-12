diff --git a/library/src/main/java/com/liulishuo/filedownloader/event/DownloadEventPoolImpl.java b/library/src/main/java/com/liulishuo/filedownloader/event/DownloadEventPoolImpl.java
index 9c09946..720f475 100644
--- a/library/src/main/java/com/liulishuo/filedownloader/event/DownloadEventPoolImpl.java
+++ b/library/src/main/java/com/liulishuo/filedownloader/event/DownloadEventPoolImpl.java
@@ -96,7 +96,7 @@
         synchronized (eventId.intern()) {
             boolean succeed = container.remove(listener);
             if (container.size() <= 0) {
-                listenersMap.remove(container);
+                listenersMap.remove(eventId);
             }
             return succeed;
         }
