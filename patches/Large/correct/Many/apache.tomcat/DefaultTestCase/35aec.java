diff --git a/modules/jdbc-pool/test/org/apache/tomcat/jdbc/test/DefaultTestCase.java b/modules/jdbc-pool/test/org/apache/tomcat/jdbc/test/DefaultTestCase.java
index 148c1a8..3821ff9 100644
--- a/modules/jdbc-pool/test/org/apache/tomcat/jdbc/test/DefaultTestCase.java
+++ b/modules/jdbc-pool/test/org/apache/tomcat/jdbc/test/DefaultTestCase.java
@@ -70,7 +70,7 @@
             BasicDataSourceFactory factory = new BasicDataSourceFactory();
             Properties p = new Properties();
 
-            for (int i=0; i<this.ALL_PROPERTIES.length; i++) {
+            for (int i=0; i< ALL_PROPERTIES.length; i++) {
                 String name = "get" + Character.toUpperCase(ALL_PROPERTIES[i].charAt(0)) + ALL_PROPERTIES[i].substring(1);
                 String bname = "is" + name.substring(3);
                 Method get = null;
@@ -90,7 +90,7 @@
                        }
                 }
             }
-            tDatasource = (BasicDataSource)factory.createDataSource(p);
+            tDatasource = (BasicDataSource) BasicDataSourceFactory.createDataSource(p);
         }catch (Exception x) {
             x.printStackTrace();
         }
