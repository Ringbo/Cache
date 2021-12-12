diff --git a/nar-bundles/standard-bundle/standard-processors/src/main/java/org/apache/nifi/processors/standard/SplitXml.java b/nar-bundles/standard-bundle/standard-processors/src/main/java/org/apache/nifi/processors/standard/SplitXml.java
index 1919dbe..c5eda3d 100644
--- a/nar-bundles/standard-bundle/standard-processors/src/main/java/org/apache/nifi/processors/standard/SplitXml.java
+++ b/nar-bundles/standard-bundle/standard-processors/src/main/java/org/apache/nifi/processors/standard/SplitXml.java
@@ -284,7 +284,7 @@
                 int attCount = atts.getLength();
                 for (int i = 0; i < attCount; i++) {
                     String attName = atts.getQName(i);
-                    String attValue = StringEscapeUtils.escapeXml(atts.getValue(i));
+                    String attValue = StringEscapeUtils.escapeXml10(atts.getValue(i));
                     sb.append(" ").append(attName).append("=").append("\"").append(attValue).append("\"");
                 }
 
