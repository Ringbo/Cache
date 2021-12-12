diff --git a/weld/src/main/java/org/jboss/as/weld/util/Reflections.java b/weld/src/main/java/org/jboss/as/weld/util/Reflections.java
index 7beb6dd..b10d7f4 100644
--- a/weld/src/main/java/org/jboss/as/weld/util/Reflections.java
+++ b/weld/src/main/java/org/jboss/as/weld/util/Reflections.java
@@ -57,7 +57,7 @@
     public static <T> Class<T> loadClass(String className, ClassLoader classLoader) {
         try {
             return cast(classLoader.loadClass(className));
-        } catch (Exception e) {
+        } catch (Throwable e) {
             return null;
         }
     }
