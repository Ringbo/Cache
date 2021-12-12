diff --git a/logback-core/src/main/java/ch/qos/logback/core/helpers/Transform.java b/logback-core/src/main/java/ch/qos/logback/core/helpers/Transform.java
index e7777cb..a172580 100644
--- a/logback-core/src/main/java/ch/qos/logback/core/helpers/Transform.java
+++ b/logback-core/src/main/java/ch/qos/logback/core/helpers/Transform.java
@@ -75,7 +75,7 @@
    * @param str
    *          The String that is inserted into an existing CDATA Section.
    */
-  public static void appendEscapingCDATA(StringBuffer output, String str) {
+  public static void appendEscapingCDATA(StringBuilder output, String str) {
     if (str == null) {
       return;
     }
