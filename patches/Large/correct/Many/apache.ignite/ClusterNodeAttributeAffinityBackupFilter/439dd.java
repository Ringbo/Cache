diff --git a/modules/core/src/main/java/org/apache/ignite/cache/affinity/rendezvous/ClusterNodeAttributeAffinityBackupFilter.java b/modules/core/src/main/java/org/apache/ignite/cache/affinity/rendezvous/ClusterNodeAttributeAffinityBackupFilter.java
index 3949a28..592ca53 100644
--- a/modules/core/src/main/java/org/apache/ignite/cache/affinity/rendezvous/ClusterNodeAttributeAffinityBackupFilter.java
+++ b/modules/core/src/main/java/org/apache/ignite/cache/affinity/rendezvous/ClusterNodeAttributeAffinityBackupFilter.java
@@ -88,7 +88,7 @@
     /**
      * @param attributeNames The list of attribute names for the set of attributes to compare. Must be at least one.
      */
-    ClusterNodeAttributeAffinityBackupFilter(String... attributeNames) {
+    public ClusterNodeAttributeAffinityBackupFilter(String... attributeNames) {
         A.ensure(attributeNames.length > 0, "attributeNames.length > 0");
 
         this.attributeNames = attributeNames;
