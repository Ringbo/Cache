diff --git a/mockserver-core/src/main/java/org/mockserver/mock/HttpStateHandler.java b/mockserver-core/src/main/java/org/mockserver/mock/HttpStateHandler.java
index 261ed63..57aaf8f 100644
--- a/mockserver-core/src/main/java/org/mockserver/mock/HttpStateHandler.java
+++ b/mockserver-core/src/main/java/org/mockserver/mock/HttpStateHandler.java
@@ -96,7 +96,7 @@
     public void reset() {
         mockServerMatcher.reset();
         mockServerLog.reset();
-        mockServerLogger.info(request(), "resetting all expectations and request logs" + NEW_LINE);
+        mockServerLogger.info( "resetting all expectations and request logs" + NEW_LINE);
     }
 
     public void add(Expectation... expectations) {
@@ -109,7 +109,7 @@
 
     public Expectation firstMatchingExpectation(HttpRequest request) {
         if (mockServerMatcher.isEmpty()) {
-            mockServerLogger.info(request(), "no active expectations when receiving request:{}", request);
+            mockServerLogger.info(request, "no active expectations when receiving request:{}", request);
             return null;
         } else {
             return mockServerMatcher.firstMatchingExpectation(request);
