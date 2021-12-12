diff --git a/core/src/main/java/com/google/bitcoin/kits/WalletAppKit.java b/core/src/main/java/com/google/bitcoin/kits/WalletAppKit.java
index ef62416..6264997 100644
--- a/core/src/main/java/com/google/bitcoin/kits/WalletAppKit.java
+++ b/core/src/main/java/com/google/bitcoin/kits/WalletAppKit.java
@@ -221,7 +221,7 @@
             FileLock lock = file2.getChannel().tryLock();
             if (lock == null)
                 return true;
-            lock.close();
+            lock.release();
             return false;
         } finally {
             if (file2 != null)
