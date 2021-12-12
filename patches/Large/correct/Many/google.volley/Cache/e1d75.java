diff --git a/src/main/java/com/android/volley/Cache.java b/src/main/java/com/android/volley/Cache.java
index f6cfa84..8482c22 100644
--- a/src/main/java/com/android/volley/Cache.java
+++ b/src/main/java/com/android/volley/Cache.java
@@ -87,12 +87,12 @@
         public Map<String, String> responseHeaders = Collections.emptyMap();
 
         /** True if the entry is expired. */
-        boolean isExpired() {
+        public boolean isExpired() {
             return this.ttl < System.currentTimeMillis();
         }
 
         /** True if a refresh is needed from the original data source. */
-        boolean refreshNeeded() {
+        public boolean refreshNeeded() {
             return this.softTtl < System.currentTimeMillis();
         }
     }
