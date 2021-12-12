diff --git a/src/main/java/com/radiadesign/catalina/session/RedisSession.java b/src/main/java/com/radiadesign/catalina/session/RedisSession.java
index 06706c6..fab8e3e 100644
--- a/src/main/java/com/radiadesign/catalina/session/RedisSession.java
+++ b/src/main/java/com/radiadesign/catalina/session/RedisSession.java
@@ -36,7 +36,7 @@
   public void setAttribute(String key, Object value) {
     Object oldValue = getAttribute(key);
     if ( value == null && oldValue != null
-         || oldValue != null && value == null
+         || oldValue == null && value != null
          || !value.getClass().isInstance(oldValue)
          || !value.equals(oldValue) ) {
       changedAttributes.put(key, value);
