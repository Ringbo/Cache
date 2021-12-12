diff --git a/src/java/org/apache/solr/core/CoreContainer.java b/src/java/org/apache/solr/core/CoreContainer.java
index b729f12..f5e6cd7 100644
--- a/src/java/org/apache/solr/core/CoreContainer.java
+++ b/src/java/org/apache/solr/core/CoreContainer.java
@@ -202,7 +202,7 @@
 
           for (int a=1; a<aliases.size(); a++) {
             core.open();
-            register(aliases.get(i), core, false);
+            register(aliases.get(a), core, false);
           }
 
           register(name, core, false);
