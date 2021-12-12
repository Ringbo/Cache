diff --git a/ql/src/java/org/apache/hadoop/hive/ql/udf/UDFRegExpExtract.java b/ql/src/java/org/apache/hadoop/hive/ql/udf/UDFRegExpExtract.java
index 8bdf8be..cec996d 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/udf/UDFRegExpExtract.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/udf/UDFRegExpExtract.java
@@ -43,7 +43,7 @@
     if (s == null || regex == null) {
       return null;
     }
-    if (!regex.equals(lastRegex)) {
+    if (!regex.equals(lastRegex) || p == null) {
       lastRegex = regex;
       p = Pattern.compile(regex);
     }
