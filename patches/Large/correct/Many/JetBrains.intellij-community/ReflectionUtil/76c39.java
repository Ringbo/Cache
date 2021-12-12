diff --git a/util/src/com/intellij/util/ReflectionUtil.java b/util/src/com/intellij/util/ReflectionUtil.java
index 4fcb21c..433ef08 100644
--- a/util/src/com/intellij/util/ReflectionUtil.java
+++ b/util/src/com/intellij/util/ReflectionUtil.java
@@ -249,11 +249,11 @@
       return field.get(object);
     }
     catch (NoSuchFieldException e) {
-      LOG.info(e);
+      LOG.debug(e);
       return null;
     }
     catch (IllegalAccessException e) {
-      LOG.info(e);
+      LOG.debug(e);
       return null;
     }
   }
