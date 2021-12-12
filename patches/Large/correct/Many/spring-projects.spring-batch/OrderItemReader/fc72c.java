diff --git a/spring-batch-samples/src/main/java/org/springframework/batch/sample/item/reader/OrderItemReader.java b/spring-batch-samples/src/main/java/org/springframework/batch/sample/item/reader/OrderItemReader.java
index a3cb95f..6e39bec 100644
--- a/spring-batch-samples/src/main/java/org/springframework/batch/sample/item/reader/OrderItemReader.java
+++ b/spring-batch-samples/src/main/java/org/springframework/batch/sample/item/reader/OrderItemReader.java
@@ -35,30 +35,30 @@
  * @author peter.zozom
  * 
  */
-public class OrderItemReader extends DelegatingItemReader {
+public class OrderItemReader extends DelegatingItemReader<Order> {
 	private static Log log = LogFactory.getLog(OrderItemReader.class);
 
 	private Order order;
 
 	private boolean recordFinished;
 
-	private FieldSetMapper headerMapper;
+	private FieldSetMapper<Order> headerMapper;
 
-	private FieldSetMapper customerMapper;
+	private FieldSetMapper<Customer> customerMapper;
 
-	private FieldSetMapper addressMapper;
+	private FieldSetMapper<Address> addressMapper;
 
-	private FieldSetMapper billingMapper;
+	private FieldSetMapper<BillingInfo> billingMapper;
 
-	private FieldSetMapper itemMapper;
+	private FieldSetMapper<LineItem> itemMapper;
 
-	private FieldSetMapper shippingMapper;
+	private FieldSetMapper<ShippingInfo> shippingMapper;
 
 	/**
 	 * @throws Exception
 	 * @see org.springframework.batch.item.ItemReader#read()
 	 */
-	public Object read() throws Exception {
+	public Order read() throws Exception {
 		recordFinished = false;
 
 		while (!recordFinished) {
@@ -67,7 +67,7 @@
 
 		log.info("Mapped: " + order);
 		
-		Object result = order;
+		Order result = order;
 		order = null;
 
 		return result;
@@ -91,7 +91,7 @@
 		// start a new Order
 		if (Order.LINE_ID_HEADER.equals(lineId)) {
 			log.debug("STARTING NEW RECORD");
-			order = (Order) headerMapper.mapLine(fieldSet, -1);
+			order = headerMapper.mapLine(fieldSet, -1);
 
 			return;
 		}
@@ -116,7 +116,7 @@
 			log.debug("MAPPING CUSTOMER");
 
 			if (order.getCustomer() == null) {
-				order.setCustomer((Customer) customerMapper.mapLine(fieldSet, -1));
+				order.setCustomer(customerMapper.mapLine(fieldSet, -1));
 				order.getCustomer().setBusinessCustomer(true);
 			}
 
@@ -127,7 +127,7 @@
 			log.debug("MAPPING CUSTOMER");
 
 			if (order.getCustomer() == null) {
-				order.setCustomer((Customer) customerMapper.mapLine(fieldSet, -1));
+				order.setCustomer(customerMapper.mapLine(fieldSet, -1));
 				order.getCustomer().setBusinessCustomer(false);
 			}
 
@@ -136,25 +136,25 @@
 
 		if (Address.LINE_ID_BILLING_ADDR.equals(lineId)) {
 			log.debug("MAPPING BILLING ADDRESS");
-			order.setBillingAddress((Address) addressMapper.mapLine(fieldSet, -1));
+			order.setBillingAddress(addressMapper.mapLine(fieldSet, -1));
 			return;
 		}
 
 		if (Address.LINE_ID_SHIPPING_ADDR.equals(lineId)) {
 			log.debug("MAPPING SHIPPING ADDRESS");
-			order.setShippingAddress((Address) addressMapper.mapLine(fieldSet, -1));
+			order.setShippingAddress(addressMapper.mapLine(fieldSet, -1));
 			return;
 		}
 
 		if (BillingInfo.LINE_ID_BILLING_INFO.equals(lineId)) {
 			log.debug("MAPPING BILLING INFO");
-			order.setBilling((BillingInfo) billingMapper.mapLine(fieldSet, -1));
+			order.setBilling(billingMapper.mapLine(fieldSet, -1));
 			return;
 		}
 
 		if (ShippingInfo.LINE_ID_SHIPPING_INFO.equals(lineId)) {
 			log.debug("MAPPING SHIPPING INFO");
-			order.setShipping((ShippingInfo) shippingMapper.mapLine(fieldSet, -1));
+			order.setShipping(shippingMapper.mapLine(fieldSet, -1));
 			return;
 		}
 
@@ -164,7 +164,7 @@
 			if (order.getLineItems() == null) {
 				order.setLineItems(new ArrayList<LineItem>());
 			}
-			order.getLineItems().add((LineItem) itemMapper.mapLine(fieldSet, -1));
+			order.getLineItems().add(itemMapper.mapLine(fieldSet, -1));
 
 			return;
 		}
@@ -173,27 +173,27 @@
 
 	}
 
-	public void setAddressMapper(FieldSetMapper addressMapper) {
+	public void setAddressMapper(FieldSetMapper<Address> addressMapper) {
 		this.addressMapper = addressMapper;
 	}
 
-	public void setBillingMapper(FieldSetMapper billingMapper) {
+	public void setBillingMapper(FieldSetMapper<BillingInfo> billingMapper) {
 		this.billingMapper = billingMapper;
 	}
 
-	public void setCustomerMapper(FieldSetMapper customerMapper) {
+	public void setCustomerMapper(FieldSetMapper<Customer> customerMapper) {
 		this.customerMapper = customerMapper;
 	}
 
-	public void setHeaderMapper(FieldSetMapper headerMapper) {
+	public void setHeaderMapper(FieldSetMapper<Order> headerMapper) {
 		this.headerMapper = headerMapper;
 	}
 
-	public void setItemMapper(FieldSetMapper itemMapper) {
+	public void setItemMapper(FieldSetMapper<LineItem> itemMapper) {
 		this.itemMapper = itemMapper;
 	}
 
-	public void setShippingMapper(FieldSetMapper shippingMapper) {
+	public void setShippingMapper(FieldSetMapper<ShippingInfo> shippingMapper) {
 		this.shippingMapper = shippingMapper;
 	}
 
