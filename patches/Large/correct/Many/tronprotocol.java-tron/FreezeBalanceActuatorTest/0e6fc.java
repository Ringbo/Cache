diff --git a/src/test/java/org/tron/core/actuator/FreezeBalanceActuatorTest.java b/src/test/java/org/tron/core/actuator/FreezeBalanceActuatorTest.java
index f177552..72dba9b 100644
--- a/src/test/java/org/tron/core/actuator/FreezeBalanceActuatorTest.java
+++ b/src/test/java/org/tron/core/actuator/FreezeBalanceActuatorTest.java
@@ -167,7 +167,7 @@
   }
 
   @Test
-  public void testFreezeBalanceForCpu() {
+  public void testFreezeBalanceForEnergy() {
     long frozenBalance = 1_000_000_000L;
     long duration = 3;
     FreezeBalanceActuator actuator = new FreezeBalanceActuator(
@@ -183,7 +183,7 @@
       Assert.assertEquals(owner.getBalance(), initBalance - frozenBalance
           - ChainConstant.TRANSFER_FEE);
       Assert.assertEquals(0L,owner.getFrozenBalance());
-      Assert.assertEquals(frozenBalance,owner.getEnergyUsage() );
+      Assert.assertEquals(frozenBalance,owner.getEnergyFrozenBalance() );
       Assert.assertEquals(frozenBalance, owner.getTronPower());
     } catch (ContractValidateException e) {
       Assert.assertFalse(e instanceof ContractValidateException);
