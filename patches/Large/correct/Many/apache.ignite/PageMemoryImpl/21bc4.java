diff --git a/modules/core/src/main/java/org/apache/ignite/internal/pagemem/impl/PageMemoryImpl.java b/modules/core/src/main/java/org/apache/ignite/internal/pagemem/impl/PageMemoryImpl.java
index b46ba30..4bcb7b0 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/pagemem/impl/PageMemoryImpl.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/pagemem/impl/PageMemoryImpl.java
@@ -408,7 +408,7 @@
                         // We are in the segment write lock, so it is safe to remove the page if use counter is
                         // equal to 0.
                         if (page.flushCheckpoint(log))
-                            seg.acquiredPages.remove(pageId, page);
+                            seg.acquiredPages.remove(pageId);
                     }
                     // else page was not modified since the checkpoint started.
                     else {
