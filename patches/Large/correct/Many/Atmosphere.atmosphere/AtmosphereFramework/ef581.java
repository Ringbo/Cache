diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
index f4d2dbb..00cf6ea 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
@@ -175,7 +175,7 @@
             this.atmosphereHandler = atmosphereHandler;
             try {
                 if (BroadcasterFactory.getDefault() != null) {
-                    this.broadcaster = BroadcasterFactory.getDefault().get(mapping);
+                    this.broadcaster = BroadcasterFactory.getDefault().lookup(mapping, true);
                 } else {
                     this.mapping = mapping;
                 }
