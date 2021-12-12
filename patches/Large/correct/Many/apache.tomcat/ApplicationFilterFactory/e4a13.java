diff --git a/java/org/apache/catalina/core/ApplicationFilterFactory.java b/java/org/apache/catalina/core/ApplicationFilterFactory.java
index 2b15ac2..e066f94 100644
--- a/java/org/apache/catalina/core/ApplicationFilterFactory.java
+++ b/java/org/apache/catalina/core/ApplicationFilterFactory.java
@@ -260,27 +260,27 @@
     private static boolean matchDispatcher(FilterMap filterMap, DispatcherType type) {
         switch (type) {
             case FORWARD :
-                if ((filterMap.getDispatcherMapping() & FilterMap.FORWARD) > 0) {
+                if ((filterMap.getDispatcherMapping() & FilterMap.FORWARD) != 0) {
                         return true;
                 }
                 break;
             case INCLUDE :
-                if ((filterMap.getDispatcherMapping() & FilterMap.INCLUDE) > 0) {
+                if ((filterMap.getDispatcherMapping() & FilterMap.INCLUDE) != 0) {
                     return true;
                 }
                 break;
             case REQUEST :
-                if ((filterMap.getDispatcherMapping() & FilterMap.REQUEST) > 0) {
+                if ((filterMap.getDispatcherMapping() & FilterMap.REQUEST) != 0) {
                     return true;
                 }
                 break;
             case ERROR :
-                if ((filterMap.getDispatcherMapping() & FilterMap.ERROR) > 0) {
+                if ((filterMap.getDispatcherMapping() & FilterMap.ERROR) != 0) {
                     return true;
                 }
                 break;
             case ASYNC :
-                if ((filterMap.getDispatcherMapping() & FilterMap.ASYNC) > 0) {
+                if ((filterMap.getDispatcherMapping() & FilterMap.ASYNC) != 0) {
                     return true;
                 }
                 break;
