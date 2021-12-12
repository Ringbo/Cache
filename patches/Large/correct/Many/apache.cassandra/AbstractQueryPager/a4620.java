diff --git a/src/java/org/apache/cassandra/service/pager/AbstractQueryPager.java b/src/java/org/apache/cassandra/service/pager/AbstractQueryPager.java
index 6047b5b..ba4d8f2 100644
--- a/src/java/org/apache/cassandra/service/pager/AbstractQueryPager.java
+++ b/src/java/org/apache/cassandra/service/pager/AbstractQueryPager.java
@@ -197,7 +197,7 @@
         }
 
         // If there is less live data than to discard, all is discarded
-        if (i >= rows.size())
+        if (toDiscard > 0 && i >= rows.size())
             return Collections.<Row>emptyList();
 
         int count = firstCf.getColumnCount();
@@ -234,7 +234,7 @@
         }
 
         // If there is less live data than to discard, all is discarded
-        if (i < 0)
+        if (toDiscard > 0 && i < 0)
             return Collections.<Row>emptyList();
 
         int count = lastCf.getColumnCount();
