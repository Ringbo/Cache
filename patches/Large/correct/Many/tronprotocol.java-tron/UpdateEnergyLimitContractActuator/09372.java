diff --git a/src/main/java/org/tron/core/actuator/UpdateEnergyLimitContractActuator.java b/src/main/java/org/tron/core/actuator/UpdateEnergyLimitContractActuator.java
index cac8e33..696f1b8 100755
--- a/src/main/java/org/tron/core/actuator/UpdateEnergyLimitContractActuator.java
+++ b/src/main/java/org/tron/core/actuator/UpdateEnergyLimitContractActuator.java
@@ -50,7 +50,7 @@
 
   @Override
   public boolean validate() throws ContractValidateException {
-    if (!RuntimeImpl.isNewVersion()) {
+    if (RuntimeImpl.isNewVersion()) {
       throw new ContractValidateException(
           "contract type error,unexpected type [UpdateEnergyLimitContract]");
     }
