diff --git a/common/src/main/java/org/broadleafcommerce/common/persistence/SequenceGeneratorCorruptionDetection.java b/common/src/main/java/org/broadleafcommerce/common/persistence/SequenceGeneratorCorruptionDetection.java
index fab4b05..945b697 100644
--- a/common/src/main/java/org/broadleafcommerce/common/persistence/SequenceGeneratorCorruptionDetection.java
+++ b/common/src/main/java/org/broadleafcommerce/common/persistence/SequenceGeneratorCorruptionDetection.java
@@ -201,7 +201,7 @@
                 if (CollectionUtils.isNotEmpty(results) && results.get(0) != null) {
                     LOG.debug(String.format("Checking for sequence corruption on entity %s", segmentValue));
                     Long maxEntityId = BLCNumberUtils.toLong(results.get(0));
-                    if (maxEntityId > maxSequenceId) {
+                    if (maxEntityId >= maxSequenceId) {
                         String invalidSequenceDetectedMsg = String.format("The sequence value for %s in %s was found as %d (or an entry did not exist) but the actual max sequence in"
                             + " %s's table was found as %d", segmentValue, tableName, maxSequenceId, mappedClass.getName(), maxEntityId);
                         if (automaticallyCorrectInconsistencies) {
