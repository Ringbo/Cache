diff --git a/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/ShippingFieldSetMapper.java b/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/ShippingFieldSetMapper.java
index 8a20fb8..3b41c6c 100644
--- a/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/ShippingFieldSetMapper.java
+++ b/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/ShippingFieldSetMapper.java
@@ -22,13 +22,13 @@
 
 
 
-public class ShippingFieldSetMapper implements FieldSetMapper {
+public class ShippingFieldSetMapper implements FieldSetMapper<ShippingInfo> {
 	
     public static final String ADDITIONAL_SHIPPING_INFO_COLUMN = "ADDITIONAL_SHIPPING_INFO";
 	public static final String SHIPPING_TYPE_ID_COLUMN = "SHIPPING_TYPE_ID";
 	public static final String SHIPPER_ID_COLUMN = "SHIPPER_ID";
 
-	public Object mapLine(FieldSet fieldSet, int lineNum) {
+	public ShippingInfo mapLine(FieldSet fieldSet, int lineNum) {
         ShippingInfo info = new ShippingInfo();
 
         info.setShipperId(fieldSet.readString(SHIPPER_ID_COLUMN));
