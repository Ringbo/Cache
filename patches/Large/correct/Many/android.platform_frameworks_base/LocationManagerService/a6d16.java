diff --git a/services/java/com/android/server/LocationManagerService.java b/services/java/com/android/server/LocationManagerService.java
index 8a564f7..23b2706 100644
--- a/services/java/com/android/server/LocationManagerService.java
+++ b/services/java/com/android/server/LocationManagerService.java
@@ -1566,7 +1566,8 @@
             MockProvider provider = new MockProvider(name, this, properties);
             // remove the real provider if we are replacing GPS or network provider
             if (LocationManager.GPS_PROVIDER.equals(name)
-                    || LocationManager.NETWORK_PROVIDER.equals(name)) {
+                    || LocationManager.NETWORK_PROVIDER.equals(name)
+                    || LocationManager.FUSED_PROVIDER.equals(name)) {
                 LocationProviderInterface p = mProvidersByName.get(name);
                 if (p != null) {
                     removeProviderLocked(p);
