diff --git a/ql/src/java/org/apache/hadoop/hive/ql/io/orc/RecordReaderImpl.java b/ql/src/java/org/apache/hadoop/hive/ql/io/orc/RecordReaderImpl.java
index cdf4f49..bde9fc2 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/io/orc/RecordReaderImpl.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/io/orc/RecordReaderImpl.java
@@ -385,10 +385,10 @@
         result = evaluatePredicateBloomFilter(predicate, predObj, bloomFilter, hasNull);
       }
       // in case failed conversion, return the default YES_NO_NULL truth value
-    } catch (NumberFormatException nfe) {
+    } catch (Exception e) {
       if (LOG.isWarnEnabled()) {
-        LOG.warn("NumberFormatException when type matching predicate object" +
-            " and statistics object. Exception: " + ExceptionUtils.getStackTrace(nfe));
+        LOG.warn("Exception when evaluating predicate. Skipping ORC PPD." +
+            " Exception: " + ExceptionUtils.getStackTrace(e));
       }
       result = hasNull ? TruthValue.YES_NO_NULL : TruthValue.YES_NO;
     }
