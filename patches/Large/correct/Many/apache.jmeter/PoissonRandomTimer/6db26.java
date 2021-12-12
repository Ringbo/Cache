diff --git a/src/components/org/apache/jmeter/timers/PoissonRandomTimer.java b/src/components/org/apache/jmeter/timers/PoissonRandomTimer.java
index fdf3e24..a62f126 100644
--- a/src/components/org/apache/jmeter/timers/PoissonRandomTimer.java
+++ b/src/components/org/apache/jmeter/timers/PoissonRandomTimer.java
@@ -380,7 +380,7 @@
             throw new IllegalArgumentException();
         }
         else if (n > 254) {
-            double x = n + 1;
+            double x = n + 1d;
             return (x - 0.5)*Math.log(x) - x + 0.5*Math.log(2*Math.PI) + 1.0/(12.0*x);
         }
         else {
