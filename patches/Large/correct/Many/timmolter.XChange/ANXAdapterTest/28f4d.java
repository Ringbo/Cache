diff --git a/xchange-anx/src/test/java/org/knowm/xchange/anx/v2/ANXAdapterTest.java b/xchange-anx/src/test/java/org/knowm/xchange/anx/v2/ANXAdapterTest.java
index 2f82375..62b8ad2 100644
--- a/xchange-anx/src/test/java/org/knowm/xchange/anx/v2/ANXAdapterTest.java
+++ b/xchange-anx/src/test/java/org/knowm/xchange/anx/v2/ANXAdapterTest.java
@@ -159,7 +159,7 @@
 
     // in Wallet, only wallets from ANXAccountInfo.getBalancesList that contained data are NOT null.
     Collection<Balance> balances = ANXAdapters.adaptWallet(anxAccountInfo.getWallets()).getBalances().values();
-    Assert.assertEquals(21, balances.size());
+    Assert.assertEquals(22, balances.size());
 
     Assert.assertTrue(balances.contains(new Balance(Currency.CAD, new BigDecimal("100000.00000"), new BigDecimal("100000.00000"))));
     Assert.assertTrue(balances.contains(new Balance(Currency.BTC, new BigDecimal("100000.01988000"), new BigDecimal("100000.01988000"))));
