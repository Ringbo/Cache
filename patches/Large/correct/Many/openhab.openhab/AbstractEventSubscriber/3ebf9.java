diff --git a/openhab-runtime/core/core/src/main/java/org/openhab/core/events/AbstractEventSubscriber.java b/openhab-runtime/core/core/src/main/java/org/openhab/core/events/AbstractEventSubscriber.java
index 1163ad7..d39f500 100644
--- a/openhab-runtime/core/core/src/main/java/org/openhab/core/events/AbstractEventSubscriber.java
+++ b/openhab-runtime/core/core/src/main/java/org/openhab/core/events/AbstractEventSubscriber.java
@@ -37,16 +37,16 @@
 		String topic = event.getTopic();
 		String[] topicParts = topic.split(TOPIC_SEPERATOR);
 		
-		if(!(topicParts.length > 2) && !topicParts[0].equals(TOPIC_PREFIX)) {
+		if(!(topicParts.length > 2) || !topicParts[0].equals(TOPIC_PREFIX)) {
 			return; // we have received an event with an invalid topic
 		}
 		String operation = topicParts[1];
 		
-		if(operation.equals(EventType.UPDATE)) {
+		if(operation.equals(EventType.UPDATE.toString())) {
 			State newState = (State) event.getProperty("state");
 			if(newState!=null) receiveUpdate(itemName, newState);
 		}
-		if(operation.equals(EventType.COMMAND)) {
+		if(operation.equals(EventType.COMMAND.toString())) {
 			Command command = (Command) event.getProperty("command");
 			if(command!=null) receiveCommand(itemName, command);
 		}
@@ -56,7 +56,7 @@
 		// default implementation: do nothing
 	}
 
-	public void receiveUpdate(String itemName, State newStatus) {
+	public void receiveUpdate(String itemName, State newState) {
 		// default implementation: do nothing
 	}
 
