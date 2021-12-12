diff --git a/graal/com.oracle.graal.compiler/src/com/oracle/graal/compiler/alloc/Interval.java b/graal/com.oracle.graal.compiler/src/com/oracle/graal/compiler/alloc/Interval.java
index 767889e..4af632f 100644
--- a/graal/com.oracle.graal.compiler/src/com/oracle/graal/compiler/alloc/Interval.java
+++ b/graal/com.oracle.graal.compiler/src/com/oracle/graal/compiler/alloc/Interval.java
@@ -1179,7 +1179,9 @@
         String to = "?";
         if (first != null && first != Range.EndMarker) {
             from = String.valueOf(from());
-            to = String.valueOf(to());
+            // to() may cache a computed value, modifying the current object, which is a bad idea
+            // for a printing function. Compute it directly instead.
+            to = String.valueOf(calcTo());
         }
         String locationString = this.location == null ? "" : "@" + this.location;
         return operandNumber + ":" + operand + (isRegister(operand) ? "" : locationString) + "[" + from + "," + to + "]";
