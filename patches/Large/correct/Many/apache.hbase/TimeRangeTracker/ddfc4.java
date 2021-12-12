diff --git a/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/TimeRangeTracker.java b/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/TimeRangeTracker.java
index a302d64..7fef0fd 100644
--- a/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/TimeRangeTracker.java
+++ b/hbase-server/src/main/java/org/apache/hadoop/hbase/regionserver/TimeRangeTracker.java
@@ -134,18 +134,18 @@
     return maximumTimestamp;
   }
 
-  public void write(final DataOutput out) throws IOException {
+  public synchronized void write(final DataOutput out) throws IOException {
     out.writeLong(minimumTimestamp);
     out.writeLong(maximumTimestamp);
   }
 
-  public void readFields(final DataInput in) throws IOException {
+  public synchronized void readFields(final DataInput in) throws IOException {
     this.minimumTimestamp = in.readLong();
     this.maximumTimestamp = in.readLong();
   }
 
   @Override
-  public String toString() {
+  public synchronized String toString() {
     return "[" + minimumTimestamp + "," + maximumTimestamp + "]";
   }
 }
