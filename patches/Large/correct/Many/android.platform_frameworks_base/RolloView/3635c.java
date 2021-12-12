diff --git a/libs/rs/java/Rollo/src/com/android/rollo/RolloView.java b/libs/rs/java/Rollo/src/com/android/rollo/RolloView.java
index 27f1584..c67644b 100644
--- a/libs/rs/java/Rollo/src/com/android/rollo/RolloView.java
+++ b/libs/rs/java/Rollo/src/com/android/rollo/RolloView.java
@@ -101,11 +101,11 @@
 
     void computeSelection(float x, float y)
     {
-        float col = mColumn + (x - 0.5f) * 4 + 1;
+        float col = mColumn + (x - 0.5f) * 4 + 1.25f;
         int iCol = (int)(col + 0.25f);
 
         float row = (y / 0.8f) * mRows;
-        int iRow = (int)(row - 0.25f);
+        int iRow = (int)(row - 0.5f);
 
         mRender.setSelected(iCol * mRows + iRow);
     }
