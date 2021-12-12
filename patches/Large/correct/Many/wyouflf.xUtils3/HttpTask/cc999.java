diff --git a/xutils/src/main/java/org/xutils/http/HttpTask.java b/xutils/src/main/java/org/xutils/http/HttpTask.java
index f6dc2e0..939734a 100644
--- a/xutils/src/main/java/org/xutils/http/HttpTask.java
+++ b/xutils/src/main/java/org/xutils/http/HttpTask.java
@@ -174,7 +174,7 @@
                             entryItr = DOWNLOAD_TASK.entrySet().iterator();
                     while (entryItr.hasNext()) {
                         Map.Entry<String, WeakReference<HttpTask<?>>> next = entryItr.next();
-                        if (next.getValue() == null && next.getValue().get() == null) {
+                        if (next.getValue() == null || next.getValue().get() == null) {
                             entryItr.remove();
                         }
                     }
