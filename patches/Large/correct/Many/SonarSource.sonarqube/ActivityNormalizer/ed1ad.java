diff --git a/sonar-server/src/main/java/org/sonar/server/activity/index/ActivityNormalizer.java b/sonar-server/src/main/java/org/sonar/server/activity/index/ActivityNormalizer.java
index 531caf5..33361c9 100644
--- a/sonar-server/src/main/java/org/sonar/server/activity/index/ActivityNormalizer.java
+++ b/sonar-server/src/main/java/org/sonar/server/activity/index/ActivityNormalizer.java
@@ -66,7 +66,7 @@
           try {
             fields.add(IndexField.class.cast(classField.get(null)));
           } catch (IllegalAccessException e) {
-            throw new IllegalStateException("Could not access Field '" + classField.getName() + "'");
+            throw new IllegalStateException("Could not access Field '" + classField.getName() + "'", e);
           }
         }
       }
