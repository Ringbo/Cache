diff --git a/src/main/java/org/mapdb/TxMaker.java b/src/main/java/org/mapdb/TxMaker.java
index 83a8a65..655d665 100644
--- a/src/main/java/org/mapdb/TxMaker.java
+++ b/src/main/java/org/mapdb/TxMaker.java
@@ -171,7 +171,7 @@
 
         @Override
         public void close() {
-            if(modItems==null) return; //already closed
+            if(modItems==null || engine == null) return; //already closed
             rollback();
         }
     }
