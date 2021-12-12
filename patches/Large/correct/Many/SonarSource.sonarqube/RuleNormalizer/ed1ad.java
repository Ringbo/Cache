diff --git a/sonar-server/src/main/java/org/sonar/server/rule/index/RuleNormalizer.java b/sonar-server/src/main/java/org/sonar/server/rule/index/RuleNormalizer.java
index f907e99..b96b5c8 100644
--- a/sonar-server/src/main/java/org/sonar/server/rule/index/RuleNormalizer.java
+++ b/sonar-server/src/main/java/org/sonar/server/rule/index/RuleNormalizer.java
@@ -64,7 +64,7 @@
           try {
             fields.add(IndexField.class.cast(classField.get(null)));
           } catch (IllegalAccessException e) {
-            throw new IllegalStateException("Could not access Field '" + classField.getName() + "'");
+            throw new IllegalStateException("Could not access Field '" + classField.getName() + "'", e);
           }
         }
       }
@@ -126,7 +126,7 @@
           try {
             fields.add(IndexField.class.cast(classField.get(null)));
           } catch (IllegalAccessException e) {
-            throw new IllegalStateException("Could not access Field '" + classField.getName() + "'");
+            throw new IllegalStateException("Could not access Field '" + classField.getName() + "'", e);
           }
         }
       }
