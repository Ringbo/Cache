diff --git a/graal/com.oracle.truffle.sl/src/com/oracle/truffle/sl/builtins/SLHelloEqualsWorldBuiltin.java b/graal/com.oracle.truffle.sl/src/com/oracle/truffle/sl/builtins/SLHelloEqualsWorldBuiltin.java
index 9a07753..b3b3263 100644
--- a/graal/com.oracle.truffle.sl/src/com/oracle/truffle/sl/builtins/SLHelloEqualsWorldBuiltin.java
+++ b/graal/com.oracle.truffle.sl/src/com/oracle/truffle/sl/builtins/SLHelloEqualsWorldBuiltin.java
@@ -35,11 +35,11 @@
 public abstract class SLHelloEqualsWorldBuiltin extends SLBuiltinNode {
 
     @Specialization
-    public Object change() {
+    public String change() {
         FrameInstance frameInstance = Truffle.getRuntime().getStackTrace().iterator().next();
         Frame frame = frameInstance.getFrame(FrameAccess.READ_WRITE, false);
         FrameSlot slot = frame.getFrameDescriptor().findOrAddFrameSlot("hello");
         frame.setObject(slot, "world");
-        return null;
+        return "world";
     }
 }
