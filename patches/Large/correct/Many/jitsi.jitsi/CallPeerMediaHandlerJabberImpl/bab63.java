diff --git a/src/net/java/sip/communicator/impl/protocol/jabber/CallPeerMediaHandlerJabberImpl.java b/src/net/java/sip/communicator/impl/protocol/jabber/CallPeerMediaHandlerJabberImpl.java
index 0afc0fc..8bd3c1d 100644
--- a/src/net/java/sip/communicator/impl/protocol/jabber/CallPeerMediaHandlerJabberImpl.java
+++ b/src/net/java/sip/communicator/impl/protocol/jabber/CallPeerMediaHandlerJabberImpl.java
@@ -288,14 +288,14 @@
              * Neither SDES nor ZRTP is supported in telephony conferences
              * utilizing the server-side technology Jitsi Videobridge yet.
              */
-            if (!call.getConference().isJitsiVideoBridge())
+            if (!call.getConference().isJitsiVideobridge())
             {
                 // SDES
                 // It is important to set SDES before ZRTP in order to make
                 // GTALK application able to work with SDES.
-                setSDesEncryptionToDescription(mediaType, description, null);
+                setSDesEncryptionOnDescription(mediaType, description, null);
                 // ZRTP
-                setZrtpEncryptionToDescription(mediaType, description, null);
+                setZrtpEncryptionOnDescription(mediaType, description, null);
             }
 
             return content;
@@ -374,8 +374,8 @@
         // Describe the media.
         List<ContentPacketExtension> mediaDescs
             = new ArrayList<ContentPacketExtension>();
-        boolean jitsiVideoBridge
-            = getPeer().getCall().getConference().isJitsiVideoBridge();
+        boolean jitsiVideobridge
+            = getPeer().getCall().getConference().isJitsiVideobridge();
 
         for (MediaType mediaType : MediaType.values())
         {
@@ -423,17 +423,17 @@
                      * conferences utilizing the server-side technology Jitsi
                      * Videobridge yet.
                      */
-                    if (!jitsiVideoBridge)
+                    if (!jitsiVideobridge)
                     {
                         // SDES
                         // It is important to set SDES before ZRTP in order to
                         // make GTALK application able to work with SDES.
-                        setSDesEncryptionToDescription(
+                        setSDesEncryptionOnDescription(
                                 mediaType,
                                 description,
                                 null);
                         //ZRTP
-                        setZrtpEncryptionToDescription(
+                        setZrtpEncryptionOnDescription(
                                 mediaType,
                                 description,
                                 null);
@@ -781,7 +781,7 @@
      * {@inheritDoc}
      *
      * In the case of a telephony conference organized by the local peer/user
-     * via the Jitsi VideoBridge server-side technology, returns an SSRC
+     * via the Jitsi Videobridge server-side technology, returns an SSRC
      * reported by the server as received on the channel allocated by the local
      * peer/user for the purposes of communicating with the <tt>CallPeer</tt>
      * associated with this instance.
@@ -796,7 +796,7 @@
          * multiple RTP streams at any time. In such a case, it is not clear
          * which one of their SSRCs is to be returned. Anyway, the super says
          * that the returned is the last known. We will presume that the last
-         * known in the list reported by the Jitsi VideoBridge server is the
+         * known in the list reported by the Jitsi Videobridge server is the
          * last.
          */
         for (int i = ssrcs.length - 1; i >= 0; i--)
@@ -808,12 +808,12 @@
         }
 
         /*
-         * XXX In the case of Jitsi VideoBridge, the super implementation of
+         * XXX In the case of Jitsi Videobridge, the super implementation of
          * getRemoteSSRC(MediaType) cannot be trusted because there is a single
          * VideoMediaStream with multiple ReceiveStreams.
          */
         return
-            getPeer().isJitsiVideoBridge()
+            getPeer().isJitsiVideobridge()
                 ? SSRC_UNKNOWN
                 : super.getRemoteSSRC(mediaType);
     }
@@ -823,7 +823,7 @@
      * be received by a <tt>MediaStream</tt> associated with this instance.
      * <p>
      * <b>Warning</b>: The method may return only one of the many possible
-     * remote SSRCs in the case of no utilization of the Jitsi VideoBridge
+     * remote SSRCs in the case of no utilization of the Jitsi Videobridge
      * server-side technology because the super implementation does not
      * currently provide support for keeping track of multiple remote SSRCs.
      * </p>
@@ -837,7 +837,7 @@
     public long[] getRemoteSSRCs(MediaType mediaType)
     {
         /*
-         * If the Jitsi VideoBridge server-side technology is utilized, a single
+         * If the Jitsi Videobridge server-side technology is utilized, a single
          * MediaStream (per MediaType) is shared among the participating
          * CallPeers and, consequently, the remote SSRCs cannot be associated
          * with the CallPeers from which they are actually being sent. That's
@@ -905,7 +905,7 @@
                     = protocolProvider.getDiscoveryManager();
                 DiscoverInfo peerDiscoverInfo = peer.getDiscoveryInfo();
 
-                boolean isJitsiVideoBridge = peer.isJitsiVideoBridge();
+                boolean isJitsiVideobridge = peer.isJitsiVideobridge();
 
                 // We use Google P2P transport if both conditions are satisfied:
                 // - both peers have Google P2P transport in their features;
@@ -920,7 +920,7 @@
 
                 // if we use jitsi videobridge, we have to use RAW-UDP (or
                 // possibly ICE, but not google P2P)
-                if (isJitsiVideoBridge)
+                if (isJitsiVideobridge)
                     google = false;
 
                 /*
@@ -990,14 +990,14 @@
 
                     /*
                      * If the local peer is a conference focus and there is a
-                     * Jitsi VideoBridge working on the server, prefer a
+                     * Jitsi Videobridge working on the server, prefer a
                      * transport which will route the conference through there.
                      */
-                    if (isJitsiVideoBridge)
+                    if (isJitsiVideobridge)
                     {
                         /*
                          * XXX If a telephony conference utilizing the Jitsi
-                         * VideoBridge server-side telephony conferencing
+                         * Videobridge server-side telephony conferencing
                          * technology is to work, its only chance of working
                          * is to use RAW UDP at the time of this writing.
                          */
@@ -1055,7 +1055,7 @@
     /**
      * {@inheritDoc}
      *
-     * In the case of utilization of the Jitsi VideoBridge server-side
+     * In the case of utilization of the Jitsi Videobridge server-side
      * technology, returns the visual <tt>Component</tt>s which display RTP
      * video streams reported by the server to be sent by the remote peer
      * represented by this instance.
@@ -1066,8 +1066,8 @@
         /*
          * TODO The super is currently unable to provide the complete set of
          * remote SSRCs (i.e. in the case of no utilization of the Jitsi
-         * VideoBridge server-side technology) so we have to explicitly check
-         * for Jitsi VideoBridge instead of just relying on the implementation
+         * Videobridge server-side technology) so we have to explicitly check
+         * for Jitsi Videobridge instead of just relying on the implementation
          * of the getRemoteSSRCs(MediaType) method to abstract away that detail.
          */
         CallJabberImpl call;
@@ -1075,7 +1075,7 @@
 
         if (((call = getPeer().getCall()) != null)
                 && ((conference = call.getConference()) != null)
-                && conference.isJitsiVideoBridge())
+                && conference.isJitsiVideobridge())
         {
             MediaStream stream = getStream(MediaType.VIDEO);
 
@@ -1242,7 +1242,7 @@
      * {@inheritDoc}
      *
      * In the case of a telephony conference organized by the local peer/user
-     * and utilizing the Jitsi VideoBridge server-side technology, a single
+     * and utilizing the Jitsi Videobridge server-side technology, a single
      * <tt>MediaHandler</tt> is shared by multiple
      * <tt>CallPeerMediaHandler</tt>s in order to have a single
      * <tt>AudioMediaStream</tt> and a single <tt>VideoMediaStream</tt>.
@@ -1259,7 +1259,7 @@
 
         if ((AUDIO_REMOTE_SSRC.equals(propertyName)
                     || VIDEO_REMOTE_SSRC.equals(propertyName))
-                && getPeer().isJitsiVideoBridge())
+                && getPeer().isJitsiVideobridge())
             return;
 
         super.mediaHandlerPropertyChange(ev);
@@ -1498,7 +1498,7 @@
          * Neither SDES nor ZRTP is supported in telephony conferences utilizing
          * the server-side technology Jitsi Videobridge yet.
          */
-        if ((conference == null) || !conference.isJitsiVideoBridge())
+        if ((conference == null) || !conference.isJitsiVideobridge())
         {
             addZrtpAdvertisedEncryptions(true, description, mediaType);
             addSDesAdvertisedEncryptions(true, description, mediaType);
@@ -1977,7 +1977,7 @@
             if (stream == null)
                 continue;
 
-            if (getPeer().isJitsiVideoBridge())
+            if (getPeer().isJitsiVideobridge())
             {
                 /*
                  * If we are the focus of a videobridge conference, we need to
@@ -2197,7 +2197,7 @@
     {
         ColibriConferenceIQ.Channel channel = null;
 
-        if (getPeer().isJitsiVideoBridge()
+        if (getPeer().isJitsiVideobridge()
                 && (transportManager instanceof RawUdpTransportManager))
         {
             channel
@@ -2232,7 +2232,7 @@
     {
         CallPeerJabberImpl peer = getPeer();
 
-        if (peer.isJitsiVideoBridge())
+        if (peer.isJitsiVideobridge())
         {
             this.locallyOnHold = locallyOnHold;
 
@@ -2280,7 +2280,7 @@
             ContentPacketExtension content,
             MediaType mediaType)
     {
-        if (getPeer().isJitsiVideoBridge())
+        if (getPeer().isJitsiVideobridge())
         {
             // TODO Auto-generated method stub
             return false;
@@ -2493,7 +2493,7 @@
         CallPeerJabberImpl peer = getPeer();
         boolean b = false;
 
-        if (peer.isJitsiVideoBridge())
+        if (peer.isJitsiVideobridge())
         {
             b
                 = setDtlsEncryptionToTransport(
@@ -2599,7 +2599,7 @@
 
         CallPeerJabberImpl peer = getPeer();
 
-        if (peer.isJitsiVideoBridge())
+        if (peer.isJitsiVideobridge())
         {
             ProtocolProviderServiceJabberImpl protocolProvider
                 = peer.getProtocolProvider();
