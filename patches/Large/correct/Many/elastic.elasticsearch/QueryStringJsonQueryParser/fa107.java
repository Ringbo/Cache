diff --git a/modules/elasticsearch/src/main/java/org/elasticsearch/index/query/json/QueryStringJsonQueryParser.java b/modules/elasticsearch/src/main/java/org/elasticsearch/index/query/json/QueryStringJsonQueryParser.java
index 9f44ba3..92662fe 100644
--- a/modules/elasticsearch/src/main/java/org/elasticsearch/index/query/json/QueryStringJsonQueryParser.java
+++ b/modules/elasticsearch/src/main/java/org/elasticsearch/index/query/json/QueryStringJsonQueryParser.java
@@ -195,7 +195,7 @@
                 } else if ("escape".equals(currentFieldName)) {
                     escape = jp.getIntValue() != 0;
                 } else if ("useDisMax".equals(currentFieldName)) {
-                    escape = jp.getIntValue() != 0;
+                    useDisMax = jp.getIntValue() != 0;
                 } else if ("tieBreaker".equals(currentFieldName)) {
                     tieBreaker = jp.getFloatValue();
                 }
