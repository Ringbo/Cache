diff --git a/rt/rs/extensions/search/src/test/java/org/apache/cxf/jaxrs/ext/search/jpa/JPATypedQueryVisitorTest.java b/rt/rs/extensions/search/src/test/java/org/apache/cxf/jaxrs/ext/search/jpa/JPATypedQueryVisitorTest.java
index f0c0fc1..a121f77 100644
--- a/rt/rs/extensions/search/src/test/java/org/apache/cxf/jaxrs/ext/search/jpa/JPATypedQueryVisitorTest.java
+++ b/rt/rs/extensions/search/src/test/java/org/apache/cxf/jaxrs/ext/search/jpa/JPATypedQueryVisitorTest.java
@@ -100,12 +100,12 @@
             if (emFactory != null) {
                 emFactory.close();
             }
-        } catch (Exception ex) {
+        } catch (Throwable ex) {
             ex.printStackTrace();    
         } finally {    
             try {
                 connection.createStatement().execute("SHUTDOWN");
-            } catch (Exception ex) {
+            } catch (Throwable ex) {
                 ex.printStackTrace();
             }
         }
