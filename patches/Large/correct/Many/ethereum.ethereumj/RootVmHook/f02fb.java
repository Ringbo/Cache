diff --git a/ethereumj-core/src/main/java/org/ethereum/vm/hook/RootVmHook.java b/ethereumj-core/src/main/java/org/ethereum/vm/hook/RootVmHook.java
index 07b6fbd..512c7d6 100644
--- a/ethereumj-core/src/main/java/org/ethereum/vm/hook/RootVmHook.java
+++ b/ethereumj-core/src/main/java/org/ethereum/vm/hook/RootVmHook.java
@@ -63,11 +63,11 @@
 
     @Override
     public void step(Program program, OpCode opcode) {
-        safeProxyToAll(hook -> hook.startPlay(program));
+        safeProxyToAll(hook -> hook.step(program, opcode));
     }
 
     @Override
     public void stopPlay(Program program) {
-        safeProxyToAll(hook -> hook.startPlay(program));
+        safeProxyToAll(hook -> hook.stopPlay(program));
     }
 }
