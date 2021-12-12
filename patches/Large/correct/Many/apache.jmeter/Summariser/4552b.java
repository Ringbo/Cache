diff --git a/src/core/org/apache/jmeter/reporters/Summariser.java b/src/core/org/apache/jmeter/reporters/Summariser.java
index 9fbfdc5..8089bb1 100644
--- a/src/core/org/apache/jmeter/reporters/Summariser.java
+++ b/src/core/org/apache/jmeter/reporters/Summariser.java
@@ -146,9 +146,9 @@
         /** Time of last summary (to prevent double reporting) */
         private long last = 0;
 
-        private final SummariserRunningSample delta = new SummariserRunningSample("DELTA",0);
+        private final SummariserRunningSample delta = new SummariserRunningSample("DELTA");
 
-        private final SummariserRunningSample total = new SummariserRunningSample("TOTAL",0);
+        private final SummariserRunningSample total = new SummariserRunningSample("TOTAL");
 
         /**
          * Add the delta values to the total values and clear the delta
@@ -234,11 +234,13 @@
     }
 
     /**
-     * @param myTotal
-     * @param string
-     * @return the sunnary information
+     * Formats summariserRunningSample
+     * @param name Summariser name
+     * @param summariserRunningSample {@link SummariserRunningSample}
+     * @param type Type of summariser (difference or total)
+     * @return the summary information
      */
-    private static String format(String name, SummariserRunningSample s, String type) {
+    private static String format(String name, SummariserRunningSample summariserRunningSample, String type) {
         DecimalFormat dfDouble = new DecimalFormat("#0.0"); // $NON-NLS-1$
         StringBuilder tmp = new StringBuilder(20); // for intermediate use
         StringBuilder sb = new StringBuilder(100); // output line buffer
@@ -246,9 +248,9 @@
         sb.append(" ");
         sb.append(type);
         sb.append(" ");
-        sb.append(longToSb(tmp, s.getNumSamples(), 6));
+        sb.append(longToSb(tmp, summariserRunningSample.getNumSamples(), 6));
         sb.append(" in ");
-        long elapsed = s.getElapsed();
+        long elapsed = summariserRunningSample.getElapsed();
         long elapsedSec = (elapsed + 500) / 1000; // rounded seconds
         if (elapsedSec > 100       // No point displaying decimals (less than 1% error)
          || (elapsed - elapsedSec * 1000) < 50 // decimal would be zero
@@ -260,20 +262,20 @@
         }
         sb.append("s = ");
         if (elapsed > 0) {
-            sb.append(doubleToSb(dfDouble, tmp, s.getRate(), 6, 1));
+            sb.append(doubleToSb(dfDouble, tmp, summariserRunningSample.getRate(), 6, 1));
         } else {
             sb.append("******");// Rate is effectively infinite
         }
         sb.append("/s Avg: ");
-        sb.append(longToSb(tmp, s.getAverage(), 5));
+        sb.append(longToSb(tmp, summariserRunningSample.getAverage(), 5));
         sb.append(" Min: ");
-        sb.append(longToSb(tmp, s.getMin(), 5));
+        sb.append(longToSb(tmp, summariserRunningSample.getMin(), 5));
         sb.append(" Max: ");
-        sb.append(longToSb(tmp, s.getMax(), 5));
+        sb.append(longToSb(tmp, summariserRunningSample.getMax(), 5));
         sb.append(" Err: ");
-        sb.append(longToSb(tmp, s.getErrorCount(), 5));
+        sb.append(longToSb(tmp, summariserRunningSample.getErrorCount(), 5));
         sb.append(" (");
-        sb.append(s.getErrorPercentageString());
+        sb.append(summariserRunningSample.getErrorPercentageString());
         sb.append(")");
         if ("+".equals(type)) {
             ThreadCounts tc = JMeterContextService.getThreadCounts();
