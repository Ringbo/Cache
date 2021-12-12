diff --git a/src/net/java/sip/communicator/impl/media/CallSessionImpl.java b/src/net/java/sip/communicator/impl/media/CallSessionImpl.java
index c748a49..2225e9c 100644
--- a/src/net/java/sip/communicator/impl/media/CallSessionImpl.java
+++ b/src/net/java/sip/communicator/impl/media/CallSessionImpl.java
@@ -493,7 +493,8 @@
      * @throws ParseException if sdpAnswerStr does not contain a valid sdp
      * String.
      */
-    public void processSdpAnswer(CallParticipant responder, String sdpAnswerStr)
+    public synchronized void processSdpAnswer(CallParticipant responder, 
+                                              String sdpAnswerStr)
         throws MediaException, ParseException
     {
         logger.trace("Parsing sdp answer: " + sdpAnswerStr);
@@ -1541,7 +1542,7 @@
      * @param evt the <tt>CallParticipantEvent</tt> containing the source call
      * and call participant.
      */
-    public void callParticipantAdded(CallParticipantEvent evt)
+    public synchronized void callParticipantAdded(CallParticipantEvent evt)
     {
         CallParticipant sourceParticipant = evt.getSourceCallParticipant();
         sourceParticipant.addCallParticipantListener(this);
@@ -1604,7 +1605,7 @@
      *
      * @param event the newly received SessionEvent
      */
-    public void update(SessionEvent event)
+    public synchronized void update(SessionEvent event)
     {
         if (event instanceof NewParticipantEvent)
         {
@@ -1633,7 +1634,7 @@
      *
      * @param event the newly received SendStreamEvent
      */
-    public void update(SendStreamEvent event)
+    public synchronized void update(SendStreamEvent event)
     {
         logger.debug(
             "received the following JMF SendStreamEvent - "
@@ -1647,7 +1648,7 @@
      *
      * @param evt the newly received ReceiveStreamEvent
      */
-    public void update(ReceiveStreamEvent evt)
+    public synchronized void update(ReceiveStreamEvent evt)
     {
         RTPManager mgr = (RTPManager) evt.getSource();
         Participant participant = evt.getParticipant(); // could be null.
@@ -1738,7 +1739,7 @@
      * <code>Controller</code> that this listener is registered with.
      * @param ce The event generated.
      */
-    public void controllerUpdate(ControllerEvent ce)
+    public synchronized void controllerUpdate(ControllerEvent ce)
     {
         logger.debug("Received a ControllerEvent: " + ce);
         Player player = (Player) ce.getSourceController();
