diff --git a/BroadleafCommerce/src-framework/org/broadleafcommerce/order/domain/BroadleafFullfillmentGroup.java b/BroadleafCommerce/src-framework/org/broadleafcommerce/order/domain/BroadleafFullfillmentGroup.java
index f1c023a..308d337 100644
--- a/BroadleafCommerce/src-framework/org/broadleafcommerce/order/domain/BroadleafFullfillmentGroup.java
+++ b/BroadleafCommerce/src-framework/org/broadleafcommerce/order/domain/BroadleafFullfillmentGroup.java
@@ -10,7 +10,7 @@
 	private String referenceNumber;
 	private List<FullfillmentGroupItem> fullfillmentGroupItems;
 	private Address address;
-	private Object method;
+	private String method;
 	private double cost;
 	private String type;
 	
@@ -58,12 +58,12 @@
 	}
 
 	@Override
-	public Object getMethod() {
+	public String getMethod() {
 		return method;
 	}
 
 	@Override
-	public void setMethod(Object fullfillmentMethod) {
+	public void setMethod(String fullfillmentMethod) {
 		this.method = fullfillmentMethod;
 	}
 
