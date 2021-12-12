diff --git a/ql/src/java/org/apache/hadoop/hive/ql/udf/UDFRegExp.java b/ql/src/java/org/apache/hadoop/hive/ql/udf/UDFRegExp.java
index 38360f5..516e477 100755
--- a/ql/src/java/org/apache/hadoop/hive/ql/udf/UDFRegExp.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/udf/UDFRegExp.java
@@ -38,7 +38,7 @@
     if (s == null || regex == null) {
       return null;
     }
-    if (!regex.equals(lastRegex)) {
+    if (!regex.equals(lastRegex) || p == null) {
       lastRegex.set(regex);
       p = Pattern.compile(regex.toString());
     }
