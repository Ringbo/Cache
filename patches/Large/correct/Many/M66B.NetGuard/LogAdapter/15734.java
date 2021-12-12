diff --git a/app/src/main/java/eu/faircode/netguard/LogAdapter.java b/app/src/main/java/eu/faircode/netguard/LogAdapter.java
index f84e14d..d82b5e2 100644
--- a/app/src/main/java/eu/faircode/netguard/LogAdapter.java
+++ b/app/src/main/java/eu/faircode/netguard/LogAdapter.java
@@ -100,7 +100,7 @@
         else
             tvProtocol.setText(protocol < 0 ? "" : Integer.toString(protocol));
 
-        tvPort.setText(port <= 0 ? "" : Integer.toString(port));
+        tvPort.setText(port < 0 ? "" : Integer.toString(port));
         tvFlags.setText(flags);
 
         // Application icon
