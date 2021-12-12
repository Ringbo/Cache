diff --git a/subprojects/core/src/main/groovy/org/gradle/util/DeprecationLogger.java b/subprojects/core/src/main/groovy/org/gradle/util/DeprecationLogger.java
index 96b2ef9..6d1c40e 100755
--- a/subprojects/core/src/main/groovy/org/gradle/util/DeprecationLogger.java
+++ b/subprojects/core/src/main/groovy/org/gradle/util/DeprecationLogger.java
@@ -90,15 +90,15 @@
     }
     
     public static <T> T whileDisabled(Factory<T> factory) {
-        enabled.set(false);
+        ENABLED.set(false);
         try {
             return factory.create();
         } finally {
-            enabled.set(true);
+            ENABLED.set(true);
         }
     }
     
     private static boolean isEnabled() {
-        return enabled.get();
+        return ENABLED.get();
     }
 }
