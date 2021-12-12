diff --git a/samples/guide/src/main/java/okhttp3/recipes/PrintEvents.java b/samples/guide/src/main/java/okhttp3/recipes/PrintEvents.java
index a1fdbd0..1366a82 100644
--- a/samples/guide/src/main/java/okhttp3/recipes/PrintEvents.java
+++ b/samples/guide/src/main/java/okhttp3/recipes/PrintEvents.java
@@ -87,7 +87,7 @@
     final long callId;
     final long callStartNanos;
 
-    public PrintingEventListener(long callId, long callStartNanos) {
+    PrintingEventListener(long callId, long callStartNanos) {
       this.callId = callId;
       this.callStartNanos = callStartNanos;
     }
