diff --git a/src/main/java/org/elasticsearch/alerts/AlertsStore.java b/src/main/java/org/elasticsearch/alerts/AlertsStore.java
index 5afba72..5b1243d 100644
--- a/src/main/java/org/elasticsearch/alerts/AlertsStore.java
+++ b/src/main/java/org/elasticsearch/alerts/AlertsStore.java
@@ -179,7 +179,7 @@
     }
 
     public void stop() {
-        if (started.compareAndSet(false, true)) {
+        if (started.compareAndSet(true, false)) {
             clear();
             logger.info("Stopped alert store");
         }
