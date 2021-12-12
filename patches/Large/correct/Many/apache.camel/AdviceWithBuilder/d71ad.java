diff --git a/camel-core/src/main/java/org/apache/camel/builder/AdviceWithBuilder.java b/camel-core/src/main/java/org/apache/camel/builder/AdviceWithBuilder.java
index b89ffa5..403d744 100644
--- a/camel-core/src/main/java/org/apache/camel/builder/AdviceWithBuilder.java
+++ b/camel-core/src/main/java/org/apache/camel/builder/AdviceWithBuilder.java
@@ -149,7 +149,7 @@
         } else if (toString != null) {
             builder.getAdviceWithTasks().add(AdviceWithTasks.removeByToString(route, toString, selectLast, selectFirst, selectFrom, selectTo, maxDeep));
         } else if (type != null) {
-            builder.getAdviceWithTasks().add(AdviceWithTasks.removeByType(route, type, selectFirst, selectFirst, selectFrom, selectTo, maxDeep));
+            builder.getAdviceWithTasks().add(AdviceWithTasks.removeByType(route, type, selectFirst, selectLast, selectFrom, selectTo, maxDeep));
         }
     }
 
