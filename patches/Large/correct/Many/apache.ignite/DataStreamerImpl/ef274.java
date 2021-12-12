diff --git a/modules/core/src/main/java/org/apache/ignite/internal/processors/datastreamer/DataStreamerImpl.java b/modules/core/src/main/java/org/apache/ignite/internal/processors/datastreamer/DataStreamerImpl.java
index 1df8d57..4a893f4 100644
--- a/modules/core/src/main/java/org/apache/ignite/internal/processors/datastreamer/DataStreamerImpl.java
+++ b/modules/core/src/main/java/org/apache/ignite/internal/processors/datastreamer/DataStreamerImpl.java
@@ -571,7 +571,7 @@
             activeFuts.add(resFut);
 
             Collection<KeyCacheObjectWrapper> keys =
-                new GridConcurrentHashSet<>(entries.size(), U.capacity(entries.size()), 1);
+                new GridConcurrentHashSet<>(entries.size());
 
             Collection<DataStreamerEntry> entries0 = new ArrayList<>(entries.size());
 
@@ -630,7 +630,7 @@
             Collection<KeyCacheObjectWrapper> keys = null;
 
             if (entries.size() > 1) {
-                keys = new GridConcurrentHashSet<>(entries.size(), U.capacity(entries.size()), 1);
+                keys = new GridConcurrentHashSet<>(entries.size());
 
                 for (DataStreamerEntry entry : entries)
                     keys.add(new KeyCacheObjectWrapper(entry.getKey()));
