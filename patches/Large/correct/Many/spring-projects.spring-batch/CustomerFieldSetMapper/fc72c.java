diff --git a/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/CustomerFieldSetMapper.java b/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/CustomerFieldSetMapper.java
index 9149031..8f45e63 100644
--- a/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/CustomerFieldSetMapper.java
+++ b/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/CustomerFieldSetMapper.java
@@ -22,7 +22,7 @@
 
 
 
-public class CustomerFieldSetMapper implements FieldSetMapper {
+public class CustomerFieldSetMapper implements FieldSetMapper<Customer> {
 	
 	public static final String LINE_ID_COLUMN = "LINE_ID";
 	public static final String COMPANY_NAME_COLUMN = "COMPANY_NAME";
@@ -34,7 +34,7 @@
 	public static final String REG_ID_COLUMN = "REG_ID";
 	public static final String VIP_COLUMN = "VIP";
 	
-    public Object mapLine(FieldSet fieldSet, int lineNum) {
+    public Customer mapLine(FieldSet fieldSet, int lineNum) {
         Customer customer = new Customer();
 
         if (Customer.LINE_ID_BUSINESS_CUST.equals(fieldSet.readString(LINE_ID_COLUMN))) {
