diff --git a/core-metadata/src/main/java/org/apache/kylin/metadata/filter/ExtractTupleFilter.java b/core-metadata/src/main/java/org/apache/kylin/metadata/filter/ExtractTupleFilter.java
index 591e64b..8c2ba94 100644
--- a/core-metadata/src/main/java/org/apache/kylin/metadata/filter/ExtractTupleFilter.java
+++ b/core-metadata/src/main/java/org/apache/kylin/metadata/filter/ExtractTupleFilter.java
@@ -68,7 +68,7 @@
         }
 
         // extract date
-        this.date = extractDate(extractType, Integer.valueOf(tupleValue));
+        this.date = extractDate(extractType, Integer.parseInt(tupleValue));
         return true;
     }
 
