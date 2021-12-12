diff --git a/src/test/java/org/tron/core/actuator/ProposalCreateActuatorTest.java b/src/test/java/org/tron/core/actuator/ProposalCreateActuatorTest.java
index 6494a6d..7179d0a 100644
--- a/src/test/java/org/tron/core/actuator/ProposalCreateActuatorTest.java
+++ b/src/test/java/org/tron/core/actuator/ProposalCreateActuatorTest.java
@@ -232,7 +232,7 @@
   @Test
   public void invalidPara() {
     HashMap<Long, Long> paras = new HashMap<>();
-    paras.put(20L, 10000L);
+    paras.put(22L, 10000L);
     ProposalCreateActuator actuator =
         new ProposalCreateActuator(getContract(OWNER_ADDRESS_FIRST, paras), dbManager);
     TransactionResultCapsule ret = new TransactionResultCapsule();
