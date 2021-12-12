diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/ArrayCopyCallNode.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/ArrayCopyCallNode.java
index a028bcf..20ad4e3 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/ArrayCopyCallNode.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/ArrayCopyCallNode.java
@@ -58,7 +58,7 @@
     private boolean disjoint;
     private boolean uninitialized;
 
-    private ArrayCopyCallNode(ValueNode src, ValueNode srcPos, ValueNode dest, ValueNode destPos, ValueNode length, Kind elementKind, boolean aligned, boolean disjoint, boolean uninitialized) {
+    ArrayCopyCallNode(ValueNode src, ValueNode srcPos, ValueNode dest, ValueNode destPos, ValueNode length, Kind elementKind, boolean aligned, boolean disjoint, boolean uninitialized) {
         super(StampFactory.forVoid());
         assert elementKind != null;
         this.src = src;
@@ -72,7 +72,7 @@
         this.uninitialized = uninitialized;
     }
 
-    private ArrayCopyCallNode(ValueNode src, ValueNode srcPos, ValueNode dest, ValueNode destPos, ValueNode length, Kind elementKind, boolean disjoint) {
+    ArrayCopyCallNode(ValueNode src, ValueNode srcPos, ValueNode dest, ValueNode destPos, ValueNode length, Kind elementKind, boolean disjoint) {
         this(src, srcPos, dest, destPos, length, elementKind, false, disjoint, false);
     }
 
