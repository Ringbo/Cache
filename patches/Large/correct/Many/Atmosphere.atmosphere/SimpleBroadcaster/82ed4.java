diff --git a/modules/cpr/src/main/java/org/atmosphere/util/SimpleBroadcaster.java b/modules/cpr/src/main/java/org/atmosphere/util/SimpleBroadcaster.java
index 5ba8531..2331890 100755
--- a/modules/cpr/src/main/java/org/atmosphere/util/SimpleBroadcaster.java
+++ b/modules/cpr/src/main/java/org/atmosphere/util/SimpleBroadcaster.java
@@ -190,7 +190,7 @@
     @Override
     protected void queueWriteIO(AtmosphereResource r, Object finalMsg, Entry entry) throws InterruptedException {
         synchronized (r) {
-            executeAsyncWrite(new AsyncWriteToken(r, finalMsg, entry.future, entry.originalMessage));
+            executeAsyncWrite(new AsyncWriteToken(r, finalMsg, entry.future, entry.originalMessage, entry.cache));
         }
     }
 }
\ No newline at end of file
