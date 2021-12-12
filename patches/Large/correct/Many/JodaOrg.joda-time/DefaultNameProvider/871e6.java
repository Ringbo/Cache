diff --git a/src/main/java/org/joda/time/tz/DefaultNameProvider.java b/src/main/java/org/joda/time/tz/DefaultNameProvider.java
index 97b3844..4af4f39 100644
--- a/src/main/java/org/joda/time/tz/DefaultNameProvider.java
+++ b/src/main/java/org/joda/time/tz/DefaultNameProvider.java
@@ -70,7 +70,7 @@
             String[][] zoneStringsEn = DateTimeUtils.getDateFormatSymbols(Locale.ENGLISH).getZoneStrings();
             String[] setEn = null;
             for (String[] strings : zoneStringsEn) {
-                if (strings != null && strings.length == 5 && id.equals(strings[0])) {
+                if (strings != null && strings.length >= 5 && id.equals(strings[0])) {
                     setEn = strings;
                     break;
                 }
@@ -78,7 +78,7 @@
             String[][] zoneStringsLoc = DateTimeUtils.getDateFormatSymbols(locale).getZoneStrings();
             String[] setLoc = null;
             for (String[] strings : zoneStringsLoc) {
-                if (strings != null && strings.length == 5 && id.equals(strings[0])) {
+                if (strings != null && strings.length >= 5 && id.equals(strings[0])) {
                     setLoc = strings;
                     break;
                 }
@@ -132,7 +132,7 @@
             String[][] zoneStringsEn = DateTimeUtils.getDateFormatSymbols(Locale.ENGLISH).getZoneStrings();
             String[] setEn = null;
             for (String[] strings : zoneStringsEn) {
-                if (strings != null && strings.length == 5 && id.equals(strings[0])) {
+                if (strings != null && strings.length >= 5 && id.equals(strings[0])) {
                     setEn = strings;
                     break;
                 }
@@ -140,7 +140,7 @@
             String[][] zoneStringsLoc = DateTimeUtils.getDateFormatSymbols(locale).getZoneStrings();
             String[] setLoc = null;
             for (String[] strings : zoneStringsLoc) {
-                if (strings != null && strings.length == 5 && id.equals(strings[0])) {
+                if (strings != null && strings.length >= 5 && id.equals(strings[0])) {
                     setLoc = strings;
                     break;
                 }
