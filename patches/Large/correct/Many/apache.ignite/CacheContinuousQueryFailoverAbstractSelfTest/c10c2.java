diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/query/continuous/CacheContinuousQueryFailoverAbstractSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/query/continuous/CacheContinuousQueryFailoverAbstractSelfTest.java
index 54791d7..937a059 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/query/continuous/CacheContinuousQueryFailoverAbstractSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/cache/query/continuous/CacheContinuousQueryFailoverAbstractSelfTest.java
@@ -1442,7 +1442,7 @@
             @Override public boolean apply() {
                 return backupQueue(ignite(0)).isEmpty();
             }
-        }, 2000);
+        }, 5000);
 
         assertTrue("Backup queue is not cleared: " + backupQueue(ignite(0)),
             backupQueue(ignite(0)).size() < BACKUP_ACK_THRESHOLD);
@@ -1508,7 +1508,7 @@
             @Override public boolean apply() {
                 return backupQueue(ignite(1)).isEmpty();
             }
-        }, 3000);
+        }, 5000);
 
         assertTrue("Backup queue is not cleared: " + backupQueue(ignite(1)),
             backupQueue(ignite(1)).size() < BACKUP_ACK_THRESHOLD);
