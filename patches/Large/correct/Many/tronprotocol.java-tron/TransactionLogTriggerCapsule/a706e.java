diff --git a/src/main/java/org/tron/common/logsfilter/capsule/TransactionLogTriggerCapsule.java b/src/main/java/org/tron/common/logsfilter/capsule/TransactionLogTriggerCapsule.java
index 2ad29de..00f83e1 100644
--- a/src/main/java/org/tron/common/logsfilter/capsule/TransactionLogTriggerCapsule.java
+++ b/src/main/java/org/tron/common/logsfilter/capsule/TransactionLogTriggerCapsule.java
@@ -152,7 +152,7 @@
       item.setCallValue(internalTransaction.getValue());
       item.setTokenInfo(internalTransaction.getTokenInfo());
       item.setCaller_address(Hex.toHexString(internalTransaction.getSender()));
-      item.setTransferTo_address(Hex.toHexString(internalTransaction.getReceiveAddress()));
+      item.setTransferTo_address(Hex.toHexString(internalTransaction.getTransferToAddress()));
       item.setData(Hex.toHexString(internalTransaction.getData()));
       item.setRejected(internalTransaction.isRejected());
       item.setNote(internalTransaction.getNote());
