diff --git a/src/main/java/org/apache/hadoop/hbase/util/RegionSplitter.java b/src/main/java/org/apache/hadoop/hbase/util/RegionSplitter.java
index 30f17ee..bd524e7 100644
--- a/src/main/java/org/apache/hadoop/hbase/util/RegionSplitter.java
+++ b/src/main/java/org/apache/hadoop/hbase/util/RegionSplitter.java
@@ -584,7 +584,7 @@
    * @throws IOException if the specified SplitAlgorithm class couldn't be
    * instantiated
    */
-  static SplitAlgorithm newSplitAlgoInstance(Configuration conf,
+  public static SplitAlgorithm newSplitAlgoInstance(Configuration conf,
           String splitClassName) throws IOException {
     Class<?> splitClass;
 
