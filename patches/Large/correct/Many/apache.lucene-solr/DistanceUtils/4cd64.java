diff --git a/src/java/org/apache/solr/search/function/distance/DistanceUtils.java b/src/java/org/apache/solr/search/function/distance/DistanceUtils.java
index 52f67d3..a57744b 100644
--- a/src/java/org/apache/solr/search/function/distance/DistanceUtils.java
+++ b/src/java/org/apache/solr/search/function/distance/DistanceUtils.java
@@ -140,7 +140,7 @@
         while (start < end && externalVal.charAt(start) == ' ') start++;
         while (end > start && externalVal.charAt(end - 1) == ' ') end--;
         out[i] = externalVal.substring(start, end);
-        start = idx + 1;
+        start = end + 1;
         end = externalVal.indexOf(',', start);
         if (end == -1) {
           end = externalVal.length();
@@ -180,7 +180,7 @@
         while (start < end && externalVal.charAt(start) == ' ') start++;
         while (end > start && externalVal.charAt(end - 1) == ' ') end--;
         out[i] = Double.parseDouble(externalVal.substring(start, end));
-        start = idx + 1;
+        start = end + 1;
         end = externalVal.indexOf(',', start);
         if (end == -1) {
           end = externalVal.length();
