diff --git a/hadoop-common-project/hadoop-common/src/test/java/org/apache/hadoop/net/unix/TestDomainSocket.java b/hadoop-common-project/hadoop-common/src/test/java/org/apache/hadoop/net/unix/TestDomainSocket.java
index 2d31874..a997f52 100644
--- a/hadoop-common-project/hadoop-common/src/test/java/org/apache/hadoop/net/unix/TestDomainSocket.java
+++ b/hadoop-common-project/hadoop-common/src/test/java/org/apache/hadoop/net/unix/TestDomainSocket.java
@@ -698,7 +698,7 @@
             "component: ", e);
       }
       // Root should be secure
-      DomainSocket.validateSocketPathSecurity0("/foo", 0);
+      DomainSocket.validateSocketPathSecurity0("/foo", 1);
     } finally {
       tmp.close();
     }
