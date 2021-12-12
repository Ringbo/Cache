diff --git a/src/net/java/sip/communicator/plugin/globalproxyconfig/GlobalProxyConfigForm.java b/src/net/java/sip/communicator/plugin/globalproxyconfig/GlobalProxyConfigForm.java
index ba1160e..dbd1ba3 100644
--- a/src/net/java/sip/communicator/plugin/globalproxyconfig/GlobalProxyConfigForm.java
+++ b/src/net/java/sip/communicator/plugin/globalproxyconfig/GlobalProxyConfigForm.java
@@ -58,7 +58,7 @@
     /**
      * The dns forward global checkbox, hides/shows the panel with values.
      */
-    private JCheckBox dnsForwardCheck = new JCheckBox();
+    private JCheckBox dnsForwardCheck = new SIPCommCheckBox();
 
     /**
      * Dns server address initially filled with the value of the proxy.
@@ -165,7 +165,7 @@
         constraints.gridy = 6;
         constraints.gridwidth = 4;
         constraints.gridheight = 2;
-        constraints.insets = new Insets(20,20,20,20);
+        constraints.insets = new Insets(0, 20, 0, 20);
         JEditorPane table = new JEditorPane();
         table.setContentType("text/html");
         table.setEditable(false);
