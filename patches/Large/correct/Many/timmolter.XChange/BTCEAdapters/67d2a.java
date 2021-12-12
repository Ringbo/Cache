diff --git a/xchange-btce/src/main/java/com/xeiam/xchange/btce/BTCEAdapters.java b/xchange-btce/src/main/java/com/xeiam/xchange/btce/BTCEAdapters.java
index ae906ea..7bb2d93 100644
--- a/xchange-btce/src/main/java/com/xeiam/xchange/btce/BTCEAdapters.java
+++ b/xchange-btce/src/main/java/com/xeiam/xchange/btce/BTCEAdapters.java
@@ -188,7 +188,7 @@
       OrderType orderType = o.getType() == BTCEOrder.Type.buy ? OrderType.BID : OrderType.ASK;
       String[] pair = o.getPair().split("_");
       String currency = pair[1].toUpperCase();
-      BigMoney price = BigMoney.of(CurrencyUnit.of(currency), o.getAmount());
+      BigMoney price = BigMoney.of(CurrencyUnit.of(currency), o.getRate());
       os.add(new LimitOrder(orderType, o.getAmount(), pair[0].toUpperCase(), currency, Long.toString(id), price));
     }
     return new OpenOrders(os);
