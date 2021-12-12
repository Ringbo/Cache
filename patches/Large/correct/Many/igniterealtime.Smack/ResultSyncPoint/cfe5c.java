diff --git a/smack-integration-test/src/main/java/org/igniterealtime/smack/inttest/util/ResultSyncPoint.java b/smack-integration-test/src/main/java/org/igniterealtime/smack/inttest/util/ResultSyncPoint.java
index 475f7f0..71c9077 100644
--- a/smack-integration-test/src/main/java/org/igniterealtime/smack/inttest/util/ResultSyncPoint.java
+++ b/smack-integration-test/src/main/java/org/igniterealtime/smack/inttest/util/ResultSyncPoint.java
@@ -36,7 +36,7 @@
             final long deadline = System.currentTimeMillis() + timeout;
             while (result == null && exception == null) {
                 final long now = System.currentTimeMillis();
-                if (now > deadline) break;
+                if (now >= deadline) break;
                 wait(deadline - now);
             }
         }
