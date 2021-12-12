diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/CurrentJavaThreadNode.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/CurrentJavaThreadNode.java
index 6ee9a0d9..51c752a 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/CurrentJavaThreadNode.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/nodes/CurrentJavaThreadNode.java
@@ -42,7 +42,7 @@
 
     private LIRKind wordKind;
 
-    private CurrentJavaThreadNode(Kind kind) {
+    CurrentJavaThreadNode(Kind kind) {
         super(StampFactory.forKind(kind));
         this.wordKind = LIRKind.value(kind);
     }
