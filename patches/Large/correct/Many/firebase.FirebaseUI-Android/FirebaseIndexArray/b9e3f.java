diff --git a/database/src/main/java/com/firebase/ui/database/FirebaseIndexArray.java b/database/src/main/java/com/firebase/ui/database/FirebaseIndexArray.java
index a535371..0084703 100644
--- a/database/src/main/java/com/firebase/ui/database/FirebaseIndexArray.java
+++ b/database/src/main/java/com/firebase/ui/database/FirebaseIndexArray.java
@@ -110,7 +110,7 @@
 
     @Override
     public void onDataChanged() {
-        if (mHasPendingMoveOrDelete) {
+        if (mHasPendingMoveOrDelete || mKeySnapshots.isEmpty()) {
             notifyListenersOnDataChanged();
             mHasPendingMoveOrDelete = false;
         }
