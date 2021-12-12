diff --git a/spring-batch-infrastructure/src/main/java/org/springframework/batch/support/transaction/TransactionAwareBufferedWriter.java b/spring-batch-infrastructure/src/main/java/org/springframework/batch/support/transaction/TransactionAwareBufferedWriter.java
index 54dd2b2..29bf042 100644
--- a/spring-batch-infrastructure/src/main/java/org/springframework/batch/support/transaction/TransactionAwareBufferedWriter.java
+++ b/spring-batch-infrastructure/src/main/java/org/springframework/batch/support/transaction/TransactionAwareBufferedWriter.java
@@ -88,11 +88,11 @@
 	/**
 	 * @return
 	 */
-	private StringBuffer getCurrentBuffer() {
+	private StringBuilder getCurrentBuffer() {
 
 		if (!TransactionSynchronizationManager.hasResource(bufferKey)) {
 
-			TransactionSynchronizationManager.bindResource(bufferKey, new StringBuffer());
+			TransactionSynchronizationManager.bindResource(bufferKey, new StringBuilder());
 
 			TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronizationAdapter() {
 				@Override
@@ -113,7 +113,7 @@
 				}
 
 				private void complete() throws IOException {
-					StringBuffer buffer = (StringBuffer) TransactionSynchronizationManager.getResource(bufferKey);
+					StringBuilder buffer = (StringBuilder) TransactionSynchronizationManager.getResource(bufferKey);
 					if (buffer != null) {
 						String string = buffer.toString();
 						byte[] bytes = string.getBytes(encoding);
@@ -145,7 +145,7 @@
 
 		}
 
-		return (StringBuffer) TransactionSynchronizationManager.getResource(bufferKey);
+		return (StringBuilder) TransactionSynchronizationManager.getResource(bufferKey);
 
 	}
 
@@ -222,7 +222,7 @@
 			return;
 		}
 
-		StringBuffer buffer = getCurrentBuffer();
+		StringBuilder buffer = getCurrentBuffer();
 		buffer.append(cbuf, off, len);
 	}
 }
