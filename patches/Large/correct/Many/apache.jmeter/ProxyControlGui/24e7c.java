diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/proxy/gui/ProxyControlGui.java b/src/protocol/http/org/apache/jmeter/protocol/http/proxy/gui/ProxyControlGui.java
index 3cf5c00..bc3d64b 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/proxy/gui/ProxyControlGui.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/proxy/gui/ProxyControlGui.java
@@ -1031,7 +1031,7 @@
                 .getResString("notify_child_listeners_fr"))); // $NON-NLS-1$
         
         notifyChildSamplerListenerOfFilteredSamplersCB = new JCheckBox(JMeterUtils.getResString("notify_child_listeners_fr")); // $NON-NLS-1$
-        notifyChildSamplerListenerOfFilteredSamplersCB.setSelected(true);
+        notifyChildSamplerListenerOfFilteredSamplersCB.setSelected(false);
         notifyChildSamplerListenerOfFilteredSamplersCB.addActionListener(this);
         notifyChildSamplerListenerOfFilteredSamplersCB.setActionCommand(ENABLE_RESTART);
 
