diff --git a/src/main/java/org/tron/common/runtime/Runtime.java b/src/main/java/org/tron/common/runtime/Runtime.java
index c4d03d2..3a585c6 100644
--- a/src/main/java/org/tron/common/runtime/Runtime.java
+++ b/src/main/java/org/tron/common/runtime/Runtime.java
@@ -573,7 +573,7 @@
     }
     long originStorageUsage = useedStorageSize * originResourcePercent / 100;
     originStorageUsage = min(originCpuUsage, origin.getStorageLeft());
-    long callerStorageUsage = originStorageUsage - originStorageUsage;
+    long callerStorageUsage = useedStorageSize - originStorageUsage;
 
     byte[] callerAddressBytes = TransactionCapsule.getOwner(trx.getRawData().getContract(0));
     AccountCapsule caller = deposit.getAccount(callerAddressBytes);
