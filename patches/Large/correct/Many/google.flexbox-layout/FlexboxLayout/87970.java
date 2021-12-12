diff --git a/flexbox/src/main/java/com/google/android/flexbox/FlexboxLayout.java b/flexbox/src/main/java/com/google/android/flexbox/FlexboxLayout.java
index 7762a7a..e82c0b0 100644
--- a/flexbox/src/main/java/com/google/android/flexbox/FlexboxLayout.java
+++ b/flexbox/src/main/java/com/google/android/flexbox/FlexboxLayout.java
@@ -476,7 +476,7 @@
 
     @NonNull
     private List<Order> createOrders(int childCount) {
-        List<Order> orders = new ArrayList<>();
+        List<Order> orders = new ArrayList<>(childCount);
         for (int i = 0; i < childCount; i++) {
             View child = getChildAt(i);
             LayoutParams params = (LayoutParams) child.getLayoutParams();
