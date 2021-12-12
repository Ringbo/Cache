diff --git a/h2o-algos/src/main/java/hex/tree/CompressedTree.java b/h2o-algos/src/main/java/hex/tree/CompressedTree.java
index f123fc0..75a3a7c 100644
--- a/h2o-algos/src/main/java/hex/tree/CompressedTree.java
+++ b/h2o-algos/src/main/java/hex/tree/CompressedTree.java
@@ -30,7 +30,7 @@
     AutoBuffer ab = new AutoBuffer(_bits);
     IcedBitSet ibs = null;      // Lazily set on hitting first group test
     while(true) {
-      int nodeType = ab.get1();
+      int nodeType = ab.get1U();
       int colId = ab.get2();
       if( colId == 65535 ) return scoreLeaf(ab);
 
@@ -56,7 +56,7 @@
       int rmask = (nodeType & 0xC0) >> 2;
       int skip = 0;
       switch(lmask) {
-      case 0:  skip = ab.get1();  break;
+      case 0:  skip = ab.get1U();  break;
       case 1:  skip = ab.get2();  break;
       case 2:  skip = ab.get3();  break;
       case 3:  skip = ab.get4();  break;
