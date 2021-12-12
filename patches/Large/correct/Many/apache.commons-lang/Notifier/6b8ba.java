diff --git a/src/java/org/apache/commons/lang/Notifier.java b/src/java/org/apache/commons/lang/Notifier.java
index 407d486..7ef8792 100644
--- a/src/java/org/apache/commons/lang/Notifier.java
+++ b/src/java/org/apache/commons/lang/Notifier.java
@@ -83,7 +83,7 @@
             throw new IllegalArgumentException("Illegal to have a null listener Class. ");
         }
         
-        this.clss = clss;
+        this.clss = listener;
         // now we check methods, if only one of them, then 
         // let's set it
         Method[] meths = clss.getDeclaredMethods();
