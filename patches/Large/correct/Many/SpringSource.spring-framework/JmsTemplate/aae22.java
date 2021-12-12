diff --git a/spring-jms/src/main/java/org/springframework/jms/core/JmsTemplate.java b/spring-jms/src/main/java/org/springframework/jms/core/JmsTemplate.java
index d1d9cae..8ae419c 100644
--- a/spring-jms/src/main/java/org/springframework/jms/core/JmsTemplate.java
+++ b/spring-jms/src/main/java/org/springframework/jms/core/JmsTemplate.java
@@ -121,7 +121,7 @@
 
 	private long receiveTimeout = RECEIVE_TIMEOUT_INDEFINITE_WAIT;
 
-	private long deliveryDelay = 0;
+	private long deliveryDelay = -1;
 
 
 	private boolean explicitQosEnabled = false;
@@ -333,7 +333,7 @@
 
 	/**
 	 * Set the delivery delay to use for send calls (in milliseconds).
-	 * <p>The default is 0 (no delivery delay).
+	 * <p>The default is -1 (no delivery delay passed on to the broker).
 	 * Note that this feature requires JMS 2.0.
 	 */
 	public void setDeliveryDelay(long deliveryDelay) {
@@ -622,7 +622,7 @@
 	 * @throws JMSException if thrown by JMS API methods
 	 */
 	protected void doSend(MessageProducer producer, Message message) throws JMSException {
-		if (this.deliveryDelay > 0) {
+		if (this.deliveryDelay >= 0) {
 			if (setDeliveryDelayMethod == null) {
 				throw new IllegalStateException("setDeliveryDelay requires JMS 2.0");
 			}
