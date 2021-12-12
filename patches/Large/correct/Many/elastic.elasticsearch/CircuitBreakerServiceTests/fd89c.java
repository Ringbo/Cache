diff --git a/src/test/java/org/elasticsearch/indices/fielddata/breaker/CircuitBreakerServiceTests.java b/src/test/java/org/elasticsearch/indices/fielddata/breaker/CircuitBreakerServiceTests.java
index c429b6a..40b05e8 100644
--- a/src/test/java/org/elasticsearch/indices/fielddata/breaker/CircuitBreakerServiceTests.java
+++ b/src/test/java/org/elasticsearch/indices/fielddata/breaker/CircuitBreakerServiceTests.java
@@ -46,7 +46,8 @@
 
     private String randomRidiculouslySmallLimit() {
         // 3 different ways to say 100 bytes
-        return randomFrom(Arrays.asList("100b", "100", (10000. / JvmInfo.jvmInfo().getMem().getHeapMax().bytes()) + "%"));
+        return randomFrom(Arrays.asList("100b", "100"));
+         //, (10000. / JvmInfo.jvmInfo().getMem().getHeapMax().bytes()) + "%")); // this is prone to rounding errors and will fail if JVM memory changes!
     }
 
     @Test
