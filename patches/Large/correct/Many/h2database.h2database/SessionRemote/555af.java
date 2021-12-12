diff --git a/h2/src/main/org/h2/engine/SessionRemote.java b/h2/src/main/org/h2/engine/SessionRemote.java
index 918dc7e..4d1a9c6 100644
--- a/h2/src/main/org/h2/engine/SessionRemote.java
+++ b/h2/src/main/org/h2/engine/SessionRemote.java
@@ -477,7 +477,7 @@
      * @param count the retry count index
      */
     public void removeServer(IOException e, int i, int count) {
-        trace.debug(e, "removing server because of exception");
+        trace.error(e, "removing server because of exception");
         transferList.remove(i);
         if (transferList.size() == 0 && autoReconnect(count)) {
             return;
