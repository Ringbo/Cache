diff --git a/xchange-core/src/main/java/org/knowm/xchange/dto/trade/LimitOrder.java b/xchange-core/src/main/java/org/knowm/xchange/dto/trade/LimitOrder.java
index babbbdb..2bcb268 100644
--- a/xchange-core/src/main/java/org/knowm/xchange/dto/trade/LimitOrder.java
+++ b/xchange-core/src/main/java/org/knowm/xchange/dto/trade/LimitOrder.java
@@ -109,7 +109,7 @@
 
 	if (remainingAmount != null)
 	{
-		return getOriginalAmount().min(remainingAmount);
+		return getOriginalAmount().subtract(remainingAmount);
 	}
     return null;
   }
