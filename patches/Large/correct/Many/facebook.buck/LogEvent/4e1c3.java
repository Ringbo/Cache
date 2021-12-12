diff --git a/src/com/facebook/buck/event/LogEvent.java b/src/com/facebook/buck/event/LogEvent.java
index 77fe6c5..0156a18 100644
--- a/src/com/facebook/buck/event/LogEvent.java
+++ b/src/com/facebook/buck/event/LogEvent.java
@@ -76,7 +76,7 @@
 
   @Override
   public boolean eventsArePair(BuckEvent event) {
-    if (!(event instanceof BuckEvent)) {
+    if (!(event instanceof LogEvent)) {
       return false;
     }
 
