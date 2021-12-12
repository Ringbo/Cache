diff --git a/src/net/java/sip/communicator/util/swing/SIPCommDialog.java b/src/net/java/sip/communicator/util/swing/SIPCommDialog.java
index 6227ef2..14ae5f7 100644
--- a/src/net/java/sip/communicator/util/swing/SIPCommDialog.java
+++ b/src/net/java/sip/communicator/util/swing/SIPCommDialog.java
@@ -205,7 +205,7 @@
         {
             SIPCommFrame.saveSizeAndLocation(this);
         }
-        catch (ConfigPropertyVetoExceoption e1)
+        catch (ConfigPropertyVetoException e1)
         {
             logger.error("The proposed property change "
                     + "represents an unacceptable value");
