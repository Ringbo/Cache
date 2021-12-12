diff --git a/src/core/org/apache/jmeter/services/FileServer.java b/src/core/org/apache/jmeter/services/FileServer.java
index d9ba239..4609eaa 100644
--- a/src/core/org/apache/jmeter/services/FileServer.java
+++ b/src/core/org/apache/jmeter/services/FileServer.java
@@ -100,7 +100,7 @@
     /**
      * Resets the current base to {@link #DEFAULT_BASE}.
      */
-    public void resetBase() {
+    public synchronized void resetBase() {
         base = new File(DEFAULT_BASE);
         log.info("Reset base to'"+base+"'");
     }
