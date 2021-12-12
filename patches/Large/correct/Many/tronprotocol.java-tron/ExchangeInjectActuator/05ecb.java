diff --git a/src/main/java/org/tron/core/actuator/ExchangeInjectActuator.java b/src/main/java/org/tron/core/actuator/ExchangeInjectActuator.java
index e1fa57e..50fe745 100755
--- a/src/main/java/org/tron/core/actuator/ExchangeInjectActuator.java
+++ b/src/main/java/org/tron/core/actuator/ExchangeInjectActuator.java
@@ -176,7 +176,7 @@
 //      anotherTokenQuant = Math
 //          .floorDiv(Math.multiplyExact(secondTokenBalance, tokenQuant), firstTokenBalance);
       anotherTokenQuant = bigSecondTokenBalance.multiply(bigTokenQuant)
-          .divide(bigFirstTokenBalance).longValue();
+          .divide(bigFirstTokenBalance).longValueExact();
       newTokenBalance = firstTokenBalance + tokenQuant;
       newAnotherTokenBalance = secondTokenBalance + anotherTokenQuant;
     } else {
@@ -184,7 +184,7 @@
 //      anotherTokenQuant = Math
 //          .floorDiv(Math.multiplyExact(firstTokenBalance, tokenQuant), secondTokenBalance);
       anotherTokenQuant = bigFirstTokenBalance.multiply(bigTokenQuant)
-          .divide(bigSecondTokenBalance).longValue();
+          .divide(bigSecondTokenBalance).longValueExact();
       newTokenBalance = secondTokenBalance + tokenQuant;
       newAnotherTokenBalance = firstTokenBalance + anotherTokenQuant;
     }
