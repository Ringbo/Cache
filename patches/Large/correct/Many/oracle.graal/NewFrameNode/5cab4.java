diff --git a/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/nodes/frame/NewFrameNode.java b/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/nodes/frame/NewFrameNode.java
index 4943081..30319f6 100644
--- a/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/nodes/frame/NewFrameNode.java
+++ b/graal/com.oracle.graal.truffle/src/com/oracle/graal/truffle/nodes/frame/NewFrameNode.java
@@ -94,7 +94,7 @@
     static final class IntrinsifyFrameAccessorsSpeculationReason implements SpeculationReason {
         private final FrameDescriptor frameDescriptor;
 
-        public IntrinsifyFrameAccessorsSpeculationReason(FrameDescriptor frameDescriptor) {
+        IntrinsifyFrameAccessorsSpeculationReason(FrameDescriptor frameDescriptor) {
             this.frameDescriptor = frameDescriptor;
         }
 
