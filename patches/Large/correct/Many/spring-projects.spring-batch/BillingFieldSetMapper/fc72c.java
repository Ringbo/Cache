diff --git a/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/BillingFieldSetMapper.java b/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/BillingFieldSetMapper.java
index fd011be..eec8f34 100644
--- a/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/BillingFieldSetMapper.java
+++ b/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/BillingFieldSetMapper.java
@@ -22,12 +22,12 @@
 
 
 
-public class BillingFieldSetMapper implements FieldSetMapper {
+public class BillingFieldSetMapper implements FieldSetMapper<BillingInfo> {
 	
 	public static final String PAYMENT_TYPE_ID_COLUMN = "PAYMENT_TYPE_ID";
 	public static final String PAYMENT_DESC_COLUMN = "PAYMENT_DESC";
 	
-    public Object mapLine(FieldSet fieldSet, int lineNum) {
+    public BillingInfo mapLine(FieldSet fieldSet, int lineNum) {
         BillingInfo info = new BillingInfo();
 
         info.setPaymentId(fieldSet.readString(PAYMENT_TYPE_ID_COLUMN));
