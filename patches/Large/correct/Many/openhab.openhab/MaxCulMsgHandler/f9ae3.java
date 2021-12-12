diff --git a/bundles/binding/org.openhab.binding.maxcul/src/main/java/org/openhab/binding/maxcul/internal/messages/MaxCulMsgHandler.java b/bundles/binding/org.openhab.binding.maxcul/src/main/java/org/openhab/binding/maxcul/internal/messages/MaxCulMsgHandler.java
index a1eb593..9d655ff 100644
--- a/bundles/binding/org.openhab.binding.maxcul/src/main/java/org/openhab/binding/maxcul/internal/messages/MaxCulMsgHandler.java
+++ b/bundles/binding/org.openhab.binding.maxcul/src/main/java/org/openhab/binding/maxcul/internal/messages/MaxCulMsgHandler.java
@@ -230,7 +230,7 @@
 	 */
 	public void sendPairPong(String dstAddr)
 	{
-		PairPongMsg pp = new PairPongMsg(getMessageCount(), (byte)0, MaxCulMsgType.PAIR_PONG, (byte) 0, this.srcAddr, dstAddr);
+		PairPongMsg pp = new PairPongMsg(getMessageCount(), (byte)0, (byte) 0, this.srcAddr, dstAddr);
 		sendMessage(pp);
 	}
 
