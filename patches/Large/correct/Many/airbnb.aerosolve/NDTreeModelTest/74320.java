diff --git a/core/src/test/java/com/airbnb/aerosolve/core/models/NDTreeModelTest.java b/core/src/test/java/com/airbnb/aerosolve/core/models/NDTreeModelTest.java
index 8ee8e48..9804e90 100644
--- a/core/src/test/java/com/airbnb/aerosolve/core/models/NDTreeModelTest.java
+++ b/core/src/test/java/com/airbnb/aerosolve/core/models/NDTreeModelTest.java
@@ -20,29 +20,29 @@
   // total space is from (0,0) to (4,4)
   public static NDTreeModel getNDTreeModel() {
     NDTreeNode parent = new NDTreeNode();
-    parent.setCoordinateIndex(0);
+    parent.setAxisIndex(0);
     parent.setSplitValue(1.0);
     parent.setLeftChild(1);
     parent.setRightChild(2);
 
     NDTreeNode one = new NDTreeNode();
-    one.setCoordinateIndex(LEAF);
+    one.setAxisIndex(LEAF);
     one.setMin(Arrays.asList(0.0,0.0));
     one.setMax(Arrays.asList(1.0,4.0));
 
     NDTreeNode two = new NDTreeNode();
-    two.setCoordinateIndex(1);
+    two.setAxisIndex(1);
     two.setSplitValue(2.0);
     two.setLeftChild(3);
     two.setRightChild(4);
 
     NDTreeNode three = new NDTreeNode();
-    three.setCoordinateIndex(LEAF);
+    three.setAxisIndex(LEAF);
     three.setMin(Arrays.asList(1.0,0.0));
     three.setMax(Arrays.asList(4.0,2.0));
 
     NDTreeNode four = new NDTreeNode();
-    four.setCoordinateIndex(LEAF);
+    four.setAxisIndex(LEAF);
     four.setMin(Arrays.asList(1.0,2.0));
     four.setMax(Arrays.asList(4.0,4.0));
 
@@ -52,29 +52,29 @@
 
   public static NDTreeModel getNDTreeModel1D() {
     NDTreeNode parent = new NDTreeNode();
-    parent.setCoordinateIndex(0);
+    parent.setAxisIndex(0);
     parent.setSplitValue(1.0);
     parent.setLeftChild(1);
     parent.setRightChild(2);
 
     NDTreeNode one = new NDTreeNode();
-    one.setCoordinateIndex(LEAF);
+    one.setAxisIndex(LEAF);
     one.setMin(Arrays.asList(0.0));
     one.setMax(Arrays.asList(1.0));
 
     NDTreeNode two = new NDTreeNode();
-    two.setCoordinateIndex(0);
+    two.setAxisIndex(0);
     two.setSplitValue(2.0);
     two.setLeftChild(3);
     two.setRightChild(4);
 
     NDTreeNode three = new NDTreeNode();
-    three.setCoordinateIndex(LEAF);
+    three.setAxisIndex(LEAF);
     three.setMin(Arrays.asList(1.0));
     three.setMax(Arrays.asList(2.0));
 
     NDTreeNode four = new NDTreeNode();
-    four.setCoordinateIndex(LEAF);
+    four.setAxisIndex(LEAF);
     four.setMin(Arrays.asList(2.0));
     four.setMax(Arrays.asList(4.0));
 
@@ -88,9 +88,9 @@
     assertEquals(2, tree.getDimension());
 
     NDTreeNode parent = new NDTreeNode();
-    parent.setCoordinateIndex(0);
+    parent.setAxisIndex(0);
     NDTreeNode one = new NDTreeNode();
-    one.setCoordinateIndex(3);
+    one.setAxisIndex(3);
     NDTreeNode[] arr = {parent, one};
     tree = new NDTreeModel(arr);
     assertEquals(4, tree.getDimension());
