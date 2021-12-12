diff --git a/src/java/org/apache/cassandra/db/HintedHandOffManager.java b/src/java/org/apache/cassandra/db/HintedHandOffManager.java
index 7107b58..6cd7af2 100644
--- a/src/java/org/apache/cassandra/db/HintedHandOffManager.java
+++ b/src/java/org/apache/cassandra/db/HintedHandOffManager.java
@@ -345,7 +345,7 @@
                 }
                 catch (UnknownColumnFamilyException e)
                 {
-                    logger_.debug("Skipping delivery of hint for deleted columnfamily", e);
+                    logger.debug("Skipping delivery of hint for deleted columnfamily", e);
                     rm = null;
                 }
 
