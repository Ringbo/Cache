diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
index 71b08fa..2e9c1de 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereFramework.java
@@ -1334,7 +1334,7 @@
                 broadcasterClassName = lookupDefaultBroadcasterType(broadcasterClassName);
             }
 
-            if (broadcasterFactoryClassName != null) {
+            if (broadcasterFactoryClassName != null && broadcasterFactory == null) {
                 broadcasterFactory = newClassInstance(BroadcasterFactory.class,
                         (Class<BroadcasterFactory>) IOUtils.loadClass(getClass(), broadcasterFactoryClassName));
                 Class<? extends Broadcaster> bc =
