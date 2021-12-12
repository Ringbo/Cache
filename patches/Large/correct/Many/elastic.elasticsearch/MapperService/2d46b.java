diff --git a/src/main/java/org/elasticsearch/index/mapper/MapperService.java b/src/main/java/org/elasticsearch/index/mapper/MapperService.java
index e270a42..78f8432 100644
--- a/src/main/java/org/elasticsearch/index/mapper/MapperService.java
+++ b/src/main/java/org/elasticsearch/index/mapper/MapperService.java
@@ -905,12 +905,12 @@
                 }
             }
             FieldMappers mappers = fullNameFieldMappers.get(fieldName);
-            if (mappers != null && mappers.mapper() != null && mappers.mapper().searchAnalyzer() != null) {
+            if (mappers != null && mappers.mapper() != null && mappers.mapper().searchQuoteAnalyzer() != null) {
                 return mappers.mapper().searchQuoteAnalyzer().getPositionIncrementGap(fieldName);
             }
 
             mappers = indexNameFieldMappers.get(fieldName);
-            if (mappers != null && mappers.mapper() != null && mappers.mapper().searchAnalyzer() != null) {
+            if (mappers != null && mappers.mapper() != null && mappers.mapper().searchQuoteAnalyzer() != null) {
                 return mappers.mapper().searchQuoteAnalyzer().getPositionIncrementGap(fieldName);
             }
             return defaultAnalyzer.getPositionIncrementGap(fieldName);
@@ -928,12 +928,12 @@
                 }
             }
             FieldMappers mappers = fullNameFieldMappers.get(fieldName);
-            if (mappers != null && mappers.mapper() != null && mappers.mapper().searchAnalyzer() != null) {
+            if (mappers != null && mappers.mapper() != null && mappers.mapper().searchQuoteAnalyzer() != null) {
                 return mappers.mapper().searchQuoteAnalyzer().getOffsetGap(field);
             }
 
             mappers = indexNameFieldMappers.get(fieldName);
-            if (mappers != null && mappers.mapper() != null && mappers.mapper().searchAnalyzer() != null) {
+            if (mappers != null && mappers.mapper() != null && mappers.mapper().searchQuoteAnalyzer() != null) {
                 return mappers.mapper().searchQuoteAnalyzer().getOffsetGap(field);
             }
             return defaultAnalyzer.getOffsetGap(field);
@@ -950,12 +950,12 @@
                 }
             }
             FieldMappers mappers = fullNameFieldMappers.get(fieldName);
-            if (mappers != null && mappers.mapper() != null && mappers.mapper().searchAnalyzer() != null) {
+            if (mappers != null && mappers.mapper() != null && mappers.mapper().searchQuoteAnalyzer() != null) {
                 return mappers.mapper().searchQuoteAnalyzer().tokenStream(fieldName, reader);
             }
 
             mappers = indexNameFieldMappers.get(fieldName);
-            if (mappers != null && mappers.mapper() != null && mappers.mapper().searchAnalyzer() != null) {
+            if (mappers != null && mappers.mapper() != null && mappers.mapper().searchQuoteAnalyzer() != null) {
                 return mappers.mapper().searchQuoteAnalyzer().tokenStream(fieldName, reader);
             }
             return defaultAnalyzer.tokenStream(fieldName, reader);
@@ -972,12 +972,12 @@
                 }
             }
             FieldMappers mappers = fullNameFieldMappers.get(fieldName);
-            if (mappers != null && mappers.mapper() != null && mappers.mapper().searchAnalyzer() != null) {
+            if (mappers != null && mappers.mapper() != null && mappers.mapper().searchQuoteAnalyzer() != null) {
                 return mappers.mapper().searchQuoteAnalyzer().reusableTokenStream(fieldName, reader);
             }
 
             mappers = indexNameFieldMappers.get(fieldName);
-            if (mappers != null && mappers.mapper() != null && mappers.mapper().searchAnalyzer() != null) {
+            if (mappers != null && mappers.mapper() != null && mappers.mapper().searchQuoteAnalyzer() != null) {
                 return mappers.mapper().searchQuoteAnalyzer().reusableTokenStream(fieldName, reader);
             }
             return defaultAnalyzer.reusableTokenStream(fieldName, reader);
