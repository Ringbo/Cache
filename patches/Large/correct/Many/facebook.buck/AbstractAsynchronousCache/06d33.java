diff --git a/src/com/facebook/buck/artifact_cache/AbstractAsynchronousCache.java b/src/com/facebook/buck/artifact_cache/AbstractAsynchronousCache.java
index 93203fe..b5ee71c 100644
--- a/src/com/facebook/buck/artifact_cache/AbstractAsynchronousCache.java
+++ b/src/com/facebook/buck/artifact_cache/AbstractAsynchronousCache.java
@@ -179,7 +179,7 @@
       } else {
         if (consecutiveMultiFetchErrorCount.incrementAndGet()
             == MAX_CONSECUTIVE_MULTI_FETCH_ERRORS) {
-          LOG.error("Too many MultiFetch errors, falling back to Fetch only.");
+          LOG.info("Too many MultiFetch errors, falling back to Fetch only.");
           enableMultiFetch = false;
         }
       }
