diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/metrics/AbstractClassCouplingCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/metrics/AbstractClassCouplingCheck.java
index 3f726ff..46e4e31 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/metrics/AbstractClassCouplingCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/metrics/AbstractClassCouplingCheck.java
@@ -210,7 +210,7 @@
          * @param lineNo line of class definition.
          * @param columnNo column of class definition.
          */
-        public Context(String className, int lineNo, int columnNo) {
+        Context(String className, int lineNo, int columnNo) {
             this.className = className;
             this.lineNo = lineNo;
             this.columnNo = columnNo;
