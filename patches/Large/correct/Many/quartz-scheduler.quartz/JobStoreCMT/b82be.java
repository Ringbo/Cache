diff --git a/quartz-core/src/main/java/org/quartz/impl/jdbcjobstore/JobStoreCMT.java b/quartz-core/src/main/java/org/quartz/impl/jdbcjobstore/JobStoreCMT.java
index 6baa6d3..1e61e9f 100644
--- a/quartz-core/src/main/java/org/quartz/impl/jdbcjobstore/JobStoreCMT.java
+++ b/quartz-core/src/main/java/org/quartz/impl/jdbcjobstore/JobStoreCMT.java
@@ -245,7 +245,7 @@
             return txCallback.execute(conn);
         } finally {
             try {
-                releaseLock(LOCK_TRIGGER_ACCESS, transOwner);
+                releaseLock(lockName, transOwner);
             } finally {
                 cleanupConnection(conn);
             }
