diff --git a/src/core/IncomingDataPoints.java b/src/core/IncomingDataPoints.java
index 0d8e2da..951c089 100644
--- a/src/core/IncomingDataPoints.java
+++ b/src/core/IncomingDataPoints.java
@@ -177,7 +177,7 @@
         throw new IllegalArgumentException("New timestamp=" + timestamp
             + " is less than previous=" + last_ts
             + " when trying to add value=" + value + " to " + this);
-      } else if (timestamp - base_time > Const.MAX_TIMESPAN) {
+      } else if (timestamp - base_time >= Const.MAX_TIMESPAN) {
         // Need to start a new row as we've exceeded Const.MAX_TIMESPAN.
         // We force the starting timestamp to be on a MAX_TIMESPAN boundary
         // so that all TSDs create rows with the same base time.  Otherwise
@@ -236,7 +236,7 @@
     // We can't have more than 1 value per second, so MAX_TIMESPAN values.
     final int new_size = Math.min(size * 2, Const.MAX_TIMESPAN);
     if (new_size == size) {
-      throw new AssertionError("Can't grow " + this + " larger.");
+      throw new AssertionError("Can't grow " + this + " larger than " + size);
     }
     values = Arrays.copyOf(values, new_size);
     qualifiers = Arrays.copyOf(qualifiers, new_size);
