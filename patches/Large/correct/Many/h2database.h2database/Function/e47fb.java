diff --git a/h2/src/main/org/h2/expression/Function.java b/h2/src/main/org/h2/expression/Function.java
index 8f3f1e6..58cb9f0 100644
--- a/h2/src/main/org/h2/expression/Function.java
+++ b/h2/src/main/org/h2/expression/Function.java
@@ -1942,9 +1942,9 @@
             forceTimestamp = true;
         }
         timeNanos += count;
-        if (timeNanos > DateTimeUtils.NANOS_PER_DAY || timeNanos < 0) {
+        if (timeNanos >= DateTimeUtils.NANOS_PER_DAY || timeNanos < 0) {
             long d;
-            if (timeNanos > DateTimeUtils.NANOS_PER_DAY) {
+            if (timeNanos >= DateTimeUtils.NANOS_PER_DAY) {
                 d = timeNanos / DateTimeUtils.NANOS_PER_DAY;
             } else {
                 d = (timeNanos - DateTimeUtils.NANOS_PER_DAY + 1) / DateTimeUtils.NANOS_PER_DAY;
