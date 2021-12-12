diff --git a/src/com/google/javascript/rhino/Node.java b/src/com/google/javascript/rhino/Node.java
index f0a7b60..f1ac1c0 100644
--- a/src/com/google/javascript/rhino/Node.java
+++ b/src/com/google/javascript/rhino/Node.java
@@ -729,7 +729,10 @@
   }
 
   public void addChildToBack(Node child) {
-    checkArgument(child.parent == null);
+    checkArgument(
+        child.parent == null,
+        "Cannot add already-owned child node.\nChild: %s\nExisting parent: %s\nNew parent: %s",
+        child, parent, this);
     checkArgument(child.next == null);
     checkArgument(child.previous == null);
 
