diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/database/freelist/PagesList.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/database/freelist/PagesList.java
index ce653a9..8e5cf4f 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/database/freelist/PagesList.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/cache/database/freelist/PagesList.java
@@ -719,7 +719,7 @@
                         setupNextPage(io, prevId, prevBuf, nextId, nextBuf);
 
                         if (isWalDeltaRecordNeeded(wal, page))
-                            wal.log(new PagesListSetNextRecord(cacheId, pageId, nextId));
+                            wal.log(new PagesListSetNextRecord(cacheId, prevId, nextId));
 
                         // Here we should never write full page, because it is known to be new.
                         next.fullPageWalRecordPolicy(FALSE);
@@ -731,7 +731,7 @@
                                 io.getType(),
                                 io.getVersion(),
                                 nextId,
-                                pageId,
+                                prevId,
                                 0L
                             ));
 
@@ -745,7 +745,7 @@
                 else {
                     // TODO: use single WAL record for bag?
                     if (isWalDeltaRecordNeeded(wal, page))
-                        wal.log(new PagesListAddPageRecord(cacheId, pageId, nextId));
+                        wal.log(new PagesListAddPageRecord(cacheId, prevId, nextId));
                 }
             }
         }
