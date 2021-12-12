diff --git a/src/java/org/apache/hadoop/hbase/HMaster.java b/src/java/org/apache/hadoop/hbase/HMaster.java
index 9163eea..877379a 100644
--- a/src/java/org/apache/hadoop/hbase/HMaster.java
+++ b/src/java/org/apache/hadoop/hbase/HMaster.java
@@ -2087,7 +2087,7 @@
           if (closed.get()) {
             return true;
           }
-          if (!rootScanned ||
+          if (!rootRescanned ||
               numberOfMetaRegions.get() != onlineMetaRegions.size()) {
             // We can't proceed because not all of the meta regions are online.
             // We can't block either because that would prevent the meta region
@@ -2096,7 +2096,7 @@
             
             if (LOG.isDebugEnabled()) {
               LOG.debug("Requeuing shutdown because rootScanned: " +
-                  rootScanned + ", numberOfMetaRegions: " +
+                  rootRescanned + ", numberOfMetaRegions: " +
                   numberOfMetaRegions.get() + ", onlineMetaRegions.size(): " +
                   onlineMetaRegions.size());
             }
