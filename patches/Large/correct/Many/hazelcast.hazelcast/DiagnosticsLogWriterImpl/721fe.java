diff --git a/hazelcast/src/main/java/com/hazelcast/internal/diagnostics/DiagnosticsLogWriterImpl.java b/hazelcast/src/main/java/com/hazelcast/internal/diagnostics/DiagnosticsLogWriterImpl.java
index 280c903..26503f6 100644
--- a/hazelcast/src/main/java/com/hazelcast/internal/diagnostics/DiagnosticsLogWriterImpl.java
+++ b/hazelcast/src/main/java/com/hazelcast/internal/diagnostics/DiagnosticsLogWriterImpl.java
@@ -34,7 +34,7 @@
 /**
  * A writer like structure dedicated for the {@link DiagnosticsPlugin} rendering.
  */
-class DiagnosticsLogWriterImpl implements DiagnosticsLogWriter {
+public class DiagnosticsLogWriterImpl implements DiagnosticsLogWriter {
 
     private static final String STR_LONG_MIN_VALUE = String.format(LOCALE_INTERNAL, "%,d", Long.MIN_VALUE);
 
@@ -67,11 +67,11 @@
     // used to write primitives without causing litter
     private StringBuilder stringBuilder = new StringBuilder();
 
-    DiagnosticsLogWriterImpl() {
+    public DiagnosticsLogWriterImpl() {
         this(false);
     }
 
-    DiagnosticsLogWriterImpl(boolean includeEpochTime) {
+    public DiagnosticsLogWriterImpl(boolean includeEpochTime) {
         this.includeEpochTime = includeEpochTime;
     }
 
