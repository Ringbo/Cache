diff --git a/library/src/main/java/com/yalantis/guillotine/util/GuillotineInterpolator.java b/library/src/main/java/com/yalantis/guillotine/util/GuillotineInterpolator.java
index 636dc30..2e53c4a 100644
--- a/library/src/main/java/com/yalantis/guillotine/util/GuillotineInterpolator.java
+++ b/library/src/main/java/com/yalantis/guillotine/util/GuillotineInterpolator.java
@@ -30,6 +30,6 @@
     }
 
     private float secondBounce(float t) {
-        return 0.625f * t * t - 1.08f * t + 1.458f;
+        return 0.625f * t * t - 1.083f * t + 1.458f;
     }
 }
