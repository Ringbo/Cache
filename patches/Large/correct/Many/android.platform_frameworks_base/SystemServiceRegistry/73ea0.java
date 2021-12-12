diff --git a/core/java/android/app/SystemServiceRegistry.java b/core/java/android/app/SystemServiceRegistry.java
index 9767c33..1778ca7 100644
--- a/core/java/android/app/SystemServiceRegistry.java
+++ b/core/java/android/app/SystemServiceRegistry.java
@@ -828,7 +828,7 @@
                         service = createService(ctx);
                         cache[mCacheIndex] = service;
                     } catch (ServiceNotFoundException e) {
-                        Log.wtf(TAG, e.getMessage(), e);
+                        Log.w(TAG, e.getMessage(), e);
                     }
                 }
                 return (T)service;
@@ -852,7 +852,7 @@
                     try {
                         mCachedInstance = createService();
                     } catch (ServiceNotFoundException e) {
-                        Log.wtf(TAG, e.getMessage(), e);
+                        Log.w(TAG, e.getMessage(), e);
                     }
                 }
                 return mCachedInstance;
@@ -885,7 +885,7 @@
                     try {
                         mCachedInstance = createService(appContext != null ? appContext : ctx);
                     } catch (ServiceNotFoundException e) {
-                        Log.wtf(TAG, e.getMessage(), e);
+                        Log.w(TAG, e.getMessage(), e);
                     }
                 }
                 return mCachedInstance;
