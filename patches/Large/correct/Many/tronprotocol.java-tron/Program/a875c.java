diff --git a/src/main/java/org/tron/common/runtime/vm/program/Program.java b/src/main/java/org/tron/common/runtime/vm/program/Program.java
index b844cc8..08f4204 100644
--- a/src/main/java/org/tron/common/runtime/vm/program/Program.java
+++ b/src/main/java/org/tron/common/runtime/vm/program/Program.java
@@ -414,7 +414,7 @@
       return;
     }
 
-    byte[] senderAddress = convertToTronAddress(this.getCallerAddress().getLast20Bytes());
+    byte[] senderAddress = convertToTronAddress(this.getOwnerAddress().getLast20Bytes());
     // todo: need check the value > 0?
     long endowment = value.value().longValue();
     if (getStorage().getBalance(senderAddress) < endowment) {
@@ -580,7 +580,7 @@
 
     // FETCH THE SAVED STORAGE
     byte[] codeAddress = convertToTronAddress(msg.getCodeAddress().getLast20Bytes());
-    byte[] senderAddress = convertToTronAddress(getCallerAddress().getLast20Bytes());
+    byte[] senderAddress = convertToTronAddress(getOwnerAddress().getLast20Bytes());
     byte[] contextAddress = msg.getType().callIsStateless() ? senderAddress : codeAddress;
 
     if (logger.isInfoEnabled()) {
