diff --git a/src/java/org/apache/cassandra/tools/StandaloneUpgrader.java b/src/java/org/apache/cassandra/tools/StandaloneUpgrader.java
index 357e99c..9329b0f 100644
--- a/src/java/org/apache/cassandra/tools/StandaloneUpgrader.java
+++ b/src/java/org/apache/cassandra/tools/StandaloneUpgrader.java
@@ -107,7 +107,7 @@
                     Upgrader upgrader = new Upgrader(cfs, sstable, handler);
                     upgrader.upgrade();
 
-                    sstable.markCompacted();
+                    sstable.markObsolete();
                     sstable.releaseReference();
                 }
                 catch (Exception e)
