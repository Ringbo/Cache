diff --git a/server/process/sonar-process/src/main/java/org/sonar/process/AesCipher.java b/server/process/sonar-process/src/main/java/org/sonar/process/AesCipher.java
index 11d69a8..204ae1a 100644
--- a/server/process/sonar-process/src/main/java/org/sonar/process/AesCipher.java
+++ b/server/process/sonar-process/src/main/java/org/sonar/process/AesCipher.java
@@ -62,7 +62,7 @@
     } catch (RuntimeException e) {
       throw e;
     } catch (Exception e) {
-      throw new RuntimeException(e);
+      throw new IllegalStateException(e);
     }
   }
 
@@ -76,7 +76,7 @@
     } catch (RuntimeException e) {
       throw e;
     } catch (Exception e) {
-      throw new RuntimeException(e);
+      throw new IllegalStateException(e);
     }
   }
 
