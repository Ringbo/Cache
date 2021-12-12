diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/BeginLockScopeNode.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/BeginLockScopeNode.java
index 38ba809..6521e96 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/BeginLockScopeNode.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/BeginLockScopeNode.java
@@ -42,7 +42,7 @@
 
     private int lockDepth;
 
-    private BeginLockScopeNode(int lockDepth) {
+    BeginLockScopeNode(int lockDepth) {
         super(null);
         this.lockDepth = lockDepth;
     }
