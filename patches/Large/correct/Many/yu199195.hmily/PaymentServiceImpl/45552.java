diff --git a/hmily-tcc-demo/hmily-tcc-demo-springcloud/hmily-tcc-demo-springcloud-order/src/main/java/com/hmily/tcc/demo/springcloud/order/service/impl/PaymentServiceImpl.java b/hmily-tcc-demo/hmily-tcc-demo-springcloud/hmily-tcc-demo-springcloud-order/src/main/java/com/hmily/tcc/demo/springcloud/order/service/impl/PaymentServiceImpl.java
index c520003..d3dbe52 100644
--- a/hmily-tcc-demo/hmily-tcc-demo-springcloud/hmily-tcc-demo-springcloud-order/src/main/java/com/hmily/tcc/demo/springcloud/order/service/impl/PaymentServiceImpl.java
+++ b/hmily-tcc-demo/hmily-tcc-demo-springcloud/hmily-tcc-demo-springcloud-order/src/main/java/com/hmily/tcc/demo/springcloud/order/service/impl/PaymentServiceImpl.java
@@ -76,7 +76,7 @@
 
         final Integer inventoryInfo= inventoryClient.findByProductId(order.getProductId());
 
-        if (accountInfo.compareTo(order.getTotalAmount()) <= 0) {
+        if (accountInfo.compareTo(order.getTotalAmount()) < 0) {
             throw  new TccRuntimeException("余额不足！");
         }
 
