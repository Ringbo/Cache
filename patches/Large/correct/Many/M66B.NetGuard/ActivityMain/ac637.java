diff --git a/app/src/main/java/eu/faircode/netguard/ActivityMain.java b/app/src/main/java/eu/faircode/netguard/ActivityMain.java
index 21f14bb..e920145 100644
--- a/app/src/main/java/eu/faircode/netguard/ActivityMain.java
+++ b/app/src/main/java/eu/faircode/netguard/ActivityMain.java
@@ -111,7 +111,7 @@
                     try {
                         final Intent prepare = VpnService.prepare(ActivityMain.this);
                         if (prepare == null) {
-                            Log.e(TAG, "Prepare done");
+                            Log.i(TAG, "Prepare done");
                             onActivityResult(REQUEST_VPN, RESULT_OK, null);
                         } else {
                             // Show dialog
