diff --git a/core-metadata/src/main/java/org/apache/kylin/metadata/filter/TimeConditionLiteralsReplacer.java b/core-metadata/src/main/java/org/apache/kylin/metadata/filter/TimeConditionLiteralsReplacer.java
index e4b5ba3..0301d36 100644
--- a/core-metadata/src/main/java/org/apache/kylin/metadata/filter/TimeConditionLiteralsReplacer.java
+++ b/core-metadata/src/main/java/org/apache/kylin/metadata/filter/TimeConditionLiteralsReplacer.java
@@ -82,7 +82,7 @@
             return dateStr;
         }
 
-        long millis = Long.valueOf(dateStr);
+        long millis = Long.parseLong(dateStr);
         if (dataType.isTimestamp()) {
             return DateFormat.formatToTimeStr(millis);
         } else if (dataType.isDate()) {
