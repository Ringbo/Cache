diff --git a/ethereumj-core/src/main/java/org/ethereum/vm/VM.java b/ethereumj-core/src/main/java/org/ethereum/vm/VM.java
index d4cb9d2..1889464 100644
--- a/ethereumj-core/src/main/java/org/ethereum/vm/VM.java
+++ b/ethereumj-core/src/main/java/org/ethereum/vm/VM.java
@@ -183,19 +183,19 @@
                     gasCost = GasCost.SHA3;
                     newMemSize = memNeeded(stack.peek(), stack.get(stack.size() - 2));
                     DataWord size = stack.get(stack.size() - 2);
-                    long chunkUsed = (size.longValue() + 31) / 32;
+                    long chunkUsed = (size.longValueSafe() + 31) / 32;
                     gasCost += chunkUsed * GasCost.SHA3_WORD;
                     break;
                 case CALLDATACOPY:
-                    copySize = stack.get(stack.size() - 3).longValue();
+                    copySize = stack.get(stack.size() - 3).longValueSafe();
                     newMemSize = memNeeded(stack.peek(), stack.get(stack.size() - 3));
                     break;
                 case CODECOPY:
-                    copySize = stack.get(stack.size() - 3).longValue();
+                    copySize = stack.get(stack.size() - 3).longValueSafe();
                     newMemSize = memNeeded(stack.peek(), stack.get(stack.size() - 3));
                     break;
                 case EXTCODECOPY:
-                    copySize = stack.get(stack.size() - 4).longValue();
+                    copySize = stack.get(stack.size() - 4).longValueSafe();
                     newMemSize = memNeeded(stack.get(stack.size() - 2), stack.get(stack.size() - 4));
                     break;
                 case CALL:
@@ -208,7 +208,7 @@
                         throw Program.Exception.notEnoughOpGas(op, callGasWord, program.getGas());
                     }
 
-                    gasCost += callGasWord.longValue();
+                    gasCost += callGasWord.longValueSafe();
 
                     DataWord callAddressWord = stack.get(stack.size() - 2);
 
@@ -613,7 +613,7 @@
                 case SHA3: {
                     DataWord memOffsetData = program.stackPop();
                     DataWord lengthData = program.stackPop();
-                    byte[] buffer = program.memoryChunk(memOffsetData.intValue(), lengthData.intValue());
+                    byte[] buffer = program.memoryChunk(memOffsetData.intValueSafe(), lengthData.intValueSafe());
 
                     byte[] encoded = sha3(buffer);
                     DataWord word = new DataWord(encoded);
@@ -713,7 +713,7 @@
                     if (logger.isInfoEnabled())
                         hint = "data: " + Hex.toHexString(msgData);
 
-                    program.memorySave(memOffsetData.intValue(), msgData);
+                    program.memorySave(memOffsetData.intValueSafe(), msgData);
                     program.step();
                 }
                 break;
@@ -785,7 +785,7 @@
                  */
                 case BLOCKHASH: {
 
-                    int blockIndex = program.stackPop().intValue();
+                    int blockIndex = program.stackPop().intValueSafe();
 
                     DataWord blockHash = program.getBlockHash(blockIndex);
 
@@ -890,7 +890,7 @@
                         topics.add(topic);
                     }
 
-                    byte[] data = program.memoryChunk(memStart.intValue(), memOffset.intValue());
+                    byte[] data = program.memoryChunk(memStart.intValueSafe(), memOffset.intValueSafe());
 
                     LogInfo logInfo =
                             new LogInfo(address.getLast20Bytes(), topics, data);
@@ -928,7 +928,7 @@
                     DataWord addr = program.stackPop();
                     DataWord value = program.stackPop();
                     byte[] byteVal = {value.getData()[31]};
-                    program.memorySave(addr.intValue(), byteVal);
+                    program.memorySave(addr.intValueSafe(), byteVal);
                     program.step();
                 }
                 break;
@@ -1133,7 +1133,7 @@
                     DataWord offset = program.stackPop();
                     DataWord size = program.stackPop();
 
-                    byte[] hReturn = program.memoryChunk(offset.intValue(), size.intValue());
+                    byte[] hReturn = program.memoryChunk(offset.intValueSafe(), size.intValueSafe());
                     program.setHReturn(hReturn);
 
                     if (logger.isInfoEnabled())
