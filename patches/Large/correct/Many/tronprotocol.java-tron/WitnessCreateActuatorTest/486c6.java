diff --git a/src/test/java/org/tron/core/actuator/WitnessCreateActuatorTest.java b/src/test/java/org/tron/core/actuator/WitnessCreateActuatorTest.java
index ddf0eac..0d8a2d7 100644
--- a/src/test/java/org/tron/core/actuator/WitnessCreateActuatorTest.java
+++ b/src/test/java/org/tron/core/actuator/WitnessCreateActuatorTest.java
@@ -72,20 +72,20 @@
     WitnessCapsule ownerCapsule =
         new WitnessCapsule(
             ByteString.copyFrom(ByteArray.fromHexString(OWNER_ADDRESS_SECOND)),
-            10L,
+            10_000_000L,
             URL);
     AccountCapsule ownerAccountSecondCapsule =
         new AccountCapsule(
             ByteString.copyFromUtf8(ACCOUNT_NAME_SECOND),
             ByteString.copyFrom(ByteArray.fromHexString(OWNER_ADDRESS_SECOND)),
             AccountType.Normal,
-            300L);
+            300_000_000L);
     AccountCapsule ownerAccountFirstCapsule =
         new AccountCapsule(
             ByteString.copyFromUtf8(ACCOUNT_NAME_FRIST),
             ByteString.copyFrom(ByteArray.fromHexString(OWNER_ADDRESS_FRIST)),
             AccountType.Normal,
-            200L);
+            200_000_000L);
 
     dbManager.getAccountStore()
         .put(ownerAccountSecondCapsule.getAddress().toByteArray(), ownerAccountSecondCapsule);
