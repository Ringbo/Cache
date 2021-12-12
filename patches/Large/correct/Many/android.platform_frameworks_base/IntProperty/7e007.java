diff --git a/core/java/android/util/IntProperty.java b/core/java/android/util/IntProperty.java
index 459d6b2..17977ca 100644
--- a/core/java/android/util/IntProperty.java
+++ b/core/java/android/util/IntProperty.java
@@ -42,7 +42,7 @@
 
     @Override
     final public void set(T object, Integer value) {
-        set(object, value.intValue());
+        setValue(object, value.intValue());
     }
 
 }
\ No newline at end of file
