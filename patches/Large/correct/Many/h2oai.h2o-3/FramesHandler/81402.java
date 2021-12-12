diff --git a/h2o-core/src/main/java/water/api/FramesHandler.java b/h2o-core/src/main/java/water/api/FramesHandler.java
index 8d5490f..cdb9434 100644
--- a/h2o-core/src/main/java/water/api/FramesHandler.java
+++ b/h2o-core/src/main/java/water/api/FramesHandler.java
@@ -69,7 +69,7 @@
         // Weed out frames with vecs that are no longer in DKV
         boolean skip = false;
         for( Vec vec : frame.vecs() ) {
-          if (DKV.get(vec._key) == null) {
+          if (vec == null || DKV.get(vec._key) == null) {
             Log.warn("Leaked frame: Frame "+frame._key+" points to one or more deleted vecs.");
             skip = true;
             break;
