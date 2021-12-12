diff --git a/src/net/java/sip/communicator/impl/neomedia/device/AbstractMediaDevice.java b/src/net/java/sip/communicator/impl/neomedia/device/AbstractMediaDevice.java
index bb6025d..66420c4 100644
--- a/src/net/java/sip/communicator/impl/neomedia/device/AbstractMediaDevice.java
+++ b/src/net/java/sip/communicator/impl/neomedia/device/AbstractMediaDevice.java
@@ -63,19 +63,19 @@
      * the use of this <tt>MediaDevice</tt> by a <tt>MediaStream</tt> and the
      * rendering part of a previous <tt>MediaDeviceSession</tt>.
      *
-     * @param session previous <tt>MediaDeviceSession</tt>
+     * @param oldSession previous <tt>MediaDeviceSession</tt>
      * @return a new <tt>MediaDeviceSession</tt> instance which is to represent
      * the use of this <tt>MediaDevice</tt> by a <tt>MediaStream</tt>
      */
-    public MediaDeviceSession createSession(MediaDeviceSession session)
+    public MediaDeviceSession createSession(MediaDeviceSession oldSession)
     {
         switch (getMediaType())
         {
         case VIDEO:
-            session = new VideoMediaDeviceSession(this, session);
+            session = new VideoMediaDeviceSession(this, oldSession);
             return session;
         default:
-            session = new AudioMediaDeviceSession(this, session);
+            session = new AudioMediaDeviceSession(this, oldSession);
             return session;
         }
     }
