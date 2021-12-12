diff --git a/moshi/src/main/java/com/squareup/moshi/Types.java b/moshi/src/main/java/com/squareup/moshi/Types.java
index 6722654..350d34d 100644
--- a/moshi/src/main/java/com/squareup/moshi/Types.java
+++ b/moshi/src/main/java/com/squareup/moshi/Types.java
@@ -205,7 +205,7 @@
   }
 
   /** Returns true if {@code a} and {@code b} are equal. */
-  static boolean equals(Type a, Type b) {
+  public static boolean equals(Type a, Type b) {
     if (a == b) {
       return true; // Also handles (a == null && b == null).
 
