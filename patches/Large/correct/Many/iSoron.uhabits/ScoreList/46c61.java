diff --git a/uhabits-core/src/main/java/org/isoron/uhabits/core/models/ScoreList.java b/uhabits-core/src/main/java/org/isoron/uhabits/core/models/ScoreList.java
index 43959c1..b3ba683 100644
--- a/uhabits-core/src/main/java/org/isoron/uhabits/core/models/ScoreList.java
+++ b/uhabits-core/src/main/java/org/isoron/uhabits/core/models/ScoreList.java
@@ -172,7 +172,7 @@
         for (Score s : this)
         {
             String timestamp = dateFormat.format(s.getTimestamp().getUnixTime());
-            String score = String.format("%.4f", s.getValue());
+            String score = String.format((Locale)null, "%.4f", s.getValue());
             out.write(String.format("%s,%s\n", timestamp, score));
         }
     }
