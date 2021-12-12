diff --git a/core/camel-core/src/test/java/org/apache/camel/support/PropertyBindingSupportTest.java b/core/camel-core/src/test/java/org/apache/camel/support/PropertyBindingSupportTest.java
index 5c751df..968961f 100644
--- a/core/camel-core/src/test/java/org/apache/camel/support/PropertyBindingSupportTest.java
+++ b/core/camel-core/src/test/java/org/apache/camel/support/PropertyBindingSupportTest.java
@@ -318,7 +318,7 @@
             PropertyBindingSupport.bindProperty(context, foo, "bar.work", "#class:org.apache.camel.support.Company");
             fail("Should throw exception");
         } catch (PropertyBindingException e) {
-            assertIsInstanceOf(IllegalArgumentException.class, e.getCause());
+            assertIsInstanceOf(IllegalStateException.class, e.getCause());
         }
     }
 
