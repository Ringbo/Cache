diff --git a/modules/hadoop/src/main/java/org/gridgain/grid/kernal/processors/hadoop/shuffle/collections/GridHadoopSkipList.java b/modules/hadoop/src/main/java/org/gridgain/grid/kernal/processors/hadoop/shuffle/collections/GridHadoopSkipList.java
index a2b677c..8a16760 100644
--- a/modules/hadoop/src/main/java/org/gridgain/grid/kernal/processors/hadoop/shuffle/collections/GridHadoopSkipList.java
+++ b/modules/hadoop/src/main/java/org/gridgain/grid/kernal/processors/hadoop/shuffle/collections/GridHadoopSkipList.java
@@ -199,7 +199,7 @@
      * @param rnd Random.
      * @return Next level.
      */
-    static int randomLevel(Random rnd) {
+    public static int randomLevel(Random rnd) {
         int x = rnd.nextInt();
 
         int level = 0;
