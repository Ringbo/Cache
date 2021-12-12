diff --git a/core-cube/src/main/java/org/apache/kylin/gridtable/GTInfo.java b/core-cube/src/main/java/org/apache/kylin/gridtable/GTInfo.java
index dc96c7f..85b45cf 100644
--- a/core-cube/src/main/java/org/apache/kylin/gridtable/GTInfo.java
+++ b/core-cube/src/main/java/org/apache/kylin/gridtable/GTInfo.java
@@ -149,7 +149,7 @@
         if (codeSystem == null)
             throw new IllegalStateException();
 
-        if (primaryKey == null && primaryKey.cardinality() == 0)
+        if (primaryKey == null || primaryKey.cardinality() == 0)
             throw new IllegalStateException();
 
         codeSystem.init(this);
