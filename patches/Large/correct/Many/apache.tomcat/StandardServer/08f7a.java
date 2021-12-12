diff --git a/java/org/apache/catalina/core/StandardServer.java b/java/org/apache/catalina/core/StandardServer.java
index 3c7099c..184972f 100644
--- a/java/org/apache/catalina/core/StandardServer.java
+++ b/java/org/apache/catalina/core/StandardServer.java
@@ -420,7 +420,7 @@
             int expected = 1024; // Cut off to avoid DoS attack
             while (expected < shutdown.length()) {
                 if (random == null)
-                    random = new Random(System.currentTimeMillis());
+                    random = new Random();
                 expected += (random.nextInt() % 1024);
             }
             while (expected > 0) {
