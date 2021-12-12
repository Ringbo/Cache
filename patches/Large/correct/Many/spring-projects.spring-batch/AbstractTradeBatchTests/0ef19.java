diff --git a/spring-batch-infrastructure/src/test/java/org/springframework/batch/repeat/support/AbstractTradeBatchTests.java b/spring-batch-infrastructure/src/test/java/org/springframework/batch/repeat/support/AbstractTradeBatchTests.java
index 19ff4f4..9d7f032 100644
--- a/spring-batch-infrastructure/src/test/java/org/springframework/batch/repeat/support/AbstractTradeBatchTests.java
+++ b/spring-batch-infrastructure/src/test/java/org/springframework/batch/repeat/support/AbstractTradeBatchTests.java
@@ -65,12 +65,12 @@
 		}
 	}
 
-	protected static class TradeWriter extends AbstractItemWriter {
+	protected static class TradeWriter extends AbstractItemWriter<Trade> {
 		int count = 0;
 
 		// This has to be synchronized because we are going to test the state
 		// (count) at the end of a concurrent batch run.
-		public synchronized void write(Object data) {
+		public synchronized void write(Trade data) {
 			count++;
 			System.out.println("Executing trade '" + data + "'");
 		}
