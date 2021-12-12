diff --git a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/crypto/key/KeyShell.java b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/crypto/key/KeyShell.java
index 3ed9da4..e0ca624 100644
--- a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/crypto/key/KeyShell.java
+++ b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/crypto/key/KeyShell.java
@@ -298,7 +298,7 @@
         }
       } catch (IOException e) {
         out.println("Cannot list keys for KeyProvider: " + provider
-            + ": " + e.getMessage());
+            + ": " + e.toString());
         throw e;
       }
     }
@@ -350,12 +350,12 @@
           printProviderWritten();
         } catch (NoSuchAlgorithmException e) {
           out.println("Cannot roll key: " + keyName + " within KeyProvider: "
-              + provider);
+              + provider + ". " + e.toString());
           throw e;
         }
       } catch (IOException e1) {
         out.println("Cannot roll key: " + keyName + " within KeyProvider: "
-            + provider);
+            + provider + ". " + e1.toString());
         throw e1;
       }
     }
@@ -422,7 +422,7 @@
           out.println(keyName + " has been successfully deleted.");
           printProviderWritten();
         } catch (IOException e) {
-          out.println(keyName + " has not been deleted.");
+          out.println(keyName + " has not been deleted. " + e.toString());
           throw e;
         }
       }
@@ -484,13 +484,13 @@
             + options.toString() + ".");
         printProviderWritten();
       } catch (InvalidParameterException e) {
-        out.println(keyName + " has not been created. " + e.getMessage());
+        out.println(keyName + " has not been created. " + e.toString());
         throw e;
       } catch (IOException e) {
-        out.println(keyName + " has not been created. " + e.getMessage());
+        out.println(keyName + " has not been created. " + e.toString());
         throw e;
       } catch (NoSuchAlgorithmException e) {
-        out.println(keyName + " has not been created. " + e.getMessage());
+        out.println(keyName + " has not been created. " + e.toString());
         throw e;
       }
     }
