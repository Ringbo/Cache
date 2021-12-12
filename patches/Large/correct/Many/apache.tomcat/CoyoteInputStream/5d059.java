diff --git a/java/org/apache/catalina/connector/CoyoteInputStream.java b/java/org/apache/catalina/connector/CoyoteInputStream.java
index 9d26cb9..dfdca5b 100644
--- a/java/org/apache/catalina/connector/CoyoteInputStream.java
+++ b/java/org/apache/catalina/connector/CoyoteInputStream.java
@@ -101,7 +101,7 @@
                 if (e instanceof IOException){
                     throw (IOException)e;
                 } else {
-                    throw new RuntimeException(e.getMessage());
+                    throw new RuntimeException(e.getMessage(), e);
                 }
             }
         } else {
@@ -131,7 +131,7 @@
                 if (e instanceof IOException){
                     throw (IOException)e;
                 } else {
-                    throw new RuntimeException(e.getMessage());
+                    throw new RuntimeException(e.getMessage(), e);
                 }
             }
         } else {
@@ -162,7 +162,7 @@
                 if (e instanceof IOException){
                     throw (IOException)e;
                 } else {
-                    throw new RuntimeException(e.getMessage());
+                    throw new RuntimeException(e.getMessage() ,e);
                 }
             }
         } else {
@@ -195,7 +195,7 @@
                 if (e instanceof IOException){
                     throw (IOException)e;
                 } else {
-                    throw new RuntimeException(e.getMessage());
+                    throw new RuntimeException(e.getMessage(), e);
                 }
             }
         } else {
@@ -235,7 +235,7 @@
                 if (e instanceof IOException){
                     throw (IOException)e;
                 } else {
-                    throw new RuntimeException(e.getMessage());
+                    throw new RuntimeException(e.getMessage(), e);
                 }
             }
         } else {
