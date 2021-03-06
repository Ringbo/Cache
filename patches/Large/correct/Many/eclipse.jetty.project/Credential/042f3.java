diff --git a/jetty-util/src/main/java/org/eclipse/jetty/util/security/Credential.java b/jetty-util/src/main/java/org/eclipse/jetty/util/security/Credential.java
index 77692d3..020a5a7 100644
--- a/jetty-util/src/main/java/org/eclipse/jetty/util/security/Credential.java
+++ b/jetty-util/src/main/java/org/eclipse/jetty/util/security/Credential.java
@@ -84,9 +84,9 @@
             return true;
         if (s1 == null || s2 == null || s1.length() != s2.length())
             return false;
-        boolean result = false;
+        boolean result = true;
         for (int i = 0; i < s1.length(); i++)
-            result |= s1.charAt(i) == s2.charAt(i);
+            result &= s1.charAt(i) == s2.charAt(i);
         return result;
     }
 
@@ -103,9 +103,9 @@
             return true;
         if (b1 == null || b2 == null || b1.length != b2.length)
             return false;
-        boolean result = false;
+        boolean result = true;
         for (int i = 0; i < b1.length; i++)
-            result |= b1[i] == b2[i];
+            result &= b1[i] == b2[i];
         return result;
     }
 
