diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/DimensionsNode.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/DimensionsNode.java
index fdfac87..2d44a15 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/DimensionsNode.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/DimensionsNode.java
@@ -43,7 +43,7 @@
 
     private final int rank;
 
-    private DimensionsNode(int rank) {
+    DimensionsNode(int rank) {
         super(null);
         this.rank = rank;
     }
