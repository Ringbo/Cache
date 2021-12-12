diff --git a/src/test/java/org/tron/core/actuator/WitnessCreateActuatorTest.java b/src/test/java/org/tron/core/actuator/WitnessCreateActuatorTest.java
index 7600a0e..0904c7c 100644
--- a/src/test/java/org/tron/core/actuator/WitnessCreateActuatorTest.java
+++ b/src/test/java/org/tron/core/actuator/WitnessCreateActuatorTest.java
@@ -85,7 +85,7 @@
             ByteString.copyFromUtf8(ACCOUNT_NAME_FRIST),
             ByteString.copyFrom(ByteArray.fromHexString(OWNER_ADDRESS_FRIST)),
             AccountType.Normal,
-            200_000_000L);
+            200_000_000_000L);
 
     dbManager.getAccountStore()
         .put(ownerAccountSecondCapsule.getAddress().toByteArray(), ownerAccountSecondCapsule);
