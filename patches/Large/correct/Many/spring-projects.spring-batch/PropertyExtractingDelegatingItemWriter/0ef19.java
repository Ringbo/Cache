diff --git a/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/adapter/PropertyExtractingDelegatingItemWriter.java b/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/adapter/PropertyExtractingDelegatingItemWriter.java
index 27e0f37..cdbb62a 100644
--- a/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/adapter/PropertyExtractingDelegatingItemWriter.java
+++ b/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/adapter/PropertyExtractingDelegatingItemWriter.java
@@ -31,7 +31,7 @@
  * 
  * @author Robert Kasanicky
  */
-public class PropertyExtractingDelegatingItemWriter extends AbstractMethodInvokingDelegator<Object> implements ItemWriter {
+public class PropertyExtractingDelegatingItemWriter<T> extends AbstractMethodInvokingDelegator<T> implements ItemWriter<T> {
 	
 	private String[] fieldsUsedAsTargetMethodArguments;
 	
@@ -39,7 +39,7 @@
 	 * Extracts values from item's fields named in fieldsUsedAsTargetMethodArguments
 	 * and passes them as arguments to the delegate method.
 	 */
-	public void write(Object item) throws Exception {
+	public void write(T item) throws Exception {
 		// helper for extracting property values from a bean
 		BeanWrapper beanWrapper = new BeanWrapperImpl(item);
 		
