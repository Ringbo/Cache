diff --git a/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/ItemWriter.java b/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/ItemWriter.java
index 798ab61..4c467f5 100644
--- a/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/ItemWriter.java
+++ b/spring-batch-infrastructure/src/main/java/org/springframework/batch/item/ItemWriter.java
@@ -35,7 +35,7 @@
  * @author Dave Syer
  * @author Lucas Ward
  */
-public interface ItemWriter {
+public interface ItemWriter<T> {
 
 	/**
 	 * Process the supplied data element. Will be called multiple times during a
@@ -46,7 +46,7 @@
 	 * retry or a batch the framework will catch the exception and convert or
 	 * rethrow it as appropriate.
 	 */
-	void write(Object item) throws Exception;
+	void write(T item) throws Exception;
 
 	/**
 	 * Flush any buffers that are being held. This will usually be performed
