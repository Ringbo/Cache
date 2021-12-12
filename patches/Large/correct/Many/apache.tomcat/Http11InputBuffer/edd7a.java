diff --git a/java/org/apache/coyote/http11/Http11InputBuffer.java b/java/org/apache/coyote/http11/Http11InputBuffer.java
index b87408d..7084a44 100644
--- a/java/org/apache/coyote/http11/Http11InputBuffer.java
+++ b/java/org/apache/coyote/http11/Http11InputBuffer.java
@@ -626,14 +626,14 @@
      * Available bytes in the buffers (note that due to encoding, this may not
      * correspond).
      */
-    int available() {
+    int available(boolean read) {
         int available = lastValid - pos;
         if ((available == 0) && (lastActiveFilter >= 0)) {
             for (int i = 0; (available == 0) && (i <= lastActiveFilter); i++) {
                 available = activeFilters[i].available();
             }
         }
-        if (available > 0) {
+        if (available > 0 || !read) {
             return available;
         }
 
