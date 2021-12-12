diff --git a/src/test/java/org/tron/core/capsule/utils/MerkleTreeTest.java b/src/test/java/org/tron/core/capsule/utils/MerkleTreeTest.java
index 4630601..c646d0e 100644
--- a/src/test/java/org/tron/core/capsule/utils/MerkleTreeTest.java
+++ b/src/test/java/org/tron/core/capsule/utils/MerkleTreeTest.java
@@ -88,7 +88,7 @@
     Assert.assertTrue(left.getRight() == null);
 
     Leaf right = root.getRight();
-    Assert.assertEquals(right.getHash(), hashList.get(0));
+    Assert.assertEquals(right.getHash(), hashList.get(1));
     Assert.assertTrue(right.getLeft() == null);
     Assert.assertTrue(right.getRight() == null);
   }
