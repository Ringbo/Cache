diff --git a/main/src/com/google/refine/model/Recon.java b/main/src/com/google/refine/model/Recon.java
index fac984a..43dd7e0 100644
--- a/main/src/com/google/refine/model/Recon.java
+++ b/main/src/com/google/refine/model/Recon.java
@@ -253,7 +253,7 @@
         @Override
         public Object getField(String name, Properties bindings) {
             int index = s_featureMap.containsKey(name) ? s_featureMap.get(name) : -1;
-            return (index > 0 && index < features.length) ? features[index] : null;
+            return (index >= 0 && index < features.length) ? features[index] : null;
         }
 
         @Override
