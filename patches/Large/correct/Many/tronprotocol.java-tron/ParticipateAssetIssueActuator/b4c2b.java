diff --git a/src/main/java/org/tron/core/actuator/ParticipateAssetIssueActuator.java b/src/main/java/org/tron/core/actuator/ParticipateAssetIssueActuator.java
index 9f6594b..79e0025 100644
--- a/src/main/java/org/tron/core/actuator/ParticipateAssetIssueActuator.java
+++ b/src/main/java/org/tron/core/actuator/ParticipateAssetIssueActuator.java
@@ -126,7 +126,8 @@
       int num = assetIssueCapsule.getNum();
       long exchangeAmount = cost / trxNum * num;
       float preciseExchangeAmount = (float) cost / (float) trxNum * (float) num;
-      if (preciseExchangeAmount - exchangeAmount >= 0.000001f) {
+      if (preciseExchangeAmount - exchangeAmount >= 0.000001f
+          || preciseExchangeAmount - exchangeAmount <= -0.000001f) {
         throw new ContractValidateException("Can not process the exchange!");
       }
     } catch (InvalidProtocolBufferException e) {
