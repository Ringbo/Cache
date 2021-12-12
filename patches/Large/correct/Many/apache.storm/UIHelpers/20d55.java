diff --git a/storm-webapp/src/main/java/org/apache/storm/daemon/ui/UIHelpers.java b/storm-webapp/src/main/java/org/apache/storm/daemon/ui/UIHelpers.java
index 1298b87..ff121ae 100644
--- a/storm-webapp/src/main/java/org/apache/storm/daemon/ui/UIHelpers.java
+++ b/storm-webapp/src/main/java/org/apache/storm/daemon/ui/UIHelpers.java
@@ -1226,7 +1226,7 @@
      * @return nullToZero
      */
     private static Long nullToZero(Long value) {
-        return Objects.isNull(value) ? value : 0;
+        return !Objects.isNull(value) ? value : 0;
     }
 
     /**
@@ -1235,7 +1235,7 @@
      * @return nullToZero
      */
     private static Double nullToZero(Double value) {
-        return Objects.isNull(value) ? value : 0;
+        return !Objects.isNull(value) ? value : 0;
     }
 
     /**
