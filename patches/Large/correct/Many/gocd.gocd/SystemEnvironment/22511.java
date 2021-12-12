diff --git a/base/src/com/thoughtworks/go/util/SystemEnvironment.java b/base/src/com/thoughtworks/go/util/SystemEnvironment.java
index 2416ca2..e1cb1bc 100644
--- a/base/src/com/thoughtworks/go/util/SystemEnvironment.java
+++ b/base/src/com/thoughtworks/go/util/SystemEnvironment.java
@@ -593,7 +593,7 @@
 
     public boolean enforceFanInFallbackBehaviour() {
         if (enforceFanInFallbackTriangle == null) {
-            enforceFanInFallbackTriangle = CONFIGURATION_YES.equals(getPropertyImpl(RESOLVE_FANIN_FALLBACK_TRIANGLE, CONFIGURATION_YES));
+            enforceFanInFallbackTriangle = CONFIGURATION_YES.equals(getPropertyImpl(RESOLVE_FANIN_FALLBACK_TRIANGLE, CONFIGURATION_NO));
         }
         return enforceFanInFallbackTriangle;
     }
