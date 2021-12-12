diff --git a/src/org/nutz/lang/util/SimpleNode.java b/src/org/nutz/lang/util/SimpleNode.java
index 9874ec7..eada9be 100644
--- a/src/org/nutz/lang/util/SimpleNode.java
+++ b/src/org/nutz/lang/util/SimpleNode.java
@@ -316,7 +316,7 @@
 			return -1;
 		int i = 0;
 		Node<T> n = parent.firstChild();
-		while (n != this.child(i)) {
+		while (n != parent.child(i)) {
 			i++;
 		}
 		return i;
