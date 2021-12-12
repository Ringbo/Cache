diff --git a/solr/core/src/java/org/apache/solr/util/TimeOut.java b/solr/core/src/java/org/apache/solr/util/TimeOut.java
index 52694e9..ce996f4 100644
--- a/solr/core/src/java/org/apache/solr/util/TimeOut.java
+++ b/solr/core/src/java/org/apache/solr/util/TimeOut.java
@@ -51,9 +51,16 @@
     return unit.convert(timeSource.getTimeNs() - startTime, NANOSECONDS);
   }
 
+  /**
+   * Wait until the given {@link Supplier} returns true or the time out expires which ever happens first
+   * @param messageOnTimeOut the exception message to be used in case a TimeoutException is thrown
+   * @param supplier a {@link Supplier} that returns a {@link Boolean} value
+   * @throws InterruptedException if any thread has interrupted the current thread
+   * @throws TimeoutException if the timeout expires
+   */
   public void waitFor(String messageOnTimeOut, Supplier<Boolean> supplier)
       throws InterruptedException, TimeoutException {
-    while (!supplier.get() && hasTimedOut()) {
+    while (!supplier.get() && !hasTimedOut()) {
       Thread.sleep(500);
     }
     if (hasTimedOut()) throw new TimeoutException(messageOnTimeOut);
