diff --git a/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/adapter/ItemWriterAdapter.java b/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/adapter/ItemWriterAdapter.java
index 25a9960..46bfe0b 100644
--- a/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/adapter/ItemWriterAdapter.java
+++ b/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/adapter/ItemWriterAdapter.java
@@ -29,9 +29,9 @@
  * 
  * @author Robert Kasanicky
  */
-public class ItemWriterAdapter extends AbstractMethodInvokingDelegator<Object> implements ItemWriter {
+public class ItemWriterAdapter<T> extends AbstractMethodInvokingDelegator<T> implements ItemWriter<T> {
 	
-    public void write(Object item) throws Exception {
+    public void write(T item) throws Exception {
     	invokeDelegateMethodWithArgument(item);
     }
 
