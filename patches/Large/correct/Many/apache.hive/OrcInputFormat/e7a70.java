diff --git a/ql/src/java/org/apache/hadoop/hive/ql/io/orc/OrcInputFormat.java b/ql/src/java/org/apache/hadoop/hive/ql/io/orc/OrcInputFormat.java
index 45f9d3d..0ccc3ad 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/io/orc/OrcInputFormat.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/io/orc/OrcInputFormat.java
@@ -754,7 +754,7 @@
               // eliminate stripes that doesn't satisfy the predicate condition
               includeStripe = new boolean[stripes.size()];
               for(int i=0; i < stripes.size(); ++i) {
-                includeStripe[i] = (i > stripeStats.size()) ||
+                includeStripe[i] = (i >= stripeStats.size()) ||
                     isStripeSatisfyPredicate(stripeStats.get(i), sarg,
                                              filterColumns);
                 if (LOG.isDebugEnabled() && !includeStripe[i]) {
