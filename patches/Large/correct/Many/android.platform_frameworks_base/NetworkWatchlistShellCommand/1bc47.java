diff --git a/services/core/java/com/android/server/net/watchlist/NetworkWatchlistShellCommand.java b/services/core/java/com/android/server/net/watchlist/NetworkWatchlistShellCommand.java
index 17c5868..766d8ca 100644
--- a/services/core/java/com/android/server/net/watchlist/NetworkWatchlistShellCommand.java
+++ b/services/core/java/com/android/server/net/watchlist/NetworkWatchlistShellCommand.java
@@ -91,7 +91,7 @@
         final long ident = Binder.clearCallingIdentity();
         try {
             // Reset last report time
-            if (!WatchlistConfig.getInstance().isConfigSecure()) {
+            if (WatchlistConfig.getInstance().isConfigSecure()) {
                 pw.println("Error: Cannot force generate report under production config");
                 return -1;
             }
