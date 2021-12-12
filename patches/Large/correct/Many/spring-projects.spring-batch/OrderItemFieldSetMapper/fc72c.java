diff --git a/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/OrderItemFieldSetMapper.java b/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/OrderItemFieldSetMapper.java
index a7eb31b..cfa24a5 100644
--- a/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/OrderItemFieldSetMapper.java
+++ b/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/OrderItemFieldSetMapper.java
@@ -21,7 +21,7 @@
 import org.springframework.batch.sample.domain.LineItem;
 
 
-public class OrderItemFieldSetMapper implements FieldSetMapper {
+public class OrderItemFieldSetMapper implements FieldSetMapper<LineItem> {
 	
 	public static final String TOTAL_PRICE_COLUMN = "TOTAL_PRICE";
 	public static final String QUANTITY_COLUMN = "QUANTITY";
@@ -33,7 +33,7 @@
 	public static final String ITEM_ID_COLUMN = "ITEM_ID";
 	
 	
-    public Object mapLine(FieldSet fieldSet, int lineNum) {
+    public LineItem mapLine(FieldSet fieldSet, int lineNum) {
         LineItem item = new LineItem();
 
         item.setItemId(fieldSet.readLong(ITEM_ID_COLUMN));
