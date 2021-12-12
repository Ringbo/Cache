diff --git a/graal/com.oracle.graal.api.code/src/com/oracle/graal/api/code/BailoutException.java b/graal/com.oracle.graal.api.code/src/com/oracle/graal/api/code/BailoutException.java
index 0f7be40..3e1e705 100644
--- a/graal/com.oracle.graal.api.code/src/com/oracle/graal/api/code/BailoutException.java
+++ b/graal/com.oracle.graal.api.code/src/com/oracle/graal/api/code/BailoutException.java
@@ -42,7 +42,7 @@
      */
     public BailoutException(String format, Object... args) {
         super(String.format(Locale.ENGLISH, format, args));
-        this.permanent = false;
+        this.permanent = true;
     }
 
     /**
