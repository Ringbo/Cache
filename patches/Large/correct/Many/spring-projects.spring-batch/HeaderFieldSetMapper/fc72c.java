diff --git a/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/HeaderFieldSetMapper.java b/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/HeaderFieldSetMapper.java
index 3780a84..d4ce2ab 100644
--- a/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/HeaderFieldSetMapper.java
+++ b/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/HeaderFieldSetMapper.java
@@ -22,12 +22,12 @@
 
 
 
-public class HeaderFieldSetMapper implements FieldSetMapper {
+public class HeaderFieldSetMapper implements FieldSetMapper<Order> {
 	
 	public static final String ORDER_ID_COLUMN = "ORDER_ID";
 	public static final String ORDER_DATE_COLUMN = "ORDER_DATE";
 	
-    public Object mapLine(FieldSet fieldSet, int lineNum) {
+    public Order mapLine(FieldSet fieldSet, int lineNum) {
         Order order = new Order();
         order.setOrderId(fieldSet.readLong(ORDER_ID_COLUMN));
         order.setOrderDate(fieldSet.readDate(ORDER_DATE_COLUMN));
