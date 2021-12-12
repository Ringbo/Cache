diff --git a/src/com/google/bitcoin/core/Wallet.java b/src/com/google/bitcoin/core/Wallet.java
index 3fd988d..dcc7537 100644
--- a/src/com/google/bitcoin/core/Wallet.java
+++ b/src/com/google/bitcoin/core/Wallet.java
@@ -200,7 +200,7 @@
         // Pending and inactive can overlap, so merge them before counting
         HashSet<Transaction> pendingInactive = new HashSet<Transaction>();
         pendingInactive.addAll(pending.values());
-        pendingInactive.retainAll(inactive.values());
+        pendingInactive.addAll(inactive.values());
         
         return getTransactions(true, true).size() ==
                unspent.size() + spent.size() + pendingInactive.size() + dead.size();
