diff --git a/src/main/java/junit/framework/TestSuite.java b/src/main/java/junit/framework/TestSuite.java
index e2acc9d..0c629da 100644
--- a/src/main/java/junit/framework/TestSuite.java
+++ b/src/main/java/junit/framework/TestSuite.java
@@ -87,7 +87,7 @@
         } catch (NoSuchMethodException e) {
             // fall through
         }
-        return theClass.getConstructor(new Class[0]);
+        return theClass.getConstructor();
     }
 
     /**
