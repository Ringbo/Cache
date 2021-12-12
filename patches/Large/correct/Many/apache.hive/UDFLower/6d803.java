diff --git a/ql/src/java/org/apache/hadoop/hive/ql/udf/UDFLower.java b/ql/src/java/org/apache/hadoop/hive/ql/udf/UDFLower.java
index 36b0889..7443cc8 100755
--- a/ql/src/java/org/apache/hadoop/hive/ql/udf/UDFLower.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/udf/UDFLower.java
@@ -34,7 +34,7 @@
     if (s == null) {
       return null;
     }
-    t.set(s.toString().toUpperCase());
+    t.set(s.toString().toLowerCase());
     return t;
   }
 
