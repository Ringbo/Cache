diff --git a/subprojects/internal-integ-testing/src/main/groovy/org/gradle/test/fixtures/server/http/CyclicBarrierHttpServer.java b/subprojects/internal-integ-testing/src/main/groovy/org/gradle/test/fixtures/server/http/CyclicBarrierHttpServer.java
index 85ac0b5..26b3ace 100644
--- a/subprojects/internal-integ-testing/src/main/groovy/org/gradle/test/fixtures/server/http/CyclicBarrierHttpServer.java
+++ b/subprojects/internal-integ-testing/src/main/groovy/org/gradle/test/fixtures/server/http/CyclicBarrierHttpServer.java
@@ -106,7 +106,7 @@
                     connected = true;
                     lock.notifyAll();
 
-                    long expiry = System.currentTimeMillis() + 15000;
+                    long expiry = System.currentTimeMillis() + 30000;
                     while (!released && !stopped) {
                         long delay = expiry - System.currentTimeMillis();
                         if (delay <= 0) {
