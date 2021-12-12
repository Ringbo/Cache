diff --git a/src/net/java/sip/communicator/impl/dns/DnsUtilActivator.java b/src/net/java/sip/communicator/impl/dns/DnsUtilActivator.java
index 74e9ed5..4a89cb5 100644
--- a/src/net/java/sip/communicator/impl/dns/DnsUtilActivator.java
+++ b/src/net/java/sip/communicator/impl/dns/DnsUtilActivator.java
@@ -235,7 +235,7 @@
             StringBuilder sb = new StringBuilder();
             sb.append("Reloading resolver config, default DNS servers are: ");
             ResolverConfig config = ResolverConfig.getCurrentConfig();
-            if (config != null)
+            if (config != null && config.servers() != null)
             {
                 for(String s : config.servers())
                 {
