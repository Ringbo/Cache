diff --git a/core/java/com/android/internal/app/procstats/PssTable.java b/core/java/com/android/internal/app/procstats/PssTable.java
index b6df983..de5f673 100644
--- a/core/java/com/android/internal/app/procstats/PssTable.java
+++ b/core/java/com/android/internal/app/procstats/PssTable.java
@@ -96,7 +96,7 @@
             }
 
             val = getValue(key, PSS_USS_AVERAGE);
-            setValue(key, PSS_AVERAGE,
+            setValue(key, PSS_USS_AVERAGE,
                     (long)(((val*(double)count)+(avgUss*(double)inCount)) / (count+inCount)));
 
             val = getValue(key, PSS_USS_MAXIMUM);
