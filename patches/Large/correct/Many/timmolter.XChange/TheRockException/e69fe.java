diff --git a/xchange-therock/src/main/java/org/knowm/xchange/therock/dto/TheRockException.java b/xchange-therock/src/main/java/org/knowm/xchange/therock/dto/TheRockException.java
index c414e02..4d70d2c 100644
--- a/xchange-therock/src/main/java/org/knowm/xchange/therock/dto/TheRockException.java
+++ b/xchange-therock/src/main/java/org/knowm/xchange/therock/dto/TheRockException.java
@@ -30,7 +30,7 @@
   public static class Error {
     private String message;
     private Integer code;
-    private Map<String, String> meta;
+    private Map<String, Object> meta;
 
     public String getMessage() {
       return message;
@@ -40,7 +40,7 @@
       return code;
     }
 
-    public Map<String, String> getMeta() {
+    public Map<String, Object> getMeta() {
       return meta;
     }
 
