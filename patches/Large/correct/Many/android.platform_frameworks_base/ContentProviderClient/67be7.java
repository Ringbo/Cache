diff --git a/core/java/android/content/ContentProviderClient.java b/core/java/android/content/ContentProviderClient.java
index 9221fbb..4135487 100644
--- a/core/java/android/content/ContentProviderClient.java
+++ b/core/java/android/content/ContentProviderClient.java
@@ -148,7 +148,8 @@
                 return null;
             }
 
-            if ("com.google.android.gms".equals(mPackageName)) {
+            if ("com.google.android.gms".equals(mPackageName)
+                    || "com.google.android.syncadapters.contacts".equals(mPackageName)) {
                 // They're casting to a concrete subclass, sigh
                 return cursor;
             } else {
