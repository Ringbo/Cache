diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultAsyncSupportResolver.java b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultAsyncSupportResolver.java
index e8799c3..e31b884 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultAsyncSupportResolver.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/DefaultAsyncSupportResolver.java
@@ -297,7 +297,7 @@
 
         if (cs == null) {
             AsyncSupport nativeSupport = resolveNativeCometSupport(detectContainersPresent());
-            return nativeSupport == null ? defaultCometSupport(useServlet30Async) : nativeSupport;
+            return nativeSupport == null ? defaultCometSupport(defaultToBlocking) : nativeSupport;
         } else {
             return cs;
         }
