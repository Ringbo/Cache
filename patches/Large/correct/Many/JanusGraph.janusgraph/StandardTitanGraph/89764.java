diff --git a/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/database/StandardTitanGraph.java b/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/database/StandardTitanGraph.java
index 2210171..37e8123 100644
--- a/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/database/StandardTitanGraph.java
+++ b/titan-core/src/main/java/com/thinkaurelius/titan/graphdb/database/StandardTitanGraph.java
@@ -229,10 +229,11 @@
                 }
                 // Throw an exception if at least one transaction failed to close
                 if (1 == txCloseExceptions.size()) {
-                    throw new TitanException("Unable to close transaction",
+                    // TP3's test suite requires that this be of type ISE
+                    throw new IllegalStateException("Unable to close transaction",
                             Iterables.getOnlyElement(txCloseExceptions.values()));
                 } else if (1 < txCloseExceptions.size()) {
-                    throw new TitanException(String.format(
+                    throw new IllegalStateException(String.format(
                             "Unable to close %s transactions (see warnings in log output for details)",
                             txCloseExceptions.size()));
                 }
