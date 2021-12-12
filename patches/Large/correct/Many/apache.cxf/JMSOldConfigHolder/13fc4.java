diff --git a/rt/transports/jms/src/main/java/org/apache/cxf/transport/jms/JMSOldConfigHolder.java b/rt/transports/jms/src/main/java/org/apache/cxf/transport/jms/JMSOldConfigHolder.java
index 7a4e675..8954744 100644
--- a/rt/transports/jms/src/main/java/org/apache/cxf/transport/jms/JMSOldConfigHolder.java
+++ b/rt/transports/jms/src/main/java/org/apache/cxf/transport/jms/JMSOldConfigHolder.java
@@ -263,7 +263,7 @@
         } catch (RuntimeException ex) {
             throw ex;
         } catch (Exception e) {
-            IOException e2 = new IOException(e.getMessage(), e);
+            IOException e2 = new IOException(e.getMessage());
             e2.initCause(e);
             throw e2;
         }
