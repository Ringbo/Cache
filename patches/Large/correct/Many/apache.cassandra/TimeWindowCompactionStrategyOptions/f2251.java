diff --git a/src/java/org/apache/cassandra/db/compaction/TimeWindowCompactionStrategyOptions.java b/src/java/org/apache/cassandra/db/compaction/TimeWindowCompactionStrategyOptions.java
index bcbdab6..07df606 100644
--- a/src/java/org/apache/cassandra/db/compaction/TimeWindowCompactionStrategyOptions.java
+++ b/src/java/org/apache/cassandra/db/compaction/TimeWindowCompactionStrategyOptions.java
@@ -114,12 +114,12 @@
             int sstableWindowSize = optionValue == null ? DEFAULT_COMPACTION_WINDOW_SIZE : Integer.parseInt(optionValue);
             if (sstableWindowSize < 1)
             {
-                throw new ConfigurationException(String.format("%s must be greater than 1", DEFAULT_COMPACTION_WINDOW_SIZE, sstableWindowSize));
+                throw new ConfigurationException(String.format("%d must be greater than 1 for %s", sstableWindowSize, COMPACTION_WINDOW_SIZE_KEY));
             }
         }
         catch (NumberFormatException e)
         {
-            throw new ConfigurationException(String.format("%s is not a parsable int (base10) for %s", optionValue, DEFAULT_COMPACTION_WINDOW_SIZE), e);
+            throw new ConfigurationException(String.format("%s is not a parsable int (base10) for %s", optionValue, COMPACTION_WINDOW_SIZE_KEY), e);
         }
 
         optionValue = options.get(EXPIRED_SSTABLE_CHECK_FREQUENCY_SECONDS_KEY);
