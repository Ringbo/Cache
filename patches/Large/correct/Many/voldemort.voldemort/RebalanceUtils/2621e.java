diff --git a/src/java/voldemort/utils/RebalanceUtils.java b/src/java/voldemort/utils/RebalanceUtils.java
index 14590e8..909699d 100644
--- a/src/java/voldemort/utils/RebalanceUtils.java
+++ b/src/java/voldemort/utils/RebalanceUtils.java
@@ -169,7 +169,7 @@
                                            VectorClock newClock) {
         for(Versioned<Cluster> versionedCluster: clockList) {
             VectorClock clock = (VectorClock) versionedCluster.getVersion();
-            if(Occured.CONCURRENTLY.equals(clock.equals(newClock)))
+            if(Occured.CONCURRENTLY.equals(clock.compare(newClock)))
                 throw new VoldemortException("Cluster is in inconsistent state got conflicting clocks "
                                              + clock + " and " + newClock);
 
