diff --git a/src/protocol/jdbc/org/apache/jmeter/protocol/jdbc/config/DataSourceElement.java b/src/protocol/jdbc/org/apache/jmeter/protocol/jdbc/config/DataSourceElement.java
index 5d77751..91e5aa6 100644
--- a/src/protocol/jdbc/org/apache/jmeter/protocol/jdbc/config/DataSourceElement.java
+++ b/src/protocol/jdbc/org/apache/jmeter/protocol/jdbc/config/DataSourceElement.java
@@ -299,7 +299,7 @@
                             isolation, System.identityHashCode(dsc));
                 } catch (SQLException ex) {
                     log.error("Could not set transaction isolation: {}@{}", 
-                            isolation, System.identityHashCode(dsc));
+                            isolation, System.identityHashCode(dsc), ex);
                 }   
             }
 
