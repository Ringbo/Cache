diff --git a/src/com/facebook/buck/rules/ArtifactCacheConnectEvent.java b/src/com/facebook/buck/rules/ArtifactCacheConnectEvent.java
index 808d60e..1618496 100644
--- a/src/com/facebook/buck/rules/ArtifactCacheConnectEvent.java
+++ b/src/com/facebook/buck/rules/ArtifactCacheConnectEvent.java
@@ -38,7 +38,7 @@
 
   @Override
   public boolean eventsArePair(BuckEvent event) {
-    if (!(event instanceof ArtifactCacheEvent)) {
+    if (!(event instanceof ArtifactCacheConnectEvent)) {
       return false;
     }
     return true;
