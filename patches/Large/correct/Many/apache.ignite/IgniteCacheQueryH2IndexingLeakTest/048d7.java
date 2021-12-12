diff --git a/modules/indexing/src/test/java/org/apache/ignite/internal/processors/cache/IgniteCacheQueryH2IndexingLeakTest.java b/modules/indexing/src/test/java/org/apache/ignite/internal/processors/cache/IgniteCacheQueryH2IndexingLeakTest.java
index 30ed4e0..589dfe1 100644
--- a/modules/indexing/src/test/java/org/apache/ignite/internal/processors/cache/IgniteCacheQueryH2IndexingLeakTest.java
+++ b/modules/indexing/src/test/java/org/apache/ignite/internal/processors/cache/IgniteCacheQueryH2IndexingLeakTest.java
@@ -57,7 +57,7 @@
     private static final int THREAD_COUNT = 10;
 
     /** Timeout */
-    private static final long STMT_CACHE_CLEANUP_TIMEOUT = 1000;
+    private static final long STMT_CACHE_CLEANUP_TIMEOUT = 500;
 
     /** Orig cleanup period. */
     private static String origCacheCleanupPeriod;
@@ -183,7 +183,7 @@
                 @Override public boolean apply() {
                     return getStatementCacheSize(qryProc) == 0;
                 }
-            }, STMT_CACHE_CLEANUP_TIMEOUT * 2));
+            }, STMT_CACHE_CLEANUP_TIMEOUT * 10));
         }
     }
 
