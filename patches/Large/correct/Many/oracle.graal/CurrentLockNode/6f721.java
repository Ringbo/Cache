diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/CurrentLockNode.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/CurrentLockNode.java
index 200540e..39083d8 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/CurrentLockNode.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/CurrentLockNode.java
@@ -38,7 +38,7 @@
 
     private int lockDepth;
 
-    private CurrentLockNode(int lockDepth) {
+    CurrentLockNode(int lockDepth) {
         super(null);
         this.lockDepth = lockDepth;
     }
