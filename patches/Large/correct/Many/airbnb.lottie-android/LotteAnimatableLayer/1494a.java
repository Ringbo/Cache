diff --git a/lotte/src/main/java/com/airbnb/lotte/layers/LotteAnimatableLayer.java b/lotte/src/main/java/com/airbnb/lotte/layers/LotteAnimatableLayer.java
index 122f799..5cb8420 100644
--- a/lotte/src/main/java/com/airbnb/lotte/layers/LotteAnimatableLayer.java
+++ b/lotte/src/main/java/com/airbnb/lotte/layers/LotteAnimatableLayer.java
@@ -72,7 +72,7 @@
             }
         }
         if (transform != null && transform.getValue() != null) {
-            if (transform.getValue().getScaleX() != 0f || transform.getValue().getScaleY() != 0f) {
+            if (transform.getValue().getScaleX() != 1f || transform.getValue().getScaleY() != 1f) {
                 canvas.scale(transform.getValue().getScaleX(), transform.getValue().getScaleY());
             }
         }
