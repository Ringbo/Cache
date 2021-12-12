diff --git a/core/java/android/app/SystemServiceRegistry.java b/core/java/android/app/SystemServiceRegistry.java
index 307c3eb..b1c5fd8 100644
--- a/core/java/android/app/SystemServiceRegistry.java
+++ b/core/java/android/app/SystemServiceRegistry.java
@@ -226,7 +226,7 @@
         SYSTEM_SERVICE_NAMES.put(android.text.ClipboardManager.class, Context.CLIPBOARD_SERVICE);
 
         registerService(Context.CONNECTIVITY_SERVICE, ConnectivityManager.class,
-                new StaticOuterContextServiceFetcher<ConnectivityManager>() {
+                new StaticApplicationContextServiceFetcher<ConnectivityManager>() {
             @Override
             public ConnectivityManager createService(Context context) {
                 IBinder b = ServiceManager.getService(Context.CONNECTIVITY_SERVICE);
@@ -840,22 +840,21 @@
     }
 
     /**
-     * Like StaticServiceFetcher, creates only one instance of the service per process, but when
-     * creating the service for the first time, passes it the outer context of the creating
-     * component.
+     * Like StaticServiceFetcher, creates only one instance of the service per application, but when
+     * creating the service for the first time, passes it the application context of the creating
+     * application.
      *
-     * TODO: Is this safe in the case where multiple applications share the same process?
      * TODO: Delete this once its only user (ConnectivityManager) is known to work well in the
      * case where multiple application components each have their own ConnectivityManager object.
      */
-    static abstract class StaticOuterContextServiceFetcher<T> implements ServiceFetcher<T> {
+    static abstract class StaticApplicationContextServiceFetcher<T> implements ServiceFetcher<T> {
         private T mCachedInstance;
 
         @Override
         public final T getService(ContextImpl ctx) {
-            synchronized (StaticOuterContextServiceFetcher.this) {
+            synchronized (StaticApplicationContextServiceFetcher.this) {
                 if (mCachedInstance == null) {
-                    mCachedInstance = createService(ctx.getOuterContext());
+                    mCachedInstance = createService(ctx.getApplicationContext());
                 }
                 return mCachedInstance;
             }
