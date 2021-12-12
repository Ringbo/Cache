diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/promotionMessage/util/BLCPromotionMessageUtils.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/promotionMessage/util/BLCPromotionMessageUtils.java
index 57d6122..6524ebb 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/promotionMessage/util/BLCPromotionMessageUtils.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/promotionMessage/util/BLCPromotionMessageUtils.java
@@ -63,7 +63,7 @@
         return BLCCollectionUtils.collectList(promotionMessages, new TypedTransformer<String>() {
             @Override
             public String transform(Object input) {
-                PromotionMessage promotionMessage = (PromotionMessage) input;
+                PromotionMessageDTO promotionMessage = (PromotionMessageDTO) input;
                 return promotionMessage.getMessage();
             }
         });
