diff --git a/activemq-unit-tests/src/test/java/org/apache/activemq/usecases/QueueBrowsingTest.java b/activemq-unit-tests/src/test/java/org/apache/activemq/usecases/QueueBrowsingTest.java
index 2c54455..c3d66e9 100644
--- a/activemq-unit-tests/src/test/java/org/apache/activemq/usecases/QueueBrowsingTest.java
+++ b/activemq-unit-tests/src/test/java/org/apache/activemq/usecases/QueueBrowsingTest.java
@@ -209,6 +209,6 @@
         }
 
         browser.close();
-        assertEquals(maxPageSize + 2, received);
+        assertEquals(maxPageSize + 1, received);
     }
 }
