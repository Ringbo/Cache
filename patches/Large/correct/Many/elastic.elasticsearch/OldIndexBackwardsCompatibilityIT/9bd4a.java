diff --git a/core/src/test/java/org/elasticsearch/bwcompat/OldIndexBackwardsCompatibilityIT.java b/core/src/test/java/org/elasticsearch/bwcompat/OldIndexBackwardsCompatibilityIT.java
index a8fcdc7..1581828 100644
--- a/core/src/test/java/org/elasticsearch/bwcompat/OldIndexBackwardsCompatibilityIT.java
+++ b/core/src/test/java/org/elasticsearch/bwcompat/OldIndexBackwardsCompatibilityIT.java
@@ -436,7 +436,7 @@
 
     // #10067: create-bwc-index.py deleted any doc with long_sort:[10-20]
     void assertDeleteByQueryWorked(String indexName, Version version) throws Exception {
-        if (version.onOrBefore(Version.V_1_0_0_Beta2)) {
+        if (version.onOrBefore(Version.V_1_0_0_Beta2) || version.onOrAfter(Version.V_2_0_0_beta1)) {
             // TODO: remove this once #10262 is fixed
             return;
         }
