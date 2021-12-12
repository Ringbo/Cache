diff --git a/ql/src/java/org/apache/hadoop/hive/ql/udf/UDFRegExpReplace.java b/ql/src/java/org/apache/hadoop/hive/ql/udf/UDFRegExpReplace.java
index e4ddab1..361f1cb 100755
--- a/ql/src/java/org/apache/hadoop/hive/ql/udf/UDFRegExpReplace.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/udf/UDFRegExpReplace.java
@@ -30,7 +30,7 @@
   private Pattern p = null;
   
   private Text lastReplacement = new Text();
-  private String replacementString = null; 
+  private String replacementString = ""; 
 
   Text result = new Text();
   public UDFRegExpReplace() {
@@ -41,7 +41,7 @@
       return null;
     }
     // If the regex is changed, make sure we compile the regex again.
-    if (!regex.equals(lastRegex)) {
+    if (!regex.equals(lastRegex) || p == null) {
       lastRegex.set(regex);
       p = Pattern.compile(regex.toString());
     }
