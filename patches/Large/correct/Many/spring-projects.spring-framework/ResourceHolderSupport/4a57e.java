diff --git a/spring-tx/src/main/java/org/springframework/transaction/support/ResourceHolderSupport.java b/spring-tx/src/main/java/org/springframework/transaction/support/ResourceHolderSupport.java
index dadabb1..513135b 100644
--- a/spring-tx/src/main/java/org/springframework/transaction/support/ResourceHolderSupport.java
+++ b/spring-tx/src/main/java/org/springframework/transaction/support/ResourceHolderSupport.java
@@ -91,7 +91,7 @@
 	 * @param seconds number of seconds until expiration
 	 */
 	public void setTimeoutInSeconds(int seconds) {
-		setTimeoutInMillis(seconds * 1000);
+		setTimeoutInMillis(seconds * 1000L);
 	}
 
 	/**
