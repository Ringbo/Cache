diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/IndentLevel.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/IndentLevel.java
index 09ea87c..35c11e6 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/IndentLevel.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/IndentLevel.java
@@ -119,7 +119,7 @@
         if (levels.cardinality() == 1) {
             return String.valueOf(levels.nextSetBit(0));
         }
-        final StringBuilder sb = new StringBuilder();
+        final StringBuilder sb = new StringBuilder(50);
         for (int i = levels.nextSetBit(0); i >= 0;
             i = levels.nextSetBit(i + 1)) {
             if (sb.length() > 0) {
