diff --git a/core/src/test/java/org/springframework/security/core/SpringSecurityCoreVersionTests.java b/core/src/test/java/org/springframework/security/core/SpringSecurityCoreVersionTests.java
index f741bd0..1fd009b 100644
--- a/core/src/test/java/org/springframework/security/core/SpringSecurityCoreVersionTests.java
+++ b/core/src/test/java/org/springframework/security/core/SpringSecurityCoreVersionTests.java
@@ -113,7 +113,7 @@
 
         performChecks();
 
-        verify(logger, times(2)).warn(any());
+        verify(logger, times(1)).warn(any());
     }
 
     @Test
