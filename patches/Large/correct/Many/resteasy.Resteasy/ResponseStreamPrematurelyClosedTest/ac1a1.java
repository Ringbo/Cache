diff --git a/testsuite/integration-tests/src/test/java/org/jboss/resteasy/test/response/ResponseStreamPrematurelyClosedTest.java b/testsuite/integration-tests/src/test/java/org/jboss/resteasy/test/response/ResponseStreamPrematurelyClosedTest.java
index 3fa4f45..f4f36dd 100644
--- a/testsuite/integration-tests/src/test/java/org/jboss/resteasy/test/response/ResponseStreamPrematurelyClosedTest.java
+++ b/testsuite/integration-tests/src/test/java/org/jboss/resteasy/test/response/ResponseStreamPrematurelyClosedTest.java
@@ -105,7 +105,7 @@
                     coutDown.await(10, TimeUnit.SECONDS);
 
                     IOUtils.copy(ins, baos);
-                    Assert.assertEquals("Received string: " + baos.toShortString(), 100000000, baos.size());
+                    Assert.assertEquals("Received string: " + baos.toShortString(), 10000000, baos.size());
                 } finally {
                     //remove the listener
                     for (GarbageCollectorMXBean gcbean : gcbeans) {
@@ -132,10 +132,10 @@
         
         public String toShortString() {
             int s = size();
-            if (s <= 100) {
+            if (s <= 14000) {
                 return toString();
             } else {
-                return getSubstring(0, 50) + "..." + getSubstring(s - 50, 50);
+                return getSubstring(0, 1000) + "..." + getSubstring(s - 13000, 13000);
             }
         }
     }
