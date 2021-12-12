diff --git a/src/java/org/apache/cassandra/db/marshal/DateType.java b/src/java/org/apache/cassandra/db/marshal/DateType.java
index 56d00a6..4270511 100644
--- a/src/java/org/apache/cassandra/db/marshal/DateType.java
+++ b/src/java/org/apache/cassandra/db/marshal/DateType.java
@@ -108,7 +108,7 @@
       {
           try
           {
-              millis = DateUtils.parseDate(source, iso8601Patterns).getTime();
+              millis = DateUtils.parseDateStrictly(source, iso8601Patterns).getTime();
           }
           catch (ParseException e1)
           {
