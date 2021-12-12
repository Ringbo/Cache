diff --git a/sonar-server/src/main/java/org/sonar/server/exceptions/BadRequestException.java b/sonar-server/src/main/java/org/sonar/server/exceptions/BadRequestException.java
index 4b6bcc4..58bf7be 100644
--- a/sonar-server/src/main/java/org/sonar/server/exceptions/BadRequestException.java
+++ b/sonar-server/src/main/java/org/sonar/server/exceptions/BadRequestException.java
@@ -60,12 +60,12 @@
     return new BadRequestException(message);
   }
 
-  public static BadRequestException of(@Nullable  String message, List<Message> errors) {
+  public static BadRequestException of(String message, List<Message> errors) {
     return new BadRequestException(message, errors);
   }
 
   public static BadRequestException of(List<Message> errors) {
-    return new BadRequestException(null, errors);
+    return new BadRequestException(null, null, null, errors);
   }
 
   public static BadRequestException ofL10n(String l10nKey, Object... l10nParams) {
