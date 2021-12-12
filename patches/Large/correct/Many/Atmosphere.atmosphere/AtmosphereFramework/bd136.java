diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
index f37bbf5..a210f30 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
@@ -625,7 +625,7 @@
 
         try {
             // Check auto supported one
-            if (broadcasterClassName.equalsIgnoreCase(DefaultBroadcaster.class.getName())) {
+            if (!broadcasterClassName.equalsIgnoreCase(DefaultBroadcaster.class.getName())) {
                 broadcasterClassName = lookupDefaultBroadcasterType(broadcasterClassName);
             }
 
