diff --git a/java/org/apache/catalina/tribes/transport/bio/util/FastQueue.java b/java/org/apache/catalina/tribes/transport/bio/util/FastQueue.java
index 2e70001..9b41154 100644
--- a/java/org/apache/catalina/tribes/transport/bio/util/FastQueue.java
+++ b/java/org/apache/catalina/tribes/transport/bio/util/FastQueue.java
@@ -87,7 +87,7 @@
     /**
      * enabled the queue
      */
-    private boolean enabled = true;
+    private volatile boolean enabled = true;
 
     /**
      *  max queue size
@@ -158,7 +158,7 @@
 
     public void setEnabled(boolean enable) {
         enabled = enable;
-        if (!enabled) {
+        if (!enable) {
             lock.abortRemove();
             last = first = null;
         }
