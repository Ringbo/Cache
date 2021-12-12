diff --git a/src/java/org/jivesoftware/messenger/auth/spi/AuthTokenImpl.java b/src/java/org/jivesoftware/messenger/auth/spi/AuthTokenImpl.java
index e17915a..c8ff43d 100644
--- a/src/java/org/jivesoftware/messenger/auth/spi/AuthTokenImpl.java
+++ b/src/java/org/jivesoftware/messenger/auth/spi/AuthTokenImpl.java
@@ -41,6 +41,6 @@
     }
 
     public boolean isAnonymous() {
-        return username != null;
+        return username == null;
     }
 }
\ No newline at end of file
