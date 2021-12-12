diff --git a/xchange-campbx/src/main/java/com/xeiam/xchange/campbx/service/marketdata/polling/CampBXPollingAccountService.java b/xchange-campbx/src/main/java/com/xeiam/xchange/campbx/service/marketdata/polling/CampBXPollingAccountService.java
index adad222..e424996 100644
--- a/xchange-campbx/src/main/java/com/xeiam/xchange/campbx/service/marketdata/polling/CampBXPollingAccountService.java
+++ b/xchange-campbx/src/main/java/com/xeiam/xchange/campbx/service/marketdata/polling/CampBXPollingAccountService.java
@@ -77,7 +77,7 @@
     CampBXResponse result = campbx.withdrawBtc(exchangeSpecification.getUserName(), exchangeSpecification.getPassword(), address, amount);
     log.debug("result = {}", result);
     CambBXUtils.handleError(result);
-    return result.getInfo();
+    return result.getSuccess();
   }
 
   @Override
