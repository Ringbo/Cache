diff --git a/src/net/java/sip/communicator/impl/neomedia/portaudio/streams/MasterPortAudioStream.java b/src/net/java/sip/communicator/impl/neomedia/portaudio/streams/MasterPortAudioStream.java
index 49f3950..1996798 100644
--- a/src/net/java/sip/communicator/impl/neomedia/portaudio/streams/MasterPortAudioStream.java
+++ b/src/net/java/sip/communicator/impl/neomedia/portaudio/streams/MasterPortAudioStream.java
@@ -226,7 +226,7 @@
             synchronized(readSync)
             {
                 readActive = false;
-                readSync.notify();
+                readSync.notifyAll();
             }
         }
         return true;
@@ -318,9 +318,16 @@
             {
                 while (readActive) 
                 {
+                    /*
+                     * Use a timed wait here - in some (not yet known) cases
+                     * synchronized/notifyAll (see read() above) do not wakeup
+                     * the wait. Thus wait fo 100ms which is enough to check
+                     * again (we use 20ms read intervalls). 
+                     * TODO: check an clarify this problem - it's a workaround 
+                     */
                     try
                     {
-                        readSync.wait();
+                        readSync.wait(100);
                     }
                     catch (InterruptedException e)
                     {
