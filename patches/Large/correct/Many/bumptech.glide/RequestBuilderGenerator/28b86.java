diff --git a/annotation/compiler/src/main/java/com/bumptech/glide/annotation/compiler/RequestBuilderGenerator.java b/annotation/compiler/src/main/java/com/bumptech/glide/annotation/compiler/RequestBuilderGenerator.java
index 077b092..26cb001 100644
--- a/annotation/compiler/src/main/java/com/bumptech/glide/annotation/compiler/RequestBuilderGenerator.java
+++ b/annotation/compiler/src/main/java/com/bumptech/glide/annotation/compiler/RequestBuilderGenerator.java
@@ -345,7 +345,7 @@
           }
         }).contains(Override.class.getCanonicalName())
         && requestOptionMethod.returnType.toString()
-            .equals(requestOptionMethod.toString());
+            .equals(requestOptionsClassName.toString());
   }
 
    /**
