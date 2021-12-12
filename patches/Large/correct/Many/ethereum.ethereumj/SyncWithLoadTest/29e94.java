diff --git a/ethereumj-core/src/test/java/org/ethereum/longrun/SyncWithLoadTest.java b/ethereumj-core/src/test/java/org/ethereum/longrun/SyncWithLoadTest.java
index 1292139..bfc0211 100644
--- a/ethereumj-core/src/test/java/org/ethereum/longrun/SyncWithLoadTest.java
+++ b/ethereumj-core/src/test/java/org/ethereum/longrun/SyncWithLoadTest.java
@@ -142,7 +142,7 @@
                     // Getting contract details
                     byte[] contractAddress = receipt.getTransaction().getContractAddress();
                     if (contractAddress != null) {
-                        ContractDetails details = ((RepositoryImpl) ethereum.getRepository()).getContractDetails(contractAddress);
+                        ContractDetails details = ((Repository) ethereum.getRepository()).getContractDetails(contractAddress);
                         assert FastByteComparisons.equal(details.getAddress(), contractAddress);
                     }
 
@@ -151,14 +151,14 @@
                     Block bestBlock = ethereum.getBlockchain().getBestBlock();
                     Block randomBlock = ethereum.getBlockchain().getBlockByNumber(rnd.nextInt((int) bestBlock.getNumber()));
                     byte[] sender = receipt.getTransaction().getSender();
-                    AccountState senderState = ((RepositoryImpl) ethereum.getRepository()).getSnapshotTo(randomBlock.getStateRoot()).getAccountState(sender);
+                    AccountState senderState = ((Repository) ethereum.getRepository()).getSnapshotTo(randomBlock.getStateRoot()).getAccountState(sender);
                     if (senderState != null) senderState.getBalance();
 
                     // Getting receiver's nonce somewhere in the past
                     Block anotherRandomBlock = ethereum.getBlockchain().getBlockByNumber(rnd.nextInt((int) bestBlock.getNumber()));
                     byte[] receiver = receipt.getTransaction().getReceiveAddress();
                     if (receiver != null) {
-                        ((RepositoryImpl) ethereum.getRepository()).getSnapshotTo(anotherRandomBlock.getStateRoot()).getNonce(receiver);
+                        ((Repository) ethereum.getRepository()).getSnapshotTo(anotherRandomBlock.getStateRoot()).getNonce(receiver);
                     }
                 }
             }
@@ -267,7 +267,7 @@
                     }
                     regularNode.close();
                     testLogger.info("Run stopped");
-                    sleep(60_000);
+                    sleep(10_000);
                     testLogger.info("Starting next run");
                     runEthereum();
                     isRunning.set(true);
