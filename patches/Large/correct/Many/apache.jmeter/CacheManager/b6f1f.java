diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/control/CacheManager.java b/src/protocol/http/org/apache/jmeter/protocol/http/control/CacheManager.java
index df11f42..6404b5b 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/control/CacheManager.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/control/CacheManager.java
@@ -57,7 +57,7 @@
     public static final String USE_EXPIRES = "useExpires"; // $NON-NLS-1$
     //-
 
-    private transient ThreadLocal<Map<String, CacheEntry>> threadCache;
+    private transient InheritableThreadLocal<Map<String, CacheEntry>> threadCache;
 
     private transient boolean useExpires; // Cached value
 
@@ -325,7 +325,7 @@
 
     private void clearCache() {
         log.debug("Clear cache");
-        threadCache = new ThreadLocal<Map<String, CacheEntry>>(){
+        threadCache = new InheritableThreadLocal<Map<String, CacheEntry>>(){
             @Override
             protected Map<String, CacheEntry> initialValue(){
                 return new HashMap<String, CacheEntry>();
