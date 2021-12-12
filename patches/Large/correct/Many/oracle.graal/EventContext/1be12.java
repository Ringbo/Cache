diff --git a/truffle/src/com.oracle.truffle.api.instrumentation/src/com/oracle/truffle/api/instrumentation/EventContext.java b/truffle/src/com.oracle.truffle.api.instrumentation/src/com/oracle/truffle/api/instrumentation/EventContext.java
index 99c3a78..6af9f6d 100644
--- a/truffle/src/com.oracle.truffle.api.instrumentation/src/com/oracle/truffle/api/instrumentation/EventContext.java
+++ b/truffle/src/com.oracle.truffle.api.instrumentation/src/com/oracle/truffle/api/instrumentation/EventContext.java
@@ -86,7 +86,7 @@
         }
         if (foundStandardTag) {
             RootNode root = probeNode.getRootNode();
-            if (root.getSourceSection() != null) {
+            if (root != null && root.getSourceSection() != null) {
                 assert sourceSection != null : "All nodes tagged with a standard tag and with a root node that has a source section must also have a source section.";
             }
         }
