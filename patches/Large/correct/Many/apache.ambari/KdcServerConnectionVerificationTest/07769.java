diff --git a/ambari-server/src/test/java/org/apache/ambari/server/api/rest/KdcServerConnectionVerificationTest.java b/ambari-server/src/test/java/org/apache/ambari/server/api/rest/KdcServerConnectionVerificationTest.java
index 6624506..18a4c0a 100644
--- a/ambari-server/src/test/java/org/apache/ambari/server/api/rest/KdcServerConnectionVerificationTest.java
+++ b/ambari-server/src/test/java/org/apache/ambari/server/api/rest/KdcServerConnectionVerificationTest.java
@@ -134,7 +134,7 @@
     assertEquals(11111, kdcConfig.getKdcPort());
     assertEquals(10 * 1000, kdcConfig.getTimeout());
 
-    verify(connection, exception, error);
+    verify(connection, exception);
   }
 
   @Test
@@ -229,7 +229,7 @@
     assertEquals(11111, kdcConfig.getKdcPort());
     assertEquals(10 * 1000, kdcConfig.getTimeout());
 
-    verify(connection, exception, error);
+    verify(connection, exception);
   }
 
   @Test
@@ -280,7 +280,7 @@
     assertEquals(11111, kdcConfig.getKdcPort());
     assertEquals(10 * 1000, kdcConfig.getTimeout());
 
-    verify(connection, exception, error);
+    verify(connection, exception);
   }
 
   @Test
@@ -375,7 +375,7 @@
     assertEquals(11111, kdcConfig.getKdcPort());
     assertEquals(10 * 1000, kdcConfig.getTimeout());
 
-    verify(connection, exception, error);
+    verify(connection, exception);
   }
 
   @Test
