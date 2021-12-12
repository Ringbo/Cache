diff --git a/ql/src/java/org/apache/hadoop/hive/ql/io/sarg/SearchArgumentImpl.java b/ql/src/java/org/apache/hadoop/hive/ql/io/sarg/SearchArgumentImpl.java
index d61af63..a451bfb 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/io/sarg/SearchArgumentImpl.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/io/sarg/SearchArgumentImpl.java
@@ -128,7 +128,7 @@
         case ORC:
           // adapt base type to what orc needs
           if (literal instanceof Integer) {
-            return Long.valueOf(literal.toString());
+            return ((Number) literal).longValue();
           }
           return literal;
         case PARQUET:
@@ -157,9 +157,9 @@
           Integer)) {
         return literalList;
       }
-      List<Object> result = new ArrayList<Object>();
+      List<Object> result = new ArrayList<Object>(literalList.size());
       for (Object o : literalList) {
-        result.add(Long.valueOf(o.toString()));
+        result.add(((Number) o).longValue());
       }
       return result;
     }
@@ -1114,7 +1114,7 @@
       } else if (literal instanceof Byte ||
           literal instanceof Short ||
           literal instanceof Integer) {
-        return Long.valueOf(literal.toString());
+        return ((Number) literal).longValue();
       } else if (literal instanceof Float) {
         // to avoid change in precision when upcasting float to double
         // we convert the literal to string and parse it as double. (HIVE-8460)
