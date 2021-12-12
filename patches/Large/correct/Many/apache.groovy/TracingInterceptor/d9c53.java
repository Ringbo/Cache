diff --git a/src/main/groovy/lang/TracingInterceptor.java b/src/main/groovy/lang/TracingInterceptor.java
index 84fc40b..9b9d2dd 100644
--- a/src/main/groovy/lang/TracingInterceptor.java
+++ b/src/main/groovy/lang/TracingInterceptor.java
@@ -82,7 +82,7 @@
         return true;
     }
     private String indent(){
-        StringBuffer result = new StringBuffer();
+        StringBuilder result = new StringBuilder();
         for (int i=0; i<indent;i++){
             result.append("  ");
         }
