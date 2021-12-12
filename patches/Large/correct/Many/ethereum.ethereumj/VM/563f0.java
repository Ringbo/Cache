diff --git a/ethereumj-core/src/main/java/org/ethereum/vm/VM.java b/ethereumj-core/src/main/java/org/ethereum/vm/VM.java
index 75e8681..654d2f4 100644
--- a/ethereumj-core/src/main/java/org/ethereum/vm/VM.java
+++ b/ethereumj-core/src/main/java/org/ethereum/vm/VM.java
@@ -376,7 +376,7 @@
             if (program.getNumber().intValue() == dumpBlock)
                 this.dumpLine(op, gasBefore, gasCost + callGas, memWords, program);
 
-            callVmHookAction(program, (hook, prg) -> vmHook.step(prg, op));
+            callVmHookAction(program, (hook, prg) -> hook.step(prg, op));
 
             // Execute operation
             switch (op) {
