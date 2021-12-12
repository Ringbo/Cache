diff --git a/src/net/java/sip/communicator/impl/gui/main/chat/ChatConversationPanel.java b/src/net/java/sip/communicator/impl/gui/main/chat/ChatConversationPanel.java
index f0d0ad4..9249b24 100755
--- a/src/net/java/sip/communicator/impl/gui/main/chat/ChatConversationPanel.java
+++ b/src/net/java/sip/communicator/impl/gui/main/chat/ChatConversationPanel.java
@@ -1324,7 +1324,7 @@
      */
     public static String getDateString(long date)
     {
-        if (GuiUtils.compareDates(date, System.currentTimeMillis()) < 0)
+        if (GuiUtils.compareDatesOnly(date, System.currentTimeMillis()) < 0)
         {
             StringBuffer dateStrBuf = new StringBuffer();
 
