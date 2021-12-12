diff --git a/src/main/groovy/lang/MetaClass.java b/src/main/groovy/lang/MetaClass.java
index bed5935..37fa96e 100644
--- a/src/main/groovy/lang/MetaClass.java
+++ b/src/main/groovy/lang/MetaClass.java
@@ -856,7 +856,7 @@
                 // just rethrow it; there's nothing left to do here
                 throw e;
             }
-            catch (TypeMissMatchException e) {
+            catch (TypeMismatchException e) {
                 // tried to access to mismatched object.
                 throw e;
             }
