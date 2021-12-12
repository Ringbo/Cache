diff --git a/api/src/main/java/org/asynchttpclient/AsyncHttpClientConfig.java b/api/src/main/java/org/asynchttpclient/AsyncHttpClientConfig.java
index 93ae5b8..55717a0 100644
--- a/api/src/main/java/org/asynchttpclient/AsyncHttpClientConfig.java
+++ b/api/src/main/java/org/asynchttpclient/AsyncHttpClientConfig.java
@@ -443,7 +443,7 @@
      * @since 2.0.0
      */
     public boolean hasResponseFilters() {
-        return !requestFilters.isEmpty();
+        return !responseFilters.isEmpty();
     }
 
     /**
