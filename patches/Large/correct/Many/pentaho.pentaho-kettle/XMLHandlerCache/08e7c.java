diff --git a/src/be/ibridge/kettle/core/XMLHandlerCache.java b/src/be/ibridge/kettle/core/XMLHandlerCache.java
index ae00c30..be0ad0a 100644
--- a/src/be/ibridge/kettle/core/XMLHandlerCache.java
+++ b/src/be/ibridge/kettle/core/XMLHandlerCache.java
@@ -40,7 +40,7 @@
        cacheHits = 0;
    }
    
-   public static final XMLHandlerCache getInstance()
+   public synchronized static final XMLHandlerCache getInstance()
    {
        if (cache!=null) return cache;
        
@@ -52,7 +52,7 @@
     * Store a cache entry  
     * @param entry The cache entry to store
     */
-   public void storeCache(XMLHandlerCacheEntry entry, int lastChildNr)
+   public synchronized void storeCache(XMLHandlerCacheEntry entry, int lastChildNr)
    {
        hashtable.put(entry, new Integer(lastChildNr));
        list.add(entry);
