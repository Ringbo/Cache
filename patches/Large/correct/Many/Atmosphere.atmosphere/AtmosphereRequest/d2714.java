diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereRequest.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereRequest.java
index f9ff11c..b02b0e3 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereRequest.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereRequest.java
@@ -691,7 +691,7 @@
     /**
      * {@inheritDoc}
      */
-    @Overridee
+    @Override
     public void removeAttribute(String name) {
         b.localAttributes.remove(name);
         if (isNotNoOps()) {
