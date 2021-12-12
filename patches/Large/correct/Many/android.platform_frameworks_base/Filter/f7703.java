diff --git a/core/java/android/widget/Filter.java b/core/java/android/widget/Filter.java
index 7e55c78..bdecf62 100644
--- a/core/java/android/widget/Filter.java
+++ b/core/java/android/widget/Filter.java
@@ -85,7 +85,8 @@
     public final void filter(CharSequence constraint, FilterListener listener) {
         synchronized (mLock) {
             if (mThreadHandler == null) {
-                HandlerThread thread = new HandlerThread(THREAD_NAME);
+                HandlerThread thread = new HandlerThread(
+                        THREAD_NAME, android.os.Process.THREAD_PRIORITY_BACKGROUND);
                 thread.start();
                 mThreadHandler = new RequestHandler(thread.getLooper());
             }
