diff --git a/src/org/odk/collect/android/widgets/ItemsetWidget.java b/src/org/odk/collect/android/widgets/ItemsetWidget.java
index b318707..4bf58e2 100644
--- a/src/org/odk/collect/android/widgets/ItemsetWidget.java
+++ b/src/org/odk/collect/android/widgets/ItemsetWidget.java
@@ -106,7 +106,7 @@
         ArrayList<String> arguments = new ArrayList<String>();
         while ((andIndex = queryString.indexOf(" and ")) != -1
                 || (orIndex = queryString.indexOf(" or ")) != -1) {
-            if (andIndex != 1) {
+            if (andIndex != -1) {
                 String subString = queryString.substring(0, andIndex);
                 String pair[] = subString.split("=");
                 if (pair.length == 2) {
@@ -118,7 +118,7 @@
                 // move string forward to after " and "
                 queryString = queryString.substring(andIndex + 5, queryString.length());
                 andIndex = -1;
-            } else if (orIndex != 1) {
+            } else if (orIndex != -1) {
                 String subString = queryString.substring(0, orIndex);
                 String pair[] = subString.split("=");
                 if (pair.length == 2) {
