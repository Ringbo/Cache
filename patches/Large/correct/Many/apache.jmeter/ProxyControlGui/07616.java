diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/proxy/gui/ProxyControlGui.java b/src/protocol/http/org/apache/jmeter/protocol/http/proxy/gui/ProxyControlGui.java
index cb6e006..3b160d0 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/proxy/gui/ProxyControlGui.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/proxy/gui/ProxyControlGui.java
@@ -843,7 +843,7 @@
                 .getResString("notify_child_listeners_fr"))); // $NON-NLS-1$
         
         notifyChildSamplerListenerOfFilteredSamplersCB = new JCheckBox(JMeterUtils.getResString("notify_child_listeners_fr")); // $NON-NLS-1$
-        notifyChildSamplerListenerOfFilteredSamplersCB.setSelected(false);
+        notifyChildSamplerListenerOfFilteredSamplersCB.setSelected(true);
         notifyChildSamplerListenerOfFilteredSamplersCB.addActionListener(this);
         notifyChildSamplerListenerOfFilteredSamplersCB.setActionCommand(ENABLE_RESTART);
 
