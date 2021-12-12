diff --git a/src/be/ibridge/kettle/core/Row.java b/src/be/ibridge/kettle/core/Row.java
index e3b7bfe..55aa149 100644
--- a/src/be/ibridge/kettle/core/Row.java
+++ b/src/be/ibridge/kettle/core/Row.java
@@ -111,7 +111,7 @@
      */
     public void addValue(int idx, Value v)
     {
-        list.add(v);
+        list.add(idx, v);
     }
     
     /**
