diff --git a/java/org/apache/catalina/core/StandardContext.java b/java/org/apache/catalina/core/StandardContext.java
index b285820..41f0617 100644
--- a/java/org/apache/catalina/core/StandardContext.java
+++ b/java/org/apache/catalina/core/StandardContext.java
@@ -5478,7 +5478,7 @@
             
             Thread t = new Thread(stop);
             t.setName("stop children - " + getObjectName().toString());
-            t.run();
+            t.start();
             try {
                 t.join();
             } catch (InterruptedException e) {
