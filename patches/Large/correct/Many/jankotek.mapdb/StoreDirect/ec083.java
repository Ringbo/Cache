diff --git a/src/main/java/org/mapdb/StoreDirect.java b/src/main/java/org/mapdb/StoreDirect.java
index 4ad735c..73f99d5 100644
--- a/src/main/java/org/mapdb/StoreDirect.java
+++ b/src/main/java/org/mapdb/StoreDirect.java
@@ -225,7 +225,7 @@
                     index = null;
                 }
                 if(phys!=null){
-                    index.sync();
+                    phys.sync();
                     phys.close();
                     phys = null;
                 }
