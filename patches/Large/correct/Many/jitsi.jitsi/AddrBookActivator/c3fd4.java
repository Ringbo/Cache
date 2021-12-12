diff --git a/src/net/java/sip/communicator/plugin/addrbook/AddrBookActivator.java b/src/net/java/sip/communicator/plugin/addrbook/AddrBookActivator.java
index 28a9fe5..b25985e 100644
--- a/src/net/java/sip/communicator/plugin/addrbook/AddrBookActivator.java
+++ b/src/net/java/sip/communicator/plugin/addrbook/AddrBookActivator.java
@@ -338,7 +338,7 @@
             css
                 = (ContactSourceService)
                     Class.forName(cssClassName).newInstance();
-            if(css.equals("net.java.sip.communicator.plugin.addrbook"
+            if(cssClassName.equals("net.java.sip.communicator.plugin.addrbook"
                     + ".msoutlook.MsOutlookAddrBookContactSourceService"))
             {
                 MsOutlookAddrBookContactSourceService contactSource
