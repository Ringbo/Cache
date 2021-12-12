diff --git a/subprojects/internal-integ-testing/src/main/groovy/org/gradle/test/fixtures/server/http/ResourceHandlerWrapper.java b/subprojects/internal-integ-testing/src/main/groovy/org/gradle/test/fixtures/server/http/ResourceHandlerWrapper.java
index 585df1b..e221493 100644
--- a/subprojects/internal-integ-testing/src/main/groovy/org/gradle/test/fixtures/server/http/ResourceHandlerWrapper.java
+++ b/subprojects/internal-integ-testing/src/main/groovy/org/gradle/test/fixtures/server/http/ResourceHandlerWrapper.java
@@ -27,7 +27,7 @@
     private boolean started;
     private boolean received;
 
-    public ResourceHandlerWrapper(Lock lock, ResourceExpectation expectation) {
+    ResourceHandlerWrapper(Lock lock, ResourceExpectation expectation) {
         this.lock = lock;
         handler = expectation.create(this);
     }
