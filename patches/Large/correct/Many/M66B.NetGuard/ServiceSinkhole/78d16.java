diff --git a/app/src/main/java/eu/faircode/netguard/ServiceSinkhole.java b/app/src/main/java/eu/faircode/netguard/ServiceSinkhole.java
index 3a28aba..812c77a 100644
--- a/app/src/main/java/eu/faircode/netguard/ServiceSinkhole.java
+++ b/app/src/main/java/eu/faircode/netguard/ServiceSinkhole.java
@@ -1105,7 +1105,7 @@
         // Remove local DNS servers when not routing LAN
         boolean lan = prefs.getBoolean("lan", false);
         boolean use_hosts = prefs.getBoolean("filter", false) && prefs.getBoolean("use_hosts", false);
-        if (lan && use_hosts) {
+        if (!lan && use_hosts) {
             List<InetAddress> listLocal = new ArrayList<>();
             try {
                 Enumeration<NetworkInterface> nis = NetworkInterface.getNetworkInterfaces();
