diff --git a/jps/jps-builders/testSrc/org/jetbrains/ether/LogParser.java b/jps/jps-builders/testSrc/org/jetbrains/ether/LogParser.java
index 6469e4f..4477974 100644
--- a/jps/jps-builders/testSrc/org/jetbrains/ether/LogParser.java
+++ b/jps/jps-builders/testSrc/org/jetbrains/ether/LogParser.java
@@ -85,7 +85,7 @@
     final int minutes = Integer.parseInt(line.substring(MINUTES_START, MINUTES_START + 2));
     final int seconds = Integer.parseInt(line.substring(SECONDS_START, SECONDS_START + 2));
     final int millis = Integer.parseInt(line.substring(MILLIS_START, MILLIS_START + 3));
-    return millis + seconds * 1000 + minutes * 60000 + hours * 3600000;
+    return millis + seconds * 1000L + minutes * 60000L + hours * 3600000L;
   }
 
 }
