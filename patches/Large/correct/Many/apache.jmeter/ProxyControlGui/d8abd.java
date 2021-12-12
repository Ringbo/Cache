diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/proxy/gui/ProxyControlGui.java b/src/protocol/http/org/apache/jmeter/protocol/http/proxy/gui/ProxyControlGui.java
index 2b4a6e2..c804a4b 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/proxy/gui/ProxyControlGui.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/proxy/gui/ProxyControlGui.java
@@ -467,7 +467,7 @@
         JPanel buttonPanel = new JPanel();
 
         JButton addButton = new JButton(JMeterUtils.getResString("add"));
-        addButton.setActionCommand(ADD_INCLUDE);
+        addButton.setActionCommand(addCommand);
         addButton.addActionListener(this);
         buttonPanel.add(addButton);
 
