diff --git a/src/main/java/org/tron/core/actuator/ExchangeWithdrawActuator.java b/src/main/java/org/tron/core/actuator/ExchangeWithdrawActuator.java
index 98682a6..dfdf42c 100755
--- a/src/main/java/org/tron/core/actuator/ExchangeWithdrawActuator.java
+++ b/src/main/java/org/tron/core/actuator/ExchangeWithdrawActuator.java
@@ -57,7 +57,7 @@
 //        anotherTokenQuant = Math
 //            .floorDiv(Math.multiplyExact(secondTokenBalance, tokenQuant), firstTokenBalance);
         anotherTokenQuant = bigSecondTokenBalance.multiply(bigTokenQuant)
-            .divide(bigFirstTokenBalance).longValue();
+            .divide(bigFirstTokenBalance).longValueExact();
         exchangeCapsule.setBalance(firstTokenBalance - tokenQuant,
             secondTokenBalance - anotherTokenQuant);
       } else {
@@ -65,7 +65,7 @@
 //        anotherTokenQuant = Math
 //            .floorDiv(Math.multiplyExact(firstTokenBalance, tokenQuant), secondTokenBalance);
         anotherTokenQuant = bigFirstTokenBalance.multiply(bigTokenQuant)
-            .divide(bigSecondTokenBalance).longValue();
+            .divide(bigSecondTokenBalance).longValueExact();
         exchangeCapsule.setBalance(firstTokenBalance - anotherTokenQuant,
             secondTokenBalance - tokenQuant);
       }
@@ -180,7 +180,7 @@
 //      anotherTokenQuant = Math
 //          .floorDiv(Math.multiplyExact(secondTokenBalance, tokenQuant), firstTokenBalance);
       anotherTokenQuant = bigSecondTokenBalance.multiply(bigTokenQuant)
-          .divide(bigFirstTokenBalance).longValue();
+          .divide(bigFirstTokenBalance).longValueExact();
       if (firstTokenBalance < tokenQuant || secondTokenBalance < anotherTokenQuant) {
         throw new ContractValidateException("exchange balance is not enough");
       }
@@ -188,7 +188,7 @@
 //      anotherTokenQuant = Math
 //          .floorDiv(Math.multiplyExact(firstTokenBalance, tokenQuant), secondTokenBalance);
       anotherTokenQuant = bigFirstTokenBalance.multiply(bigTokenQuant)
-          .divide(bigSecondTokenBalance).longValue();
+          .divide(bigSecondTokenBalance).longValueExact();
       if (secondTokenBalance < tokenQuant || firstTokenBalance < anotherTokenQuant) {
         throw new ContractValidateException("exchange balance is not enough");
       }
