diff --git a/facebook-core/src/main/java/com/facebook/internal/NativeProtocol.java b/facebook-core/src/main/java/com/facebook/internal/NativeProtocol.java
index a986a0c..4d238ef 100644
--- a/facebook-core/src/main/java/com/facebook/internal/NativeProtocol.java
+++ b/facebook-core/src/main/java/com/facebook/internal/NativeProtocol.java
@@ -276,14 +276,14 @@
         private TreeSet<Integer> availableVersions;
 
         public TreeSet<Integer> getAvailableVersions() {
-            if (availableVersions == null) {
+            if (availableVersions == null || availableVersions.isEmpty()) {
                 fetchAvailableVersions(false);
             }
             return availableVersions;
         }
 
         private synchronized void fetchAvailableVersions(boolean force) {
-            if (force || availableVersions == null) {
+            if (force || availableVersions == null || availableVersions.isEmpty()) {
                 availableVersions = fetchAllAvailableProtocolVersionsForAppInfo(this);
             }
         }
