diff --git a/guava/sources/com/google/common/base/Stopwatch.java b/guava/sources/com/google/common/base/Stopwatch.java
index eb1be5c..7840bd9 100644
--- a/guava/sources/com/google/common/base/Stopwatch.java
+++ b/guava/sources/com/google/common/base/Stopwatch.java
@@ -133,7 +133,7 @@
    * @deprecated Use {@link Stopwatch#createUnstarted()} instead.
    */
   @Deprecated
-  Stopwatch() {
+  public Stopwatch() {
     this(Ticker.systemTicker());
   }
 
@@ -144,7 +144,7 @@
    * @deprecated Use {@link Stopwatch#createUnstarted(Ticker)} instead.
    */
   @Deprecated
-  Stopwatch(Ticker ticker) {
+  public Stopwatch(Ticker ticker) {
     this.ticker = checkNotNull(ticker, "ticker");
   }
 
