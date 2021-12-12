diff --git a/driver-mapping/src/main/java/com/datastax/driver/mapping/AnnotationChecks.java b/driver-mapping/src/main/java/com/datastax/driver/mapping/AnnotationChecks.java
index fab2bf5..8eed2b9 100644
--- a/driver-mapping/src/main/java/com/datastax/driver/mapping/AnnotationChecks.java
+++ b/driver-mapping/src/main/java/com/datastax/driver/mapping/AnnotationChecks.java
@@ -93,7 +93,7 @@
         } catch (IllegalArgumentException e) {
             throw new IllegalArgumentException(String.format("Error while checking frozen types on field %s of %s %s: %s",
                                                              field.getName(), classDescription,
-                                                             field.getDeclaringClass().getName()));
+                                                             field.getDeclaringClass().getName(), e.getMessage()));
         }
     }
 
@@ -172,7 +172,7 @@
     }
 
     private static void checkValidFrozen(Class<?> clazz, boolean declared) {
-        boolean expected = !EXPECTED_NON_FROZEN_CLASSES.contains(clazz);
+        boolean expected = !EXPECTED_NON_FROZEN_CLASSES.contains(clazz) && !clazz.isEnum();
         if (expected != declared)
             throw new IllegalArgumentException(String.format("expected %s to be %sfrozen but was %sfrozen",
                                                              clazz.getSimpleName(),
