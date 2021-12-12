diff --git a/src/main/java/org/mockito/internal/junit/ExceptionFactory.java b/src/main/java/org/mockito/internal/junit/ExceptionFactory.java
index 3664aea..ee288d6 100644
--- a/src/main/java/org/mockito/internal/junit/ExceptionFactory.java
+++ b/src/main/java/org/mockito/internal/junit/ExceptionFactory.java
@@ -31,7 +31,7 @@
     private static boolean canLoadJunitClass() {
         try {
             JUnitArgsAreDifferent.create("message", "wanted", "actual");
-        } catch (NoClassDefFoundError onlyIfJUnitIsNotAvailable) {
+        } catch (Throwable onlyIfJUnitIsNotAvailable) {
             return false;
         }
         return true;
