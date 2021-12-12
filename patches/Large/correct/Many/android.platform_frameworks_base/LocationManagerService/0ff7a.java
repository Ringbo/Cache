diff --git a/services/java/com/android/server/LocationManagerService.java b/services/java/com/android/server/LocationManagerService.java
index fab97b1..f8d0e42 100644
--- a/services/java/com/android/server/LocationManagerService.java
+++ b/services/java/com/android/server/LocationManagerService.java
@@ -1110,7 +1110,7 @@
 
         synchronized (mLock) {
             LocationProviderProxy proxy = mProvidersByName.get(provider);
-            if (provider == null) {
+            if (proxy == null) {
                 return false;
             }
     
