diff --git a/src/java/org/apache/cassandra/index/sasi/conf/IndexMode.java b/src/java/org/apache/cassandra/index/sasi/conf/IndexMode.java
index 1c85ed5..c66dd02 100644
--- a/src/java/org/apache/cassandra/index/sasi/conf/IndexMode.java
+++ b/src/java/org/apache/cassandra/index/sasi/conf/IndexMode.java
@@ -141,11 +141,11 @@
             {
                 analyzerClass = Class.forName(indexOptions.get(INDEX_ANALYZER_CLASS_OPTION));
                 isAnalyzed = indexOptions.get(INDEX_ANALYZED_OPTION) == null
-                              ? true : Boolean.valueOf(indexOptions.get(INDEX_ANALYZED_OPTION));
+                              ? true : Boolean.parseBoolean(indexOptions.get(INDEX_ANALYZED_OPTION));
             }
             else if (indexOptions.get(INDEX_ANALYZED_OPTION) != null)
             {
-                isAnalyzed = Boolean.valueOf(indexOptions.get(INDEX_ANALYZED_OPTION));
+                isAnalyzed = Boolean.parseBoolean(indexOptions.get(INDEX_ANALYZED_OPTION));
             }
         }
         catch (ClassNotFoundException e)
@@ -163,7 +163,7 @@
 
             isLiteral = literalOption == null
                             ? (validator instanceof UTF8Type || validator instanceof AsciiType)
-                            : Boolean.valueOf(literalOption);
+                            : Boolean.parseBoolean(literalOption);
         }
         catch (Exception e)
         {
