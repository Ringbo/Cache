diff --git a/graal/com.oracle.graal.debug/src/com/oracle/graal/debug/internal/MemUseTrackerImpl.java b/graal/com.oracle.graal.debug/src/com/oracle/graal/debug/internal/MemUseTrackerImpl.java
index 65b4fed..1bd436e 100644
--- a/graal/com.oracle.graal.debug/src/com/oracle/graal/debug/internal/MemUseTrackerImpl.java
+++ b/graal/com.oracle.graal.debug/src/com/oracle/graal/debug/internal/MemUseTrackerImpl.java
@@ -49,7 +49,7 @@
     private static final ThreadLocal<CloseableCounterImpl> currentTracker = new ThreadLocal<>();
 
     public MemUseTrackerImpl(String name) {
-        super(name, false, new DebugValue(name + "_Flat", true) {
+        super(name, true, new DebugValue(name + "_Flat", true) {
 
             @Override
             public String toString(long value) {
