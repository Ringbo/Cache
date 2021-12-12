diff --git a/ethereumj-core/src/main/java/org/ethereum/vm/VM.java b/ethereumj-core/src/main/java/org/ethereum/vm/VM.java
index f9551c0..13b1b83 100644
--- a/ethereumj-core/src/main/java/org/ethereum/vm/VM.java
+++ b/ethereumj-core/src/main/java/org/ethereum/vm/VM.java
@@ -196,11 +196,11 @@
                     DataWord callAddressWord = stack.get(stack.size() - 2);
 
                     //check to see if account does not exist and is not a precompiled contract
-                    if (op != CALLCODE && !program.getStorage().isExist(callAddressWord.getLast20Bytes()))
+                    if (op == CALL && !program.getStorage().isExist(callAddressWord.getLast20Bytes()))
                         gasCost += GasCost.NEW_ACCT_CALL;
 
                     //TODO #POC9 Make sure this is converted to BigInteger (256num support)
-                    if (!stack.get(stack.size() - 3).isZero() )
+                    if (op != DELEGATECALL && !stack.get(stack.size() - 3).isZero() )
                         gasCost += GasCost.VT_CALL;
 
                     int opOff = op == DELEGATECALL ? 3 : 4;
