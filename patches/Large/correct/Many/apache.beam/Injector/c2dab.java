diff --git a/examples/java8/src/main/java/org/apache/beam/examples/complete/game/injector/Injector.java b/examples/java8/src/main/java/org/apache/beam/examples/complete/game/injector/Injector.java
index b9a3ff2..d9667ad 100644
--- a/examples/java8/src/main/java/org/apache/beam/examples/complete/game/injector/Injector.java
+++ b/examples/java8/src/main/java/org/apache/beam/examples/complete/game/injector/Injector.java
@@ -167,7 +167,7 @@
       return startTimeInMillis;
     }
     long getEndTimeInMillis() {
-      return startTimeInMillis + (expirationPeriod * 60 * 1000);
+      return startTimeInMillis + (expirationPeriod * 60L * 1000L);
     }
     String getRandomUser() {
       int userNum = random.nextInt(numMembers);
