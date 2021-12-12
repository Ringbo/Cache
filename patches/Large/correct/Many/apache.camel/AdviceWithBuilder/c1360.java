diff --git a/camel-core/src/main/java/org/apache/camel/builder/AdviceWithBuilder.java b/camel-core/src/main/java/org/apache/camel/builder/AdviceWithBuilder.java
index 403d744..75d643d 100644
--- a/camel-core/src/main/java/org/apache/camel/builder/AdviceWithBuilder.java
+++ b/camel-core/src/main/java/org/apache/camel/builder/AdviceWithBuilder.java
@@ -147,7 +147,7 @@
         if (id != null) {
             builder.getAdviceWithTasks().add(AdviceWithTasks.removeById(route, id, selectFirst, selectLast, selectFrom, selectTo, maxDeep));
         } else if (toString != null) {
-            builder.getAdviceWithTasks().add(AdviceWithTasks.removeByToString(route, toString, selectLast, selectFirst, selectFrom, selectTo, maxDeep));
+            builder.getAdviceWithTasks().add(AdviceWithTasks.removeByToString(route, toString, selectFirst, selectLast, selectFrom, selectTo, maxDeep));
         } else if (type != null) {
             builder.getAdviceWithTasks().add(AdviceWithTasks.removeByType(route, type, selectFirst, selectLast, selectFrom, selectTo, maxDeep));
         }
@@ -164,7 +164,7 @@
         if (id != null) {
             builder.getAdviceWithTasks().add(AdviceWithTasks.beforeById(route, id, answer, selectFirst, selectLast, selectFrom, selectTo, maxDeep));
         } else if (toString != null) {
-            builder.getAdviceWithTasks().add(AdviceWithTasks.beforeByToString(route, toString, answer, selectLast, selectFirst, selectFrom, selectTo, maxDeep));
+            builder.getAdviceWithTasks().add(AdviceWithTasks.beforeByToString(route, toString, answer, selectFirst, selectLast, selectFrom, selectTo, maxDeep));
         } else if (type != null) {
             builder.getAdviceWithTasks().add(AdviceWithTasks.beforeByType(route, type, answer, selectFirst, selectLast, selectFrom, selectTo, maxDeep));
         }
@@ -182,7 +182,7 @@
         if (id != null) {
             builder.getAdviceWithTasks().add(AdviceWithTasks.afterById(route, id, answer, selectFirst, selectLast, selectFrom, selectTo, maxDeep));
         } else if (toString != null) {
-            builder.getAdviceWithTasks().add(AdviceWithTasks.afterByToString(route, toString, answer, selectLast, selectFirst, selectFrom, selectTo, maxDeep));
+            builder.getAdviceWithTasks().add(AdviceWithTasks.afterByToString(route, toString, answer, selectFirst, selectLast, selectFrom, selectTo, maxDeep));
         } else if (type != null) {
             builder.getAdviceWithTasks().add(AdviceWithTasks.afterByType(route, type, answer, selectFirst, selectLast, selectFrom, selectTo, maxDeep));
         }
