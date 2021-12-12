diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/gui/CacheManagerGui.java b/src/protocol/http/org/apache/jmeter/protocol/http/gui/CacheManagerGui.java
index ae90277..fac7bf9 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/gui/CacheManagerGui.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/gui/CacheManagerGui.java
@@ -104,7 +104,7 @@
     public void clearGui() {
         super.clearGui();
         clearEachIteration.setSelected(false);
-        useExpires.setSelected(false);
+        useExpires.setSelected(true);
         maxCacheSize.setText(""); //$NON-NLS-1$
     }
 
