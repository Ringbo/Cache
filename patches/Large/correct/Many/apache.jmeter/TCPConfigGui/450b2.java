diff --git a/src/protocol/tcp/org/apache/jmeter/protocol/tcp/config/gui/TCPConfigGui.java b/src/protocol/tcp/org/apache/jmeter/protocol/tcp/config/gui/TCPConfigGui.java
index d9339e4..7fe1c14 100644
--- a/src/protocol/tcp/org/apache/jmeter/protocol/tcp/config/gui/TCPConfigGui.java
+++ b/src/protocol/tcp/org/apache/jmeter/protocol/tcp/config/gui/TCPConfigGui.java
@@ -95,7 +95,7 @@
         serverPanel.setConnectTimeout(element.getPropertyAsString(TCPSampler.TIMEOUT_CONNECT));
         setNoDelay.setTristateFromProperty(element, TCPSampler.NODELAY);
 //        setNoDelay.setSelected(element.getPropertyAsBoolean(TCPSampler.NODELAY));
-        requestData.setText(element.getPropertyAsString(TCPSampler.REQUEST));
+        requestData.setInitialText(element.getPropertyAsString(TCPSampler.REQUEST));
         requestData.setCaretPosition(0);
         closeConnection.setTristateFromProperty(element, TCPSampler.CLOSE_CONNECTION);
 //        closeConnection.setSelected(element.getPropertyAsBoolean(TCPSampler.CLOSE_CONNECTION, TCPSampler.CLOSE_CONNECTION_DEFAULT));
@@ -144,7 +144,7 @@
 
         serverPanel.clear();
         classname.setText(""); //$NON-NLS-1$
-        requestData.setText(""); //$NON-NLS-1$
+        requestData.setInitialText(""); //$NON-NLS-1$
         reUseConnection.setSelected(true);
         setNoDelay.setSelected(false); // TODO should this be indeterminate?
         closeConnection.setSelected(TCPSampler.CLOSE_CONNECTION_DEFAULT); // TODO should this be indeterminate?
