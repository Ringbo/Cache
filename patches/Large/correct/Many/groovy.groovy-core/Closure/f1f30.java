diff --git a/src/main/groovy/lang/Closure.java b/src/main/groovy/lang/Closure.java
index b8b0f5c..4754189 100644
--- a/src/main/groovy/lang/Closure.java
+++ b/src/main/groovy/lang/Closure.java
@@ -174,7 +174,7 @@
         try {
             if (arguments instanceof Object[]) {
                 Object[] parameters = (Object[]) arguments;
-                if (parameters == null) {
+                if (parameters == null || parameters.length == 0) {
                     return this.doCallMethod.invoke(this, noParameters);
                 }
                 else {
