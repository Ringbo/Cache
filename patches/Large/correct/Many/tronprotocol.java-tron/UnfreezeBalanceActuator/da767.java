diff --git a/src/main/java/org/tron/core/actuator/UnfreezeBalanceActuator.java b/src/main/java/org/tron/core/actuator/UnfreezeBalanceActuator.java
index 0c4ca63..3c4c23c 100755
--- a/src/main/java/org/tron/core/actuator/UnfreezeBalanceActuator.java
+++ b/src/main/java/org/tron/core/actuator/UnfreezeBalanceActuator.java
@@ -146,7 +146,7 @@
               .get(receiverAddress);
           if (delegatedResourceAccountIndexCapsule != null) {
             List<ByteString> fromAccountsList = new ArrayList<>(delegatedResourceAccountIndexCapsule
-                .getToAccountsList());
+                .getFromAccountsList());
             fromAccountsList.remove(ByteString.copyFrom(ownerAddress));
             delegatedResourceAccountIndexCapsule.setAllFromAccounts(fromAccountsList);
             dbManager.getDelegatedResourceAccountIndexStore()
