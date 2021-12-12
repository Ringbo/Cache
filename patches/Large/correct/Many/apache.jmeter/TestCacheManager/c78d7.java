diff --git a/test/src/org/apache/jmeter/protocol/http/control/TestCacheManager.java b/test/src/org/apache/jmeter/protocol/http/control/TestCacheManager.java
index 695837f..d40a46e 100644
--- a/test/src/org/apache/jmeter/protocol/http/control/TestCacheManager.java
+++ b/test/src/org/apache/jmeter/protocol/http/control/TestCacheManager.java
@@ -258,7 +258,7 @@
         assertFalse("Should not find valid entry",this.cacheManager.inCache(url));
         ((HttpMethodStub)httpMethod).cacheControl="no-cache";
         this.cacheManager.saveDetails(httpMethod, sampleResultOK);
-        assertNull("Should find entry",getThreadCacheEntry(LOCAL_HOST));
+        assertNotNull("Should find entry",getThreadCacheEntry(LOCAL_HOST));
         assertFalse("Should not find valid entry",this.cacheManager.inCache(url));
     }
     
