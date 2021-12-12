diff --git a/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/controller/checkout/BroadleafCheckoutController.java b/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/controller/checkout/BroadleafCheckoutController.java
index 5a6f73d..1974884 100644
--- a/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/controller/checkout/BroadleafCheckoutController.java
+++ b/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/controller/checkout/BroadleafCheckoutController.java
@@ -247,7 +247,7 @@
     	FulfillmentGroup fulfillmentGroup = null;
     	
     	for( FulfillmentGroup tempFulfillmentGroup : cart.getFulfillmentGroups()) {
-    		if(tempFulfillmentGroup.getId() == instructionForm.getId()) {
+    		if(tempFulfillmentGroup.getId() == instructionForm.getfulfillmentGroupId()) {
     			fulfillmentGroup = tempFulfillmentGroup;
     		}
     		
