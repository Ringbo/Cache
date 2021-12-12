diff --git a/src/protocol/jdbc/org/apache/jmeter/protocol/jdbc/AbstractJDBCTestElement.java b/src/protocol/jdbc/org/apache/jmeter/protocol/jdbc/AbstractJDBCTestElement.java
index 6483b4d..cc82153 100644
--- a/src/protocol/jdbc/org/apache/jmeter/protocol/jdbc/AbstractJDBCTestElement.java
+++ b/src/protocol/jdbc/org/apache/jmeter/protocol/jdbc/AbstractJDBCTestElement.java
@@ -475,7 +475,7 @@
     public int getIntegerQueryTimeout() {
         int timeout = 0;
         try {
-            if(StringUtils.isNumeric(query)) {
+            if(StringUtils.isNumeric(queryTimeout)) {
                 timeout = Integer.parseInt(queryTimeout);
             }
         } catch (NumberFormatException nfe) {
