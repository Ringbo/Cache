diff --git a/core/java/android/webkit/WebStorage.java b/core/java/android/webkit/WebStorage.java
index a182287..cf71a84 100644
--- a/core/java/android/webkit/WebStorage.java
+++ b/core/java/android/webkit/WebStorage.java
@@ -389,8 +389,8 @@
         mOrigins = new HashMap<String, Origin>();
         for (String origin : tmp) {
             Origin website = new Origin(origin,
-                                 nativeGetUsageForOrigin(origin),
-                                 nativeGetQuotaForOrigin(origin));
+                                 nativeGetQuotaForOrigin(origin),
+                                 nativeGetUsageForOrigin(origin));
             mOrigins.put(origin, website);
         }
     }
