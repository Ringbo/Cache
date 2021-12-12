diff --git a/aeron-driver/src/main/java/uk/co/real_logic/aeron/driver/SystemCounters.java b/aeron-driver/src/main/java/uk/co/real_logic/aeron/driver/SystemCounters.java
index fb8bb70..3b81fe9 100644
--- a/aeron-driver/src/main/java/uk/co/real_logic/aeron/driver/SystemCounters.java
+++ b/aeron-driver/src/main/java/uk/co/real_logic/aeron/driver/SystemCounters.java
@@ -107,7 +107,7 @@
 
     public AtomicCounter flowControlUnderRuns()
     {
-        return flowControlOverRuns;
+        return flowControlUnderRuns;
     }
 
     public AtomicCounter flowControlOverRuns()
