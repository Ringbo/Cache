diff --git a/java/org/apache/tomcat/util/descriptor/web/FilterMap.java b/java/org/apache/tomcat/util/descriptor/web/FilterMap.java
index 766f65d..c432d95 100644
--- a/java/org/apache/tomcat/util/descriptor/web/FilterMap.java
+++ b/java/org/apache/tomcat/util/descriptor/web/FilterMap.java
@@ -178,19 +178,19 @@
 
     public String[] getDispatcherNames() {
         List<String> result = new ArrayList<>();
-        if ((dispatcherMapping & FORWARD) > 0) {
+        if ((dispatcherMapping & FORWARD) != 0) {
             result.add(DispatcherType.FORWARD.name());
         }
-        if ((dispatcherMapping & INCLUDE) > 0) {
+        if ((dispatcherMapping & INCLUDE) != 0) {
             result.add(DispatcherType.INCLUDE.name());
         }
-        if ((dispatcherMapping & REQUEST) > 0) {
+        if ((dispatcherMapping & REQUEST) != 0) {
             result.add(DispatcherType.REQUEST.name());
         }
-        if ((dispatcherMapping & ERROR) > 0) {
+        if ((dispatcherMapping & ERROR) != 0) {
             result.add(DispatcherType.ERROR.name());
         }
-        if ((dispatcherMapping & ASYNC) > 0) {
+        if ((dispatcherMapping & ASYNC) != 0) {
             result.add(DispatcherType.ASYNC.name());
         }
         return result.toArray(new String[result.size()]);
