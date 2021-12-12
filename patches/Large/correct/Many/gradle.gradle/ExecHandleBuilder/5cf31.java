diff --git a/subprojects/gradle-core/src/main/groovy/org/gradle/util/exec/ExecHandleBuilder.java b/subprojects/gradle-core/src/main/groovy/org/gradle/util/exec/ExecHandleBuilder.java
index 710a4b9..3b78805 100644
--- a/subprojects/gradle-core/src/main/groovy/org/gradle/util/exec/ExecHandleBuilder.java
+++ b/subprojects/gradle-core/src/main/groovy/org/gradle/util/exec/ExecHandleBuilder.java
@@ -192,7 +192,7 @@
 
     public ExecHandleBuilder standardOutput(OutputStream outputStream) {
         if ( outputStream == null ) throw new IllegalArgumentException("outputStream == null!");
-        this.standardOutputHandle = new StreamWriterExecOutputHandle(outputStream);
+        this.standardOutputHandle = new StreamWriterExecOutputHandle(outputStream, true);
         return this;
     }
 
@@ -204,7 +204,7 @@
 
     public ExecHandleBuilder errorOutput(OutputStream outputStream) {
         if ( outputStream == null ) throw new IllegalArgumentException("outputStream == null!");
-        this.errorOutputHandle = new StreamWriterExecOutputHandle(outputStream);
+        this.errorOutputHandle = new StreamWriterExecOutputHandle(outputStream, true);
         return this;
     }
 
