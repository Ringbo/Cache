diff --git a/xchange-examples/src/main/java/org/knowm/xchange/examples/bitstamp/account/BitstampAccountDemo.java b/xchange-examples/src/main/java/org/knowm/xchange/examples/bitstamp/account/BitstampAccountDemo.java
index 24d32d0..ae9c41b 100644
--- a/xchange-examples/src/main/java/org/knowm/xchange/examples/bitstamp/account/BitstampAccountDemo.java
+++ b/xchange-examples/src/main/java/org/knowm/xchange/examples/bitstamp/account/BitstampAccountDemo.java
@@ -75,7 +75,7 @@
     }
 
     BitstampWithdrawal withdrawResult = accountService.withdrawBitstampFunds(Currency.BTC, new BigDecimal(1).movePointLeft(4),
-        "1PxYUsgKdw75sdLmM7HYP2p74LEq3mxM6L");
+        "1PxYUsgKdw75sdLmM7HYP2p74LEq3mxM6L", null);
     System.out.println("BitstampBooleanResponse = " + withdrawResult);
   }
 }
