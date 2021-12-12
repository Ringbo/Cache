diff --git a/janusgraph-core/src/main/java/org/janusgraph/core/TitanTransaction.java b/janusgraph-core/src/main/java/org/janusgraph/core/TitanTransaction.java
index a03ba41..3123425 100644
--- a/janusgraph-core/src/main/java/org/janusgraph/core/TitanTransaction.java
+++ b/janusgraph-core/src/main/java/org/janusgraph/core/TitanTransaction.java
@@ -27,7 +27,7 @@
  *
  * @author Matthias Br&ouml;cheler (http://www.matthiasb.com)
  */
-public interface TitanTransaction extends TitanGraphTransaction {
+public interface TitanTransaction extends Transaction {
 
    /* ---------------------------------------------------------------
     * Modifications
