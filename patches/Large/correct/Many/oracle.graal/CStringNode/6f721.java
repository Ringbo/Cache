diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/CStringNode.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/CStringNode.java
index 2566c44..a8418b4 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/CStringNode.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/CStringNode.java
@@ -36,7 +36,7 @@
 
     private final String string;
 
-    private CStringNode(String string) {
+    CStringNode(String string) {
         super(null);
         this.string = string;
     }
