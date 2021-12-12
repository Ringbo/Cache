diff --git a/src/uid/UniqueId.java b/src/uid/UniqueId.java
index 370f9ad..ee66c7a 100644
--- a/src/uid/UniqueId.java
+++ b/src/uid/UniqueId.java
@@ -720,7 +720,7 @@
             + " in cache, but just scanned id=" + Arrays.toString(id));
         }
         suggestions.add(name);
-        if ((short) suggestions.size() > max_results) {  // We have enough.
+        if ((short) suggestions.size() >= max_results) {  // We have enough.
           return suggestions;
         }
         row.clear();  // free()
