diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/UnsafeArrayCopyNode.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/UnsafeArrayCopyNode.java
index 57f2563..81ed755 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/UnsafeArrayCopyNode.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/replacements/UnsafeArrayCopyNode.java
@@ -44,7 +44,7 @@
 
     private Kind elementKind;
 
-    private UnsafeArrayCopyNode(ValueNode src, ValueNode srcPos, ValueNode dest, ValueNode destPos, ValueNode length, ValueNode layoutHelper, Kind elementKind) {
+    UnsafeArrayCopyNode(ValueNode src, ValueNode srcPos, ValueNode dest, ValueNode destPos, ValueNode length, ValueNode layoutHelper, Kind elementKind) {
         super(StampFactory.forVoid());
         assert layoutHelper == null || elementKind == null;
         this.src = src;
