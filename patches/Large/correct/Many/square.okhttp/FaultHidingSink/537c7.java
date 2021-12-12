diff --git a/okhttp/src/main/java/okhttp3/internal/cache/FaultHidingSink.java b/okhttp/src/main/java/okhttp3/internal/cache/FaultHidingSink.java
index b10fddb..561a305 100644
--- a/okhttp/src/main/java/okhttp3/internal/cache/FaultHidingSink.java
+++ b/okhttp/src/main/java/okhttp3/internal/cache/FaultHidingSink.java
@@ -24,7 +24,7 @@
 class FaultHidingSink extends ForwardingSink {
   private boolean hasErrors;
 
-  public FaultHidingSink(Sink delegate) {
+  FaultHidingSink(Sink delegate) {
     super(delegate);
   }
 
