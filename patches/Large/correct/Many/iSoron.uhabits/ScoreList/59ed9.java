diff --git a/app/src/main/java/org/isoron/uhabits/models/ScoreList.java b/app/src/main/java/org/isoron/uhabits/models/ScoreList.java
index 18b6775..c703e39 100644
--- a/app/src/main/java/org/isoron/uhabits/models/ScoreList.java
+++ b/app/src/main/java/org/isoron/uhabits/models/ScoreList.java
@@ -124,7 +124,7 @@
         return lastScore;
     }
 
-    public int[] getAllValues(Long fromTimestamp, Long toTimestamp, Integer divisor)
+    public int[] getAllValues(Long fromTimestamp, Long toTimestamp, Long divisor)
     {
         // Force rebuild of the score table
         getNewestValue();
@@ -157,7 +157,7 @@
 
     }
 
-    public int[] getAllValues(int divisor)
+    public int[] getAllValues(long divisor)
     {
         Repetition oldestRep = habit.repetitions.getOldest();
         if(oldestRep == null) return new int[0];
