diff --git a/core/camel-core/src/main/java/org/apache/camel/component/mock/MockEndpoint.java b/core/camel-core/src/main/java/org/apache/camel/component/mock/MockEndpoint.java
index 74ea4f4..46392c9 100644
--- a/core/camel-core/src/main/java/org/apache/camel/component/mock/MockEndpoint.java
+++ b/core/camel-core/src/main/java/org/apache/camel/component/mock/MockEndpoint.java
@@ -482,7 +482,7 @@
      * the assertion is satisfied when 5 or more message arrives. To ensure that
      * exactly 5 messages arrives, then you would need to wait a little period
      * to ensure no further message arrives. This is what you can use this
-     * {@link #setAssertPeriod(long)} method for.
+     * method for.
      * <p/>
      * By default this period is disabled.
      *
@@ -508,11 +508,9 @@
      * <p/>
      * You can set multiple expectations for different header names.
      * If you set a value of <tt>null</tt> that means we accept either the header is absent, or its value is <tt>null</tt>
-     * <p/>
-     * <b>Important:</b> This overrides any previous set value using {@link #expectedMessageCount(int)}
      */
     public void expectedHeaderReceived(final String name, final Object value) {
-        if (expectedMinimumCount == -1) {
+        if (expectedMinimumCount == -1 && expectedCount <= 0) {
             expectedMinimumMessageCount(1);
         }
         if (expectedHeaderValues == null) {
