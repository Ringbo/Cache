diff --git a/services/core/java/com/android/server/NetworkManagementService.java b/services/core/java/com/android/server/NetworkManagementService.java
index 9fc17a2..d73b06b 100644
--- a/services/core/java/com/android/server/NetworkManagementService.java
+++ b/services/core/java/com/android/server/NetworkManagementService.java
@@ -2048,13 +2048,13 @@
         }
     }
 
-    private void closeSocketsForFirewallChain(int chain, String chainName) {
+    private void closeSocketsForFirewallChainLocked(int chain, String chainName) {
         // UID ranges to close sockets on.
         UidRange[] ranges;
         // UID ranges whose sockets we won't touch.
         int[] exemptUids;
 
-        SparseIntArray rules = getUidFirewallRules(chain);
+        final SparseIntArray rules = getUidFirewallRules(chain);
         int numUids = 0;
 
         if (getFirewallType(chain) == FIREWALL_TYPE_WHITELIST) {
@@ -2119,7 +2119,7 @@
             mFirewallChainStates.put(chain, enable);
 
             final String operation = enable ? "enable_chain" : "disable_chain";
-            String chainName;
+            final String chainName;
             switch(chain) {
                 case FIREWALL_CHAIN_STANDBY:
                     chainName = FIREWALL_CHAIN_NAME_STANDBY;
@@ -2146,7 +2146,7 @@
             // whitelist and blacklist chains allow RSTs through.
             if (enable) {
                 if (DBG) Slog.d(TAG, "Closing sockets after enabling chain " + chainName);
-                closeSocketsForFirewallChain(chain, chainName);
+                closeSocketsForFirewallChainLocked(chain, chainName);
             }
         }
     }
