diff --git a/sonar-gwt-api/src/main/java/org/sonar/gwt/Utils.java b/sonar-gwt-api/src/main/java/org/sonar/gwt/Utils.java
index 4b62050..d2a0f87 100644
--- a/sonar-gwt-api/src/main/java/org/sonar/gwt/Utils.java
+++ b/sonar-gwt-api/src/main/java/org/sonar/gwt/Utils.java
@@ -66,14 +66,14 @@
    * @since 2.5
    */
   public static String formatDate(Date date) {
-    return date == null ? "" : DateTimeFormat.getFormat("dd/MM/yy").format(date);
+    return date == null ? "" : DateTimeFormat.getShortDateFormat().format(date);
   }
   
   /**
    * @since 2.5
    */
   public static String formatDateTime(Date date) {
-    return date == null ? "" : DateTimeFormat.getFormat("dd/MM/yy HH:mm").format(date);
+    return date == null ? "" : DateTimeFormat.getShortDateTimeFormat().format(date);
   }
 
   public static native void showError(String message) /*-{
