diff --git a/app/src/main/java/eu/faircode/netguard/SinkholeService.java b/app/src/main/java/eu/faircode/netguard/SinkholeService.java
index 39e6675..8b7d406 100644
--- a/app/src/main/java/eu/faircode/netguard/SinkholeService.java
+++ b/app/src/main/java/eu/faircode/netguard/SinkholeService.java
@@ -995,7 +995,7 @@
         String vpn6 = prefs.getString("vpn6", "fd00:1:fd00:1:fd00:1:fd00:1");
         Log.i(TAG, "vpn4=" + vpn4 + " vpn6=" + vpn6);
         builder.addAddress(vpn4, 32);
-        builder.addAddress(vpn6, 64);
+        builder.addAddress(vpn6, 128);
 
         if (filter)
             for (InetAddress dns : getDns(SinkholeService.this)) {
