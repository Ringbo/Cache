diff --git a/presto-main/src/main/java/com/facebook/presto/cli/Execute.java b/presto-main/src/main/java/com/facebook/presto/cli/Execute.java
index fdda436..d4bb62a 100644
--- a/presto-main/src/main/java/com/facebook/presto/cli/Execute.java
+++ b/presto-main/src/main/java/com/facebook/presto/cli/Execute.java
@@ -245,7 +245,7 @@
     private String formatDataRate(long inputDataSize, Duration duration)
     {
         double rate = inputDataSize / duration.convertTo(TimeUnit.SECONDS);
-        if (Double.isNaN(rate)) {
+        if (Double.isNaN(rate) || Double.isInfinite(rate)) {
             return "0Bps";
         }
         DataSize dataSize = new DataSize(rate, Unit.BYTE).convertToMostSuccinctDataSize();
