diff --git a/druid-handler/src/java/org/apache/hadoop/hive/druid/HiveDruidQueryBasedInputFormat.java b/druid-handler/src/java/org/apache/hadoop/hive/druid/HiveDruidQueryBasedInputFormat.java
index cc4a8ef..787cd52 100644
--- a/druid-handler/src/java/org/apache/hadoop/hive/druid/HiveDruidQueryBasedInputFormat.java
+++ b/druid-handler/src/java/org/apache/hadoop/hive/druid/HiveDruidQueryBasedInputFormat.java
@@ -254,7 +254,7 @@
       }
 
       intervals.add(new Interval(timeList.get(0).getValue().getMinTime().getMillis(),
-              timeList.get(0).getValue().getMaxTime().getMillis()));
+              timeList.get(0).getValue().getMaxTime().getMillis(), ISOChronology.getInstanceUTC()));
     } else {
       intervals.addAll(query.getIntervals());
     }
@@ -289,13 +289,13 @@
         final long expectedRange = rangeSize - currTime;
         if (interval.getEndMillis() - startTime >= expectedRange) {
           endTime = startTime + expectedRange;
-          currentIntervals.add(new Interval(startTime, endTime));
+          currentIntervals.add(new Interval(startTime, endTime, ISOChronology.getInstanceUTC()));
           startTime = endTime;
           currTime = 0;
           break;
         }
         endTime = interval.getEndMillis();
-        currentIntervals.add(new Interval(startTime, endTime));
+        currentIntervals.add(new Interval(startTime, endTime, ISOChronology.getInstanceUTC()));
         currTime += (endTime - startTime);
         startTime = intervals.get(++posIntervals).getStartMillis();
       }
