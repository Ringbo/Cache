diff --git a/src/org/traccar/smpp/EnquireLinkTask.java b/src/org/traccar/smpp/EnquireLinkTask.java
index 9a3121e..affb712 100644
--- a/src/org/traccar/smpp/EnquireLinkTask.java
+++ b/src/org/traccar/smpp/EnquireLinkTask.java
@@ -44,7 +44,7 @@
             } catch (SmppTimeoutException | SmppChannelException
                     | RecoverablePduException | UnrecoverablePduException error) {
                 Log.warning("Enquire link failed, executing reconnect: ", error);
-                smppClient.reconnect();
+                smppClient.scheduleReconnect();
             } catch (InterruptedException error) {
                 Log.info("Enquire link interrupted, probably killed by reconnecting");
             }
