diff --git a/src/java/org/jivesoftware/openfire/net/ServerTrafficCounter.java b/src/java/org/jivesoftware/openfire/net/ServerTrafficCounter.java
index 624d2a7..1df2937 100644
--- a/src/java/org/jivesoftware/openfire/net/ServerTrafficCounter.java
+++ b/src/java/org/jivesoftware/openfire/net/ServerTrafficCounter.java
@@ -143,7 +143,7 @@
 
             public double sample() {
                 // Divide result by 1024 so that we return the result in Kb.
-                return incomingCounter.getAndSet(0)/1024;
+                return incomingCounter.getAndSet(0)/1024d;
             }
 
             public boolean isPartialSample() {
@@ -174,7 +174,7 @@
             }
 
             public double sample() {
-                return outgoingCounter.getAndSet(0)/1024;
+                return outgoingCounter.getAndSet(0)/1024d;
             }
 
             public boolean isPartialSample() {
