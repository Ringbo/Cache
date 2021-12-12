diff --git a/platform/lang-impl/src/com/intellij/ide/util/MemberChooser.java b/platform/lang-impl/src/com/intellij/ide/util/MemberChooser.java
index fd75f4c..54ae97d 100644
--- a/platform/lang-impl/src/com/intellij/ide/util/MemberChooser.java
+++ b/platform/lang-impl/src/com/intellij/ide/util/MemberChooser.java
@@ -545,10 +545,10 @@
   }
 
   private static void sortNode(ParentNode node, final Comparator<ElementNode> sortComparator) {
-    ArrayList<MemberNode> arrayList = new ArrayList<MemberNode>();
+    ArrayList<ElementNode> arrayList = new ArrayList<ElementNode>();
     Enumeration<TreeNode> children = node.children();
     while (children.hasMoreElements()) {
-      arrayList.add((MemberNode)children.nextElement());
+      arrayList.add((ElementNode)children.nextElement());
     }
 
     Collections.sort(arrayList, sortComparator);
