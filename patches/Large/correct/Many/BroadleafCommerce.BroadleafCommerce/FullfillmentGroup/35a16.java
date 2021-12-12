diff --git a/BroadleafCommerce/src-framework/org/broadleafcommerce/order/domain/FullfillmentGroup.java b/BroadleafCommerce/src-framework/org/broadleafcommerce/order/domain/FullfillmentGroup.java
index 4adef8b..6ae3eb8 100644
--- a/BroadleafCommerce/src-framework/org/broadleafcommerce/order/domain/FullfillmentGroup.java
+++ b/BroadleafCommerce/src-framework/org/broadleafcommerce/order/domain/FullfillmentGroup.java
@@ -22,9 +22,9 @@
 	
 	public void setFullfillmentGroupItems(List<FullfillmentGroupItem> fullfillmentGroupItems);
 	
-	public Object getMethod();
+	public String getMethod();
 	
-	public void setMethod(Object fullfillmentMethod);
+	public void setMethod(String fullfillmentMethod);
 	
 	public double getCost();
 	
