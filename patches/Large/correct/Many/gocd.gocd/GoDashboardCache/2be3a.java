diff --git a/server/src/main/java/com/thoughtworks/go/server/dashboard/GoDashboardCache.java b/server/src/main/java/com/thoughtworks/go/server/dashboard/GoDashboardCache.java
index 575c5db..c74dd1f 100644
--- a/server/src/main/java/com/thoughtworks/go/server/dashboard/GoDashboardCache.java
+++ b/server/src/main/java/com/thoughtworks/go/server/dashboard/GoDashboardCache.java
@@ -50,7 +50,7 @@
         cacheHasChanged();
     }
 
-    public void remove(String pipelineName) {
+    public void remove(CaseInsensitiveString pipelineName) {
         cache.remove(pipelineName);
     }
 
