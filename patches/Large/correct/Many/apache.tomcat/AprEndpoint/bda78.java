diff --git a/java/org/apache/tomcat/util/net/AprEndpoint.java b/java/org/apache/tomcat/util/net/AprEndpoint.java
index 2dec326..a921570 100644
--- a/java/org/apache/tomcat/util/net/AprEndpoint.java
+++ b/java/org/apache/tomcat/util/net/AprEndpoint.java
@@ -1639,7 +1639,7 @@
                             removeList.clear();
                         }
                     } else {
-                        localAddList.clear();
+                        localRemoveList.clear();
                     }
                     if (addList.size() > 0) {
                         synchronized (this) {
