diff --git a/java/org/apache/catalina/connector/CoyoteReader.java b/java/org/apache/catalina/connector/CoyoteReader.java
index d3584e9..9b51ac4 100644
--- a/java/org/apache/catalina/connector/CoyoteReader.java
+++ b/java/org/apache/catalina/connector/CoyoteReader.java
@@ -153,7 +153,7 @@
             while ((pos < MAX_LINE_LENGTH) && (end < 0)) {
                 int nRead = read(lineBuffer, pos, MAX_LINE_LENGTH - pos);
                 if (nRead < 0) {
-                    if (pos == 0) {
+                    if (pos == 0 && aggregator == null) {
                         return null;
                     }
                     end = pos;
