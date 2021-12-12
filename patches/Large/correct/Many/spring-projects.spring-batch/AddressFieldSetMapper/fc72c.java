diff --git a/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/AddressFieldSetMapper.java b/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/AddressFieldSetMapper.java
index 55112c8..08d31c4 100644
--- a/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/AddressFieldSetMapper.java
+++ b/spring-batch-samples/src/main/java/org/springframework/batch/sample/mapping/AddressFieldSetMapper.java
@@ -22,7 +22,7 @@
 
 
 
-public class AddressFieldSetMapper implements FieldSetMapper {
+public class AddressFieldSetMapper implements FieldSetMapper<Address> {
 	
 	public static final String ADDRESSEE_COLUMN = "ADDRESSEE";
 	public static final String ADDRESS_LINE1_COLUMN = "ADDR_LINE1";
@@ -33,7 +33,7 @@
 	public static final String COUNTRY_COLUMN = "COUNTRY";
 	
 	
-    public Object mapLine(FieldSet fieldSet, int lineNum) {
+    public Address mapLine(FieldSet fieldSet, int lineNum) {
         Address address = new Address();
 
         address.setAddressee(fieldSet.readString(ADDRESSEE_COLUMN));
