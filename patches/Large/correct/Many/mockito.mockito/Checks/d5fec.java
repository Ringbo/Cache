diff --git a/src/main/java/org/mockito/internal/util/Checks.java b/src/main/java/org/mockito/internal/util/Checks.java
index 00ed8a8..acb8e91 100644
--- a/src/main/java/org/mockito/internal/util/Checks.java
+++ b/src/main/java/org/mockito/internal/util/Checks.java
@@ -12,7 +12,7 @@
 
     public static <T> T checkNotNull(T value, String checkedValue) {
         if(value == null) {
-            throw new NullPointerException(checkedValue + " should not be null");
+            throw new IllegalArgumentException(checkedValue + " should not be null");
         }
         return value;
     }
