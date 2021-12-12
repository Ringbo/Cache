diff --git a/ethereumj-core/src/main/java/org/ethereum/vm/program/Program.java b/ethereumj-core/src/main/java/org/ethereum/vm/program/Program.java
index 68685f6..eefff8d 100644
--- a/ethereumj-core/src/main/java/org/ethereum/vm/program/Program.java
+++ b/ethereumj-core/src/main/java/org/ethereum/vm/program/Program.java
@@ -107,7 +107,7 @@
         this.invoke = programInvoke;
         this.transaction = transaction;
 
-        this.codeHash = codeHash;
+        this.codeHash = codeHash == null || FastByteComparisons.equal(HashUtil.EMPTY_DATA_HASH, codeHash) ? null : codeHash;
         this.ops = nullToEmpty(ops);
 
         traceListener = new ProgramTraceListener(config.vmTrace());
@@ -570,7 +570,7 @@
                     msg.getGas(), contextBalance, data, track, this.invoke.getBlockStore(), byTestingSuite());
 
             VM vm = new VM(config);
-            Program program = new Program(getStorage().getCode(codeAddress), programCode, programInvoke, internalTx, config).withCommonConfig(commonConfig);
+            Program program = new Program(getStorage().getCodeHash(codeAddress), programCode, programInvoke, internalTx, config).withCommonConfig(commonConfig);
             vm.play(program);
             result = program.getResult();
 
