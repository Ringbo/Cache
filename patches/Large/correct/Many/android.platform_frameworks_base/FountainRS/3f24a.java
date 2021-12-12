diff --git a/libs/rs/java/Fountain/src/com/android/fountain/FountainRS.java b/libs/rs/java/Fountain/src/com/android/fountain/FountainRS.java
index eb46e950..0afff34 100644
--- a/libs/rs/java/Fountain/src/com/android/fountain/FountainRS.java
+++ b/libs/rs/java/Fountain/src/com/android/fountain/FountainRS.java
@@ -53,7 +53,7 @@
 
     boolean holdingColor[] = new boolean[10];
     public void newTouchPosition(float x, float y, float pressure, int id) {
-        if (id > holdingColor.length) {
+        if (id >= holdingColor.length) {
             return;
         }
         int rate = (int)(pressure * pressure * 500.f);
